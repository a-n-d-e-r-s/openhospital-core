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
package org.isf.anamnesis.model;

import javax.persistence.AttributeOverride;
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
 * Patient History Type - model for the patient history type entity
 * ------------------------------------------
 */
@Entity
@Table(name="OH_PATIENTHISTORY")
@EntityListeners(AuditingEntityListener.class)
@AttributeOverride(name = "createdBy", column = @Column(name = "PAH_CREATED_BY"))
@AttributeOverride(name = "createdDate", column = @Column(name = "PAH_CREATED_DATE"))
@AttributeOverride(name = "lastModifiedBy", column = @Column(name = "PAH_LAST_MODIFIED_BY"))
@AttributeOverride(name = "active", column = @Column(name = "PAH_ACTIVE"))
@AttributeOverride(name = "lastModifiedDate", column = @Column(name = "PAH_LAST_MODIFIED_DATE"))
public class PatientHistory extends Auditable<String> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAH_PAT_ID")
	private int id;    
	
	
	@Column(name="PAH_FAM_HYPER")
	private boolean familyHypertension;
	
	
	@Column(name="PAH_FAM_DRUGADD")
	private boolean familyDrugAddiction;
	
	
	@Column(name="PAH_FAM_CARDIO")
	private boolean familyCardiovascular;
	
	
	@Column(name="PAH_FAM_INFECT")
	private boolean familyInfective;
	
	
	@Column(name="PAH_FAM_ENDO")
	private boolean familyEndocrinometabol;
	
	
	@Column(name="PAH_FAM_RESP")
	private boolean familyRespiratory;
	
	
	@Column(name="PAH_FAM_CANCER")
	private boolean familyCancer;
	
	
	@Column(name="PAH_FAM_ORTO")
	private boolean familyOrto;
	
	
	@Column(name="PAH_FAM_GYNO")
	private boolean familyGyno;
	
	
	@Column(name="PAH_FAM_OTHER")
	private boolean familyOther;
	
	@Column(name="PAH_FAM_NOTE")
	private String familyNote;
	
	
	@Column(name="PAH_PAT_CLO_NOTHING")
	private boolean patClosedNothing;	
	
	
	@Column(name="PAH_PAT_CLO_HYPER")
	private boolean patClosedHypertension;	
	
	
	@Column(name="PAH_PAT_CLO_DRUGADD")
	private boolean patClosedDrugAddiction;	
	
	
	@Column(name="PAH_PAT_CLO_CARDIO")
	private boolean patClosedCardiovascular;	
	
	
	@Column(name="PAH_PAT_CLO_INFECT")
	private boolean patClosedInfective;	
	
	
	@Column(name="PAH_PAT_CLO_ENDO")
	private boolean patClosedEndocrinometabol;	
	
	
	@Column(name="PAH_PAT_CLO_RESP")
	private boolean patClosedRespiratory;	
	
	
	@Column(name="PAH_PAT_CLO_CANCER")
	private boolean patClosedCancer;	
	
	
	@Column(name="PAH_PAT_CLO_ORTO")
	private boolean patClosedOrto;	
	
	
	@Column(name="PAH_PAT_CLO_GYNO")
	private boolean patClosedGyno;	
	
	
	@Column(name="PAH_PAT_CLO_OTHER")
	private boolean patClosedOther;
	
	@Column(name="PAH_PAT_CLO_NOTE")
	private String patClosedNote;
	
	
	@Column(name="PAH_PAT_OPN_NOTHING")
	private boolean patOpenNothing;	
	
	
	@Column(name="PAH_PAT_OPN_HYPER")
	private boolean patOpenHypertension;	
	
	
	@Column(name="PAH_PAT_OPN_DRUGADD")
	private boolean patOpenDrugAddiction;	
	
	
	@Column(name="PAH_PAT_OPN_CARDIO")
	private boolean patOpenCardiovascular;	
	
	
	@Column(name="PAH_PAT_OPN_INFECT")
	private boolean patOpenInfective;	
	
	
	@Column(name="PAH_PAT_OPN_ENDO")
	private boolean patOpenEndocrinometabol;	
	
	
	@Column(name="PAH_PAT_OPN_RESP")
	private boolean patOpenRespiratory;	
	
	
	@Column(name="PAH_PAT_OPN_CANCER")
	private boolean patOpenCancer;	
	
	
	@Column(name="PAH_PAT_OPN_ORTO")
	private boolean patOpenOrto;	
	
	
	@Column(name="PAH_PAT_OPN_GYNO")
	private boolean patOpenGyno;	
	
	
	@Column(name="PAH_PAT_OPN_OTHER")
	private boolean pat_open_other;
	
	@Column(name="PAH_PAT_OPN_NOTE")
	private String patOpenNote;
	
	
	@Column(name="PAH_PAT_SURGERY")
	private String patSurgery;
	
	
	@Column(name="PAH_PAT_ALLERGY")
	private String patAllergy;
	
	
	@Column(name="PAH_PAT_THERAPY")
	private String patTherapy;
	
	
	@Column(name="PAH_PAT_MEDICINE")
	private String patMedicine;
	
	
	@Column(name="PAH_PAT_CLO_NOTE")
	private String patNote;
	
	
	@Column(name="PAH_PHY_NUTR_NOR")
	private boolean phyNutritionNormal;	
	
	@Column(name="PAH_PHY_NUTR_ABN")
	private String phyNutritionAbnormal;
	
	
	@Column(name="PAH_PHY_ALVO_NOR")
	private boolean phyAlvoNormal;	
	
	@Column(name="PAH_PHY_ALVO_ABN")
	private String phyAlvoAbnormal;
	
	
	@Column(name="PAH_PHY_DIURE_NOR")
	private boolean phyDiuresisNormal;	
	
	@Column(name="PAH_PHY_DIURE_ABN")
	private String phyDiuresisAbnormal;
	
	
	@Column(name="PAH_PHY_ALCOOL")
	private boolean phyAlcool;	
	
	
	@Column(name="PAH_PHY_SMOKE")
	private boolean phySmoke;	
	
	
	@Column(name="PAH_PHY_DRUG")
	private boolean phyDrug;	
	
	
	@Column(name="PAH_PHY_PERIOD_NOR")
	private boolean phyPeriodNormal;
	
	@Column(name="PAH_PHY_PERIOD_ABN")
	private String phyPeriodAbnormal;
	
	
	@Column(name="PAH_PHY_MENOP")
	private boolean phyMenopause;
	
	
	@Column(name = "PAH_PHY_MENOP_Y")
	private int phyMenopauseYears;  
	
	
	@Column(name="PAH_PHY_HRT_NOR")
	private boolean phyHrtNormal;
	
	@Column(name="PAH_PHY_HRT_ABN")
	private String phyHrtAbnormal;
	
	@Column(name="PAH_PHY_PREG")
	private boolean phyPregnancy;
	
	
	@Column(name = "PAH_PHY_PREG_N")
	private int phyPregnancyNumber;  
	
	
	@Column(name = "PAH_PHY_PREG_BIRTH")
	private int phyPregnancyBirth;  
	
	
	@Column(name = "PAH_PHY_PREG_ABORT")
	private int phyPregnancyAbort;  
	
}
