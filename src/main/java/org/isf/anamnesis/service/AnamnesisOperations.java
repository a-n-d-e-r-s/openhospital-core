/**
 * 
 */
package org.isf.anamnesis.service;

import java.util.Optional;

import org.isf.anamnesis.model.PatientHistory;
import org.springframework.beans.factory.annotation.Autowired;

public class AnamnesisOperations {

	@Autowired
	private AnamnesisOperationsRepository repository;

	public boolean saveOrUpdate(PatientHistory path) {
		return repository.save(path) != null;
		
	}

	public Optional<PatientHistory>  getById(int patID) {
		return this.repository.findById(patID);
	}
}
