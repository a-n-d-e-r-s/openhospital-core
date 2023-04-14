package org.isf.documentgenerator.strategies.common;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.isf.stat.dto.JasperReportResultDto;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class DocumentGeneratorStrategyCommon {

	public static String compilePDFFilename(String folderName, String jasperFileName, List<String> params, String ext) {
		StringBuilder sbFilename = new StringBuilder();
		sbFilename.append(folderName);
		sbFilename.append(File.separator);
		sbFilename.append("PDF");
		sbFilename.append(File.separator);
		sbFilename.append(jasperFileName);
		if (params != null) {
			params.forEach(p -> {
				sbFilename.append("_");
				sbFilename.append(p);
			});
		}
		sbFilename.append(".");
		sbFilename.append(ext);
		return sbFilename.toString();
	}

	public static String compileJasperFilename(String folderName, String jasperFileName) {
		StringBuilder sbFilename = new StringBuilder();
		sbFilename.append(folderName);
		sbFilename.append(File.separator);
		sbFilename.append(jasperFileName);
		sbFilename.append(".jasper");
		return sbFilename.toString();
	}

	public static JasperReportResultDto generateJasperReport(Connection connection, String jasperFilename, String filename, Map<String, Object> parameters)
					throws JRException, SQLException {
		File jasperFile = new File(jasperFilename);
		final JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperFile);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
		connection.close();
		return new JasperReportResultDto(jasperPrint, jasperFilename, filename);
	}
}
