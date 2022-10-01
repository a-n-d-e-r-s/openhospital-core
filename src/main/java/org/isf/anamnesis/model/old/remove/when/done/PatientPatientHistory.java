/**
 * 
 */
package org.isf.anamnesis.model.old.remove.when.done;

import org.isf.patient.model.Patient;


/**
 * @author Mwithi
 *
 */
public class PatientPatientHistory { // extends PatientHistory

	private PatientHistoryDTO patientHistory;
	
	private Patient patient;

	/**
	 * @param patientHistory
	 * @param patient
	 */
	public PatientPatientHistory(PatientHistoryDTO patientHistory, Patient patient) {
		super();
		this.patientHistory = patientHistory;
		this.patient = patient;
	}

	/**
	 * @return the patientHistory
	 */
	public PatientHistoryDTO getPatientHistory() {
		return patientHistory;
	}

	/**
	 * @param patientHistory the patientHistory to set
	 */
	public void setPatientHistory(PatientHistoryDTO patientHistory) {
		this.patientHistory = patientHistory;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
