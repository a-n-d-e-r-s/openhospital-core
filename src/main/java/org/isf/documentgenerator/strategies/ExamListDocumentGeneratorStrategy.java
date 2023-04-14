package org.isf.documentgenerator.strategies;

import java.sql.Connection;
import java.util.HashMap;

import javax.sql.DataSource;

import org.isf.documentgenerator.strategies.common.DocumentGeneratorStrategyCommon;
import org.isf.generaldata.MessageBundle;
import org.isf.hospital.manager.HospitalBrowsingManager;
import org.isf.hospital.model.Hospital;
import org.isf.stat.dto.JasperReportResultDto;
import org.isf.utils.exception.OHReportException;
import org.isf.utils.exception.OHServiceException;
import org.isf.utils.exception.model.OHExceptionMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.sf.jasperreports.engine.JasperExportManager;


@Component
public class ExamListDocumentGeneratorStrategy implements DocumentGeneratorStrategy {

	private static final String RPT_BASE = "rpt_base";

	private static final String STAT_REPORTERROR_MSG = "angal.stat.reporterror.msg";

	private static final Logger LOGGER = LoggerFactory.getLogger(ExamListDocumentGeneratorStrategy.class);

	@Autowired
	private HospitalBrowsingManager hospitalManager;

	@Autowired
	private DataSource dataSource;

	@Override
	public boolean accept(int documentType) {
		return DocumentType.EXAM_LIST == documentType;
	}

	@Override
	public JasperReportResultDto generate(HashMap<String, Object> parameters) throws OHServiceException {

		try {
			Hospital hospital = hospitalManager.getHospital();

			parameters.put("hospital", hospital.getDescription());

			String jasperFileName = "examslist";
			String pdfFilename = DocumentGeneratorStrategyCommon.compilePDFFilename(RPT_BASE, jasperFileName, null, "pdf");
			Connection connection = dataSource.getConnection();
			JasperReportResultDto result = DocumentGeneratorStrategyCommon.generateJasperReport(connection,
							DocumentGeneratorStrategyCommon.compileJasperFilename(RPT_BASE, jasperFileName), pdfFilename, parameters);
			JasperExportManager.exportReportToPdfFile(result.getJasperPrint(), pdfFilename);
			return result;
		} catch (Exception e) {
			LOGGER.error("", e);
			throw new OHReportException(e, new OHExceptionMessage(MessageBundle.getMessage(STAT_REPORTERROR_MSG)));
		}
	}

}
