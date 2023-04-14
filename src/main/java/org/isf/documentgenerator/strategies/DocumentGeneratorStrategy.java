package org.isf.documentgenerator.strategies;

import java.util.HashMap;

import org.isf.stat.dto.JasperReportResultDto;
import org.isf.utils.exception.OHServiceException;

public interface DocumentGeneratorStrategy {

	public boolean accept(final int documentType);

	public JasperReportResultDto generate(HashMap<String, Object> parameters) throws OHServiceException;

}
