package org.isf.documentgenerator;

import java.util.HashMap;
import java.util.Optional;
import java.util.Set;

import org.isf.documentgenerator.strategies.DocumentGeneratorStrategy;
import org.isf.stat.dto.JasperReportResultDto;
import org.isf.utils.exception.OHServiceException;
import org.springframework.beans.factory.annotation.Autowired;

public class DocumentGeneratorStrategyContext {

	@Autowired
	private Set<DocumentGeneratorStrategy> strategies;

	public Optional<DocumentGeneratorStrategy> calculateStrategy(int documentType) {
		return strategies.stream().filter(strategy -> strategy.accept(documentType)).findFirst();
	}

	public JasperReportResultDto generate(DocumentGeneratorStrategy strategy, HashMap<String, Object> parameters) throws OHServiceException {
		return strategy.generate(parameters);
	}
}
