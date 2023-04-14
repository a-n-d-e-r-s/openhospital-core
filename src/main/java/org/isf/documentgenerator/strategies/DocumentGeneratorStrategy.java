package org.isf.documentgenerator.strategies;

import java.io.File;
import java.util.HashMap;
import java.util.Optional;

import org.isf.utils.exception.OHServiceException;

public abstract class DocumentGeneratorStrategy {

	public abstract int getDocumentType();

	public abstract boolean accept(final int documentType);

	public File generate(HashMap<String, Object> parameters) throws OHServiceException {
		Optional<File> fileOpt = this.retrieveFromCache();
		if (fileOpt.isEmpty()) {
			return regenerate(parameters);
		}
		return fileOpt.get();
	}

	public abstract File regenerate(HashMap<String, Object> parameters) throws OHServiceException;

	public Optional<File> retrieveFromCache() throws OHServiceException {
		File file = new File(this.getDocumentType() + "");
		return Optional.ofNullable(file);
	}

}
