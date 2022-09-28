package org.isf.anamnesis.service;

import org.isf.anamnesis.model.PatientHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnamnesisOperationsRepository  extends JpaRepository<PatientHistory, Integer>{

}
