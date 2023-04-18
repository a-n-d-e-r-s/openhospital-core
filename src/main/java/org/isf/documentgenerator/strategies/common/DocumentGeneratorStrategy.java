package org.isf.documentgenerator.strategies.common;

import java.io.File;
import java.util.HashMap;
import java.util.Optional;

import org.isf.utils.exception.OHServiceException;

public abstract class DocumentGeneratorStrategy {

	public abstract int getDocumentType();

	public abstract boolean accept(final int documentType);

	public File generate(HashMap<String, Object> parameters, boolean forceRegeneration) throws OHServiceException {
		if (forceRegeneration) {
			return regenerate(parameters);
		}
		Optional<File> fileOpt = this.retrieveFromCache();
		if (fileOpt.isEmpty()) {
			return regenerate(parameters);
		}
		return fileOpt.get();
	}

	public abstract File regenerate(HashMap<String, Object> parameters) throws OHServiceException;

	protected Optional<File> retrieveFromCache() throws OHServiceException {
		File file = new File(this.getDocumentType() + "");
		return Optional.ofNullable(file);
	}

}
