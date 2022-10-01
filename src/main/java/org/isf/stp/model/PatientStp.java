/*
 * Open Hospital (www.open-hospital.org)
 * Copyright © 2006-2021 Informatici Senza Frontiere (info@informaticisenzafrontiere.org)
 *
 * Open Hospital is a free and open source software for healthcare data management.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * https://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.isf.stp.model;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.isf.utils.db.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * ------------------------------------------
 * PatientHistory - model for a anamnesis
 * -----------------------------------------
 */
@Entity
@Table(name="OH_PATIENTSTP")
@EntityListeners(AuditingEntityListener.class) 
@AttributeOverrides({
    @AttributeOverride(name="createdBy", column=@Column(name="STP_CREATED_BY")),
    @AttributeOverride(name="createdDate", column=@Column(name="STP_CREATED_DATE")),
    @AttributeOverride(name="lastModifiedBy", column=@Column(name="STP_LAST_MODIFIED_BY")),
    @AttributeOverride(name="active", column=@Column(name="STP_ACTIVE")),
    @AttributeOverride(name="lastModifiedDate", column=@Column(name="STP_LAST_MODIFIED_DATE"))
})
public class PatientStp extends Auditable<String> implements Comparable<PatientStp> 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STP_PAT_ID")
	private int id;      
	
	@Column(name="STP_CODE")	
    private String stp;

	@Column(name = "STP_ISSUE_DATE")        
	private LocalDateTime issueDate;        

	@Column(name = "STP_RENEW_DATE")        
	private LocalDateTime renewDate;   	

	@Column(name = "STP_EXPIRY_DATE")        
	private LocalDateTime expiryDate;   

	@Column(name = "STP_IMMIGRATION_DATE")        
	private LocalDateTime immigrationDate;   
	
	@Column(name="STP_HOMELAND")	
    private String homeland;
	
	@Override
	public int compareTo(PatientStp obj) {
		return this.id - obj.getId();
	}

	
	public int getId() {
		return id;
	}


	
	public String getStp() {
		return stp;
	}


	
	public void setStp(String stp) {
		this.stp = stp;
	}


	
	public LocalDateTime getIssueDate() {
		return issueDate;
	}


	
	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}


	
	public LocalDateTime getRenewDate() {
		return renewDate;
	}


	
	public void setRenewDate(LocalDateTime renewDate) {
		this.renewDate = renewDate;
	}


	
	public LocalDateTime getExpiryDate() {
		return expiryDate;
	}


	
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiryDate = expiryDate;
	}


	
	public LocalDateTime getImmigrationDate() {
		return immigrationDate;
	}


	
	public void setImmigrationDate(LocalDateTime immigrationDate) {
		this.immigrationDate = immigrationDate;
	}


	
	public String getHomeland() {
		return homeland;
	}


	
	public void setHomeland(String homeland) {
		this.homeland = homeland;
	}


	
	public void setId(int id) {
		this.id = id;
	}

	
	
}
