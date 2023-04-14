package org.isf.documentgenerator;

import java.io.File;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;

import org.isf.documentgenerator.strategies.DocumentGeneratorStrategy;
import org.isf.utils.exception.OHServiceException;
import org.springframework.beans.factory.annotation.Autowired;

public class DocumentGeneratorStrategyContext {

	@Autowired
	private Set<DocumentGeneratorStrategy> strategies;

	public Optional<DocumentGeneratorStrategy> calculateStrategy(final int documentType) {
		return strategies.stream().filter(strategy -> strategy.accept(documentType)).findFirst();
	}

	public File generate(final DocumentGeneratorStrategy strategy, final HashMap<String, Object> parameters, boolean forceRegeneration) throws OHServiceException {
		return strategy.generate(parameters, forceRegeneration);
	}
}
