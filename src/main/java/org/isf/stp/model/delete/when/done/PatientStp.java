/**
 * PatientStp.java - 05/dic/2012
 * 
 * @author Mwithi
 */
package org.isf.stp.model.delete.when.done;

import java.util.Date;

/**
 * @author Mwithi
 *
 */
public class PatientStp {

	private int patID;
	private String stp;
	private Date issueDate;
	private Date renewDate;
	private Date expiryDate;
	private Date immigrationDate;
	private String homeland;
	
	/**
	 * 
	 */
	public PatientStp() {
	}

	/**
	 * @return the patID
	 */
	public int getPatID() {
		return patID;
	}

	/**
	 * @param patID the patID to set
	 */
	public void setPatID(int patID) {
		this.patID = patID;
	}

	/**
	 * @return the stp
	 */
	public String getStp() {
		return stp;
	}

	/**
	 * @param stp the stp to set
	 */
	public void setStp(String stp) {
		this.stp = stp;
	}

	/**
	 * @return the issueDate
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the renewDate
	 */
	public Date getRenewDate() {
		return renewDate;
	}

	/**
	 * @param renewDate the renewDate to set
	 */
	public void setRenewDate(Date renewDate) {
		this.renewDate = renewDate;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the immigrationDate
	 */
	public Date getImmigrationDate() {
		return immigrationDate;
	}

	/**
	 * @param immigrationDate the immigrationDate to set
	 */
	public void setImmigrationDate(Date immigrationDate) {
		this.immigrationDate = immigrationDate;
	}

	/**
	 * @return the homeland
	 */
	public String getHomeland() {
		return homeland;
	}

	/**
	 * @param homeland the homeland to set
	 */
	public void setHomeland(String homeland) {
		this.homeland = homeland;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
