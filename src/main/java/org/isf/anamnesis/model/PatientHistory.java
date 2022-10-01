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
@Table(name="OH_PATIENTHISTORY")
@EntityListeners(AuditingEntityListener.class) 
@AttributeOverrides({
    @AttributeOverride(name="createdBy", column=@Column(name="PAH_CREATED_BY")),
    @AttributeOverride(name="createdDate", column=@Column(name="PAH_CREATED_DATE")),
    @AttributeOverride(name="lastModifiedBy", column=@Column(name="PAH_LAST_MODIFIED_BY")),
    @AttributeOverride(name="active", column=@Column(name="PAH_ACTIVE")),
    @AttributeOverride(name="lastModifiedDate", column=@Column(name="PAH_LAST_MODIFIED_DATE"))
})
public class PatientHistory extends Auditable<String> implements Comparable<PatientHistory> 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAH_PAT_ID")
	private int id;                         

	@Column(name="PAH_FAM_NOTHING")
	private boolean familyNothing;
	
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
	private boolean pat_closed_nothing;
	
	@Column(name="PAH_PAT_CLO_HYPER")
	private boolean pat_closed_hypertension;
	
	@Column(name="PAH_PAT_CLO_DRUGADD")
	private boolean pat_closed_drugAddiction;
	
	@Column(name="PAH_PAT_CLO_CARDIO")
	private boolean pat_closed_cardiovascular;
	
	@Column(name="PAH_PAT_CLO_INFECT")
	private boolean pat_closed_infective;
	
	@Column(name="PAH_PAT_CLO_ENDO")
	private boolean pat_closed_endocrinometabol;
	
	@Column(name="PAH_PAT_CLO_RESP")
	private boolean pat_closed_respiratory;
	
	@Column(name="PAH_PAT_CLO_CANCER")
	private boolean pat_closed_cancer;
	
	@Column(name="PAH_PAT_CLO_ORTO")
	private boolean pat_closed_orto;
	
	@Column(name="PAH_PAT_CLO_GYNO")
	private boolean pat_closed_gyno;
	
	@Column(name="PAH_PAT_CLO_OTHER")
	private boolean pat_closed_other;
	
	@Column(name="PAH_PAT_CLO_NOTE")	
    private String pat_closed_note;
	
	@Column(name="PAH_PAT_OPN_NOTHING")
	private boolean pat_open_nothing;	
	
	@Column(name="PAH_PAT_OPN_HYPER")
	private boolean pat_open_hypertension;	
	
	@Column(name="PAH_PAT_OPN_DRUGADD")
	private boolean pat_open_drugAddiction;	
	
	@Column(name="PAH_PAT_OPN_CARDIO")
	private boolean pat_open_cardiovascular;	
	
	@Column(name="PAH_PAT_OPN_INFECT")
	private boolean pat_open_infective;	
	
	@Column(name="PAH_PAT_OPN_ENDO")
	private boolean pat_open_endocrinometabol;	
	
	@Column(name="PAH_PAT_OPN_RESP")
	private boolean pat_open_respiratory;	
	
	@Column(name="PAH_PAT_OPN_CANCER")
	private boolean pat_open_cancer;	
	
	@Column(name="PAH_PAT_OPN_ORTO")
	private boolean pat_open_orto;	
	
	@Column(name="PAH_PAT_OPN_GYNO")
	private boolean pat_open_gyno;	
	
	@Column(name="PAH_PAT_OPN_OTHER")
	private boolean pat_open_other;
	
	@Column(name="PAH_PAT_OPN_NOTE")	
    private String pat_open_note;	
	
	@Column(name="PAH_PAT_SURGERY")	
    private String pat_surgery;	
	
	@Column(name="PAH_PAT_ALLERGY")	
    private String pat_allergy;	
	
	@Column(name="PAH_PAT_THERAPY")	
    private String pat_therapy;	
	
	@Column(name="PAH_PAT_MEDICINE")	
    private String pat_medicine;	
	
	@Column(name="PAH_PAT_NOTE")	
    private String pat_note;
	
	@Column(name="PAH_PHY_NUTR_NOR")
	private boolean phy_nutrition_normal;
	
	@Column(name="PAH_PHY_NUTR_ABN")	
    private String phy_nutrition_abnormal;
	
	@Column(name="PAH_PHY_ALVO_NOR")
	private boolean phy_alvo_normal;
	
	@Column(name="PAH_PHY_ALVO_ABN")	
    private String phy_alvo_abnormal;
	
	@Column(name="PAH_PHY_DIURE_NOR")
	private boolean phy_diuresis_normal;
	
	@Column(name="PAH_PHY_DIURE_ABN")	
    private String phy_diuresis_abnormal;
	
	@Column(name="PAH_PHY_ALCOOL")
	private boolean phy_alcool;
	
	@Column(name="PAH_PHY_SMOKE")
	private boolean phy_smoke;
	
	@Column(name="PAH_PHY_DRUG")
	private boolean phy_drug;
	
	@Column(name="PAH_PHY_PERIOD_NOR")
	private boolean phy_period_normal;
	
	@Column(name="PAH_PHY_PERIOD_ABN")	
    private String phy_period_abnormal;
	
	@Column(name="PAH_PHY_MENOP")
	private boolean phy_menopause;
	
	@Column(name="PAH_PHY_MENOP_Y")
	private int phy_menopause_years;
	
	@Column(name="PAH_PHY_HRT_NOR")
	private boolean phy_hrt_normal;
	
	@Column(name="PAH_PHY_HRT_ABN")	
    private String phy_hrt_abnormal;
	
	@Column(name="PAH_PHY_PREG")
	private boolean phy_pregnancy;
	
	@Column(name="PAH_PHY_PREG_N")
	private int phy_pregnancy_number;
	
	@Column(name="PAH_PHY_PREG_BIRTH")
	private int phy_pregnancy_birth;
	
	@Column(name="PAH_PHY_PREG_ABORT")
	private int phy_pregnancy_abort;

	@Override
	public int compareTo(PatientHistory obj) {
		return this.id - obj.getId();
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public boolean isFamilyNothing() {
		return familyNothing;
	}

	
	public void setFamilyNothing(boolean familyNothing) {
		this.familyNothing = familyNothing;
	}

	
	public boolean isFamilyHypertension() {
		return familyHypertension;
	}

	
	public void setFamilyHypertension(boolean familyHypertension) {
		this.familyHypertension = familyHypertension;
	}

	
	public boolean isFamilyDrugAddiction() {
		return familyDrugAddiction;
	}

	
	public void setFamilyDrugAddiction(boolean familyDrugAddiction) {
		this.familyDrugAddiction = familyDrugAddiction;
	}

	
	public boolean isFamilyCardiovascular() {
		return familyCardiovascular;
	}

	
	public void setFamilyCardiovascular(boolean familyCardiovascular) {
		this.familyCardiovascular = familyCardiovascular;
	}

	
	public boolean isFamilyInfective() {
		return familyInfective;
	}

	
	public void setFamilyInfective(boolean familyInfective) {
		this.familyInfective = familyInfective;
	}

	
	public boolean isFamilyEndocrinometabol() {
		return familyEndocrinometabol;
	}

	
	public void setFamilyEndocrinometabol(boolean familyEndocrinometabol) {
		this.familyEndocrinometabol = familyEndocrinometabol;
	}

	
	public boolean isFamilyRespiratory() {
		return familyRespiratory;
	}

	
	public void setFamilyRespiratory(boolean familyRespiratory) {
		this.familyRespiratory = familyRespiratory;
	}

	
	public boolean isFamilyCancer() {
		return familyCancer;
	}

	
	public void setFamilyCancer(boolean familyCancer) {
		this.familyCancer = familyCancer;
	}

	
	public boolean isFamilyOrto() {
		return familyOrto;
	}

	
	public void setFamilyOrto(boolean familyOrto) {
		this.familyOrto = familyOrto;
	}

	
	public boolean isFamilyGyno() {
		return familyGyno;
	}

	
	public void setFamilyGyno(boolean familyGyno) {
		this.familyGyno = familyGyno;
	}

	
	public boolean isFamilyOther() {
		return familyOther;
	}

	
	public void setFamilyOther(boolean familyOther) {
		this.familyOther = familyOther;
	}

	
	public String getFamilyNote() {
		return familyNote;
	}

	
	public void setFamilyNote(String familyNote) {
		this.familyNote = familyNote;
	}

	
	public boolean isPat_closed_nothing() {
		return pat_closed_nothing;
	}

	
	public void setPat_closed_nothing(boolean pat_closed_nothing) {
		this.pat_closed_nothing = pat_closed_nothing;
	}

	
	public boolean isPat_closed_hypertension() {
		return pat_closed_hypertension;
	}

	
	public void setPat_closed_hypertension(boolean pat_closed_hypertension) {
		this.pat_closed_hypertension = pat_closed_hypertension;
	}

	
	public boolean isPat_closed_drugAddiction() {
		return pat_closed_drugAddiction;
	}

	
	public void setPat_closed_drugAddiction(boolean pat_closed_drugAddiction) {
		this.pat_closed_drugAddiction = pat_closed_drugAddiction;
	}

	
	public boolean isPat_closed_cardiovascular() {
		return pat_closed_cardiovascular;
	}

	
	public void setPat_closed_cardiovascular(boolean pat_closed_cardiovascular) {
		this.pat_closed_cardiovascular = pat_closed_cardiovascular;
	}

	
	public boolean isPat_closed_infective() {
		return pat_closed_infective;
	}

	
	public void setPat_closed_infective(boolean pat_closed_infective) {
		this.pat_closed_infective = pat_closed_infective;
	}

	
	public boolean isPat_closed_endocrinometabol() {
		return pat_closed_endocrinometabol;
	}

	
	public void setPat_closed_endocrinometabol(boolean pat_closed_endocrinometabol) {
		this.pat_closed_endocrinometabol = pat_closed_endocrinometabol;
	}

	
	public boolean isPat_closed_respiratory() {
		return pat_closed_respiratory;
	}

	
	public void setPat_closed_respiratory(boolean pat_closed_respiratory) {
		this.pat_closed_respiratory = pat_closed_respiratory;
	}

	
	public boolean isPat_closed_cancer() {
		return pat_closed_cancer;
	}

	
	public void setPat_closed_cancer(boolean pat_closed_cancer) {
		this.pat_closed_cancer = pat_closed_cancer;
	}

	
	public boolean isPat_closed_orto() {
		return pat_closed_orto;
	}

	
	public void setPat_closed_orto(boolean pat_closed_orto) {
		this.pat_closed_orto = pat_closed_orto;
	}

	
	public boolean isPat_closed_gyno() {
		return pat_closed_gyno;
	}

	
	public void setPat_closed_gyno(boolean pat_closed_gyno) {
		this.pat_closed_gyno = pat_closed_gyno;
	}

	
	public boolean isPat_closed_other() {
		return pat_closed_other;
	}

	
	public void setPat_closed_other(boolean pat_closed_other) {
		this.pat_closed_other = pat_closed_other;
	}

	
	public String getPat_closed_note() {
		return pat_closed_note;
	}

	
	public void setPat_closed_note(String pat_closed_note) {
		this.pat_closed_note = pat_closed_note;
	}

	
	public boolean isPat_open_nothing() {
		return pat_open_nothing;
	}

	
	public void setPat_open_nothing(boolean pat_open_nothing) {
		this.pat_open_nothing = pat_open_nothing;
	}

	
	public boolean isPat_open_hypertension() {
		return pat_open_hypertension;
	}

	
	public void setPat_open_hypertension(boolean pat_open_hypertension) {
		this.pat_open_hypertension = pat_open_hypertension;
	}

	
	public boolean isPat_open_drugAddiction() {
		return pat_open_drugAddiction;
	}

	
	public void setPat_open_drugAddiction(boolean pat_open_drugAddiction) {
		this.pat_open_drugAddiction = pat_open_drugAddiction;
	}

	
	public boolean isPat_open_cardiovascular() {
		return pat_open_cardiovascular;
	}

	
	public void setPat_open_cardiovascular(boolean pat_open_cardiovascular) {
		this.pat_open_cardiovascular = pat_open_cardiovascular;
	}

	
	public boolean isPat_open_infective() {
		return pat_open_infective;
	}

	
	public void setPat_open_infective(boolean pat_open_infective) {
		this.pat_open_infective = pat_open_infective;
	}

	
	public boolean isPat_open_endocrinometabol() {
		return pat_open_endocrinometabol;
	}

	
	public void setPat_open_endocrinometabol(boolean pat_open_endocrinometabol) {
		this.pat_open_endocrinometabol = pat_open_endocrinometabol;
	}

	
	public boolean isPat_open_respiratory() {
		return pat_open_respiratory;
	}

	
	public void setPat_open_respiratory(boolean pat_open_respiratory) {
		this.pat_open_respiratory = pat_open_respiratory;
	}

	
	public boolean isPat_open_cancer() {
		return pat_open_cancer;
	}

	
	public void setPat_open_cancer(boolean pat_open_cancer) {
		this.pat_open_cancer = pat_open_cancer;
	}

	
	public boolean isPat_open_orto() {
		return pat_open_orto;
	}

	
	public void setPat_open_orto(boolean pat_open_orto) {
		this.pat_open_orto = pat_open_orto;
	}

	
	public boolean isPat_open_gyno() {
		return pat_open_gyno;
	}

	
	public void setPat_open_gyno(boolean pat_open_gyno) {
		this.pat_open_gyno = pat_open_gyno;
	}

	
	public boolean isPat_open_other() {
		return pat_open_other;
	}

	
	public void setPat_open_other(boolean pat_open_other) {
		this.pat_open_other = pat_open_other;
	}

	
	public String getPat_open_note() {
		return pat_open_note;
	}

	
	public void setPat_open_note(String pat_open_note) {
		this.pat_open_note = pat_open_note;
	}

	
	public String getPat_surgery() {
		return pat_surgery;
	}

	
	public void setPat_surgery(String pat_surgery) {
		this.pat_surgery = pat_surgery;
	}

	
	public String getPat_allergy() {
		return pat_allergy;
	}

	
	public void setPat_allergy(String pat_allergy) {
		this.pat_allergy = pat_allergy;
	}

	
	public String getPat_therapy() {
		return pat_therapy;
	}

	
	public void setPat_therapy(String pat_therapy) {
		this.pat_therapy = pat_therapy;
	}

	
	public String getPat_medicine() {
		return pat_medicine;
	}

	
	public void setPat_medicine(String pat_medicine) {
		this.pat_medicine = pat_medicine;
	}

	
	public String getPat_note() {
		return pat_note;
	}

	
	public void setPat_note(String pat_note) {
		this.pat_note = pat_note;
	}

	
	public boolean isPhy_nutrition_normal() {
		return phy_nutrition_normal;
	}

	
	public void setPhy_nutrition_normal(boolean phy_nutrition_normal) {
		this.phy_nutrition_normal = phy_nutrition_normal;
	}

	
	public String getPhy_nutrition_abnormal() {
		return phy_nutrition_abnormal;
	}

	
	public void setPhy_nutrition_abnormal(String phy_nutrition_abnormal) {
		this.phy_nutrition_abnormal = phy_nutrition_abnormal;
	}

	
	public boolean isPhy_alvo_normal() {
		return phy_alvo_normal;
	}

	
	public void setPhy_alvo_normal(boolean phy_alvo_normal) {
		this.phy_alvo_normal = phy_alvo_normal;
	}

	
	public String getPhy_alvo_abnormal() {
		return phy_alvo_abnormal;
	}

	
	public void setPhy_alvo_abnormal(String phy_alvo_abnormal) {
		this.phy_alvo_abnormal = phy_alvo_abnormal;
	}

	
	public boolean isPhy_diuresis_normal() {
		return phy_diuresis_normal;
	}

	
	public void setPhy_diuresis_normal(boolean phy_diuresis_normal) {
		this.phy_diuresis_normal = phy_diuresis_normal;
	}

	
	public String getPhy_diuresis_abnormal() {
		return phy_diuresis_abnormal;
	}

	
	public void setPhy_diuresis_abnormal(String phy_diuresis_abnormal) {
		this.phy_diuresis_abnormal = phy_diuresis_abnormal;
	}

	
	public boolean isPhy_alcool() {
		return phy_alcool;
	}

	
	public void setPhy_alcool(boolean phy_alcool) {
		this.phy_alcool = phy_alcool;
	}

	
	public boolean isPhy_smoke() {
		return phy_smoke;
	}

	
	public void setPhy_smoke(boolean phy_smoke) {
		this.phy_smoke = phy_smoke;
	}

	
	public boolean isPhy_drug() {
		return phy_drug;
	}

	
	public void setPhy_drug(boolean phy_drug) {
		this.phy_drug = phy_drug;
	}

	
	public boolean isPhy_period_normal() {
		return phy_period_normal;
	}

	
	public void setPhy_period_normal(boolean phy_period_normal) {
		this.phy_period_normal = phy_period_normal;
	}

	
	public String getPhy_period_abnormal() {
		return phy_period_abnormal;
	}

	
	public void setPhy_period_abnormal(String phy_period_abnormal) {
		this.phy_period_abnormal = phy_period_abnormal;
	}

	
	public boolean isPhy_menopause() {
		return phy_menopause;
	}

	
	public void setPhy_menopause(boolean phy_menopause) {
		this.phy_menopause = phy_menopause;
	}

	
	public int getPhy_menopause_years() {
		return phy_menopause_years;
	}

	
	public void setPhy_menopause_years(int phy_menopause_years) {
		this.phy_menopause_years = phy_menopause_years;
	}

	
	public boolean isPhy_hrt_normal() {
		return phy_hrt_normal;
	}

	
	public void setPhy_hrt_normal(boolean phy_hrt_normal) {
		this.phy_hrt_normal = phy_hrt_normal;
	}

	
	public String getPhy_hrt_abnormal() {
		return phy_hrt_abnormal;
	}

	
	public void setPhy_hrt_abnormal(String phy_hrt_abnormal) {
		this.phy_hrt_abnormal = phy_hrt_abnormal;
	}

	
	public boolean isPhy_pregnancy() {
		return phy_pregnancy;
	}

	
	public void setPhy_pregnancy(boolean phy_pregnancy) {
		this.phy_pregnancy = phy_pregnancy;
	}

	
	public int getPhy_pregnancy_number() {
		return phy_pregnancy_number;
	}

	
	public void setPhy_pregnancy_number(int phy_pregnancy_number) {
		this.phy_pregnancy_number = phy_pregnancy_number;
	}

	
	public int getPhy_pregnancy_birth() {
		return phy_pregnancy_birth;
	}

	
	public void setPhy_pregnancy_birth(int phy_pregnancy_birth) {
		this.phy_pregnancy_birth = phy_pregnancy_birth;
	}

	
	public int getPhy_pregnancy_abort() {
		return phy_pregnancy_abort;
	}

	
	public void setPhy_pregnancy_abort(int phy_pregnancy_abort) {
		this.phy_pregnancy_abort = phy_pregnancy_abort;
	}
	
}
