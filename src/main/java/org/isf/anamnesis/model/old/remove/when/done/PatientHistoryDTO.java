
package org.isf.anamnesis.model.old.remove.when.done;

/**
 *  
 * @author Mwithi
 * 
 * the model for Patient History
 *
 */
public class PatientHistoryDTO {
	
	private int pat_id;
	
	private boolean family_nothing;
	
	private boolean family_hypertension;
	
	private boolean family_drugAddiction;
	
	private boolean family_cardiovascular;
	
	private boolean family_infective;
	
	private boolean family_endocrinometabol;
	
	private boolean family_respiratory;
	
	private boolean family_cancer;
	
	private boolean family_orto;
	
	private boolean family_gyno;
	
	private boolean family_other;
	
	private String family_note;
	
	private boolean pat_closed_nothing;
	
	private boolean pat_closed_hypertension;
	
	private boolean pat_closed_drugAddiction;
	
	private boolean pat_closed_cardiovascular;
	
	private boolean pat_closed_infective;
	
	private boolean pat_closed_endocrinometabol;
	
	private boolean pat_closed_respiratory;
	
	private boolean pat_closed_cancer;
	
	private boolean pat_closed_orto;
	
	private boolean pat_closed_gyno;
	
	private boolean pat_closed_other;
	
	private String pat_closed_note;
	
	private boolean pat_open_nothing;
	
	private boolean pat_open_hypertension;
	
	private boolean pat_open_drugAddiction;
	
	private boolean pat_open_cardiovascular;
	
	private boolean pat_open_infective;
	
	private boolean pat_open_endocrinometabol;
	
	private boolean pat_open_respiratory;
	
	private boolean pat_open_cancer;
	
	private boolean pat_open_orto;
	
	private boolean pat_open_gyno;
	
	private boolean pat_open_other;
	
	private String pat_open_note;
	
	private String pat_surgery;
	
	private String pat_allergy;
	
	private String pat_therapy;
	
	private String pat_medicine;
	
	private String pat_note;
	
	private boolean phy_nutrition_normal;
	
	private String phy_nutrition_abnormal;
	
	private boolean phy_alvo_normal;
	
	private String phy_alvo_abnormal;
	
	private boolean phy_diuresis_normal;
	
	private String phy_diuresis_abnormal;
	
	private boolean phy_alcool;
	
	private boolean phy_smoke;
	
	private boolean phy_drug;
	
	private boolean phy_period_normal;
	
	private String phy_period_abnormal;
	
	private boolean phy_menopause;
	
	private int phy_menopause_years;
	
	private boolean phy_hrt_normal;
	
	private String phy_hrt_abnormal;
	
	private boolean phy_pregnancy;

	private int phy_pregnancy_number;
	
	private int phy_pregnancy_birth;
	
	private int phy_pregnancy_abort;

	/**
	 * 
	 */
	public PatientHistoryDTO() {
		/*
		 * Default Values
		 */
		this.family_nothing = true;
		this.pat_closed_nothing = true;
		this.pat_open_nothing = true;
		this.phy_nutrition_normal = true;
		this.phy_alvo_normal = true;
		this.phy_diuresis_normal = true;
		this.phy_period_normal = true;
		this.phy_hrt_normal = true;
	}
	
	/**
	 * 
	 */
	public PatientHistoryDTO(int patID) {
		
		this.pat_id = patID;
		/*
		 * Default Values
		 */
		this.family_nothing = true;
		this.pat_closed_nothing = true;
		this.pat_open_nothing = true;
		this.phy_nutrition_normal = true;
		this.phy_alvo_normal = true;
		this.phy_diuresis_normal = true;
		this.phy_period_normal = true;
		this.phy_hrt_normal = true;
	}
	
	public PatientHistoryDTO(PatientHistoryDTO patientHistory) {
		
		this.pat_id = patientHistory.getPat_id();
		this.family_nothing = patientHistory.isFamily_nothing();
		this.family_hypertension = patientHistory.isFamily_hypertension();
		this.family_drugAddiction = patientHistory.isFamily_drugAddiction();
		this.family_cardiovascular = patientHistory.isFamily_cardiovascular();
		this.family_infective = patientHistory.isFamily_infective();
		this.family_endocrinometabol = patientHistory.isFamily_endocrinometabol();
		this.family_respiratory = patientHistory.isFamily_respiratory();
		this.family_cancer = patientHistory.isFamily_cancer();
		this.family_orto = patientHistory.isFamily_orto();
		this.family_gyno = patientHistory.isFamily_gyno();
		this.family_note = patientHistory.getFamily_note();
		this.pat_closed_nothing = patientHistory.isPat_closed_nothing();
		this.pat_closed_hypertension = patientHistory.isPat_closed_hypertension();
		this.pat_closed_drugAddiction = patientHistory.isPat_closed_drugAddiction();
		this.pat_closed_cardiovascular = patientHistory.isPat_closed_cardiovascular();
		this.pat_closed_infective = patientHistory.isPat_closed_infective();
		this.pat_closed_endocrinometabol = patientHistory.isPat_closed_endocrinometabol();
		this.pat_closed_respiratory = patientHistory.isPat_closed_respiratory();
		this.pat_closed_cancer = patientHistory.isPat_closed_cancer();
		this.pat_closed_orto = patientHistory.isPat_closed_orto();
		this.pat_closed_gyno = patientHistory.isPat_closed_gyno();
		this.pat_closed_note = patientHistory.getPat_closed_note();
		this.pat_open_nothing = patientHistory.isPat_open_nothing();
		this.pat_open_hypertension = patientHistory.isPat_open_hypertension();
		this.pat_open_drugAddiction = patientHistory.isPat_open_drugAddiction();
		this.pat_open_cardiovascular = patientHistory.isPat_open_cardiovascular();
		this.pat_open_infective = patientHistory.isPat_open_infective();
		this.pat_open_endocrinometabol = patientHistory.isPat_open_endocrinometabol();
		this.pat_open_respiratory = patientHistory.isPat_open_respiratory();
		this.pat_open_cancer = patientHistory.isPat_open_cancer();
		this.pat_open_orto = patientHistory.isPat_open_orto();
		this.pat_open_gyno = patientHistory.isPat_open_gyno();
		this.pat_open_note = patientHistory.getPat_open_note();
		this.pat_surgery = patientHistory.getPat_surgery();
		this.pat_allergy = patientHistory.getPat_allergy();
		this.pat_therapy = patientHistory.getPat_therapy();
		this.pat_medicine = patientHistory.getPat_medicine();
		this.pat_note = patientHistory.getPat_note();
		this.phy_nutrition_normal = patientHistory.isPhy_nutrition_normal();
		this.phy_nutrition_abnormal = patientHistory.getPhy_nutrition_abnormal();
		this.phy_alvo_normal = patientHistory.isPhy_alvo_normal();
		this.phy_alvo_abnormal = patientHistory.getPhy_alvo_abnormal();
		this.phy_diuresis_normal = patientHistory.isPhy_diuresis_normal();
		this.phy_diuresis_abnormal = patientHistory.getPhy_diuresis_abnormal();
		this.phy_alcool = patientHistory.isPhy_alcool();
		this.phy_smoke = patientHistory.isPhy_smoke();
		this.phy_drug = patientHistory.isPhy_drug();
		this.phy_period_normal = patientHistory.isPhy_period_normal();
		this.phy_period_abnormal = patientHistory.getPhy_period_abnormal();
		this.phy_menopause = patientHistory.isPhy_menopause();
		this.phy_menopause_years = patientHistory.getPhy_menopause_years();
		this.phy_hrt_normal = patientHistory.isPhy_hrt_normal();
		this.phy_hrt_abnormal = patientHistory.getPhy_hrt_abnormal();
		this.phy_pregnancy = patientHistory.isPhy_pregnancy();
		this.phy_pregnancy_number = patientHistory.getPhy_pregnancy_number();
		this.phy_pregnancy_birth = patientHistory.getPhy_pregnancy_birth();
		this.phy_pregnancy_abort = patientHistory.getPhy_pregnancy_abort();
	}
	
	/**
	 * 
	 * @return this PatientHistory
	 */
	public PatientHistoryDTO getPatientHistory() {
		return this;
	}

	/**
	 * @return the pat_id
	 */
	public int getPat_id() {
		return pat_id;
	}

	/**
	 * @param pat_id the pat_id to set
	 */
	public void setPat_id(int pat_id) {
		this.pat_id = pat_id;
	}

	/**
	 * @return the family_nothing
	 */
	public boolean isFamily_nothing() {
		return family_nothing;
	}

	/**
	 * @param family_nothing the family_nothing to set
	 */
	public void setFamily_nothing(boolean family_nothing) {
		this.family_nothing = family_nothing;
	}

	/**
	 * @return the family_hypertension
	 */
	public boolean isFamily_hypertension() {
		return family_hypertension;
	}

	/**
	 * @param family_hypertension the family_hypertension to set
	 */
	public void setFamily_hypertension(boolean family_hypertension) {
		this.family_hypertension = family_hypertension;
	}

	/**
	 * @return the family_drugAddiction
	 */
	public boolean isFamily_drugAddiction() {
		return family_drugAddiction;
	}

	/**
	 * @param family_drugAddiction the family_drugAddiction to set
	 */
	public void setFamily_drugAddiction(boolean family_drugAddiction) {
		this.family_drugAddiction = family_drugAddiction;
	}

	/**
	 * @return the family_cardiovascular
	 */
	public boolean isFamily_cardiovascular() {
		return family_cardiovascular;
	}

	/**
	 * @param family_cardiovascular the family_cardiovascular to set
	 */
	public void setFamily_cardiovascular(boolean family_cardiovascular) {
		this.family_cardiovascular = family_cardiovascular;
	}

	/**
	 * @return the family_infective
	 */
	public boolean isFamily_infective() {
		return family_infective;
	}

	/**
	 * @param family_infective the family_infective to set
	 */
	public void setFamily_infective(boolean family_infective) {
		this.family_infective = family_infective;
	}

	/**
	 * @return the family_endocrinometabol
	 */
	public boolean isFamily_endocrinometabol() {
		return family_endocrinometabol;
	}

	/**
	 * @param family_endocrinometabol the family_endocrinometabol to set
	 */
	public void setFamily_endocrinometabol(boolean family_endocrinometabol) {
		this.family_endocrinometabol = family_endocrinometabol;
	}

	/**
	 * @return the family_respiratory
	 */
	public boolean isFamily_respiratory() {
		return family_respiratory;
	}

	/**
	 * @param family_respiratory the family_respiratory to set
	 */
	public void setFamily_respiratory(boolean family_respiratory) {
		this.family_respiratory = family_respiratory;
	}

	/**
	 * @return the family_cancer
	 */
	public boolean isFamily_cancer() {
		return family_cancer;
	}

	/**
	 * @param family_cancer the family_cancer to set
	 */
	public void setFamily_cancer(boolean family_cancer) {
		this.family_cancer = family_cancer;
	}

	/**
	 * @return the family_orto
	 */
	public boolean isFamily_orto() {
		return family_orto;
	}

	/**
	 * @param family_orto the family_orto to set
	 */
	public void setFamily_orto(boolean family_orto) {
		this.family_orto = family_orto;
	}

	/**
	 * @return the family_gyno
	 */
	public boolean isFamily_gyno() {
		return family_gyno;
	}

	/**
	 * @param family_gyno the family_gyno to set
	 */
	public void setFamily_gyno(boolean family_gyno) {
		this.family_gyno = family_gyno;
	}
	
	/**
	 * @return the family_other
	 */
	public boolean isFamily_other() {
		return family_other;
	}

	/**
	 * @param family_other the family_other to set
	 */
	public void setFamily_other(boolean family_other) {
		this.family_other = family_other;
	}

	/**
	 * @return the family_note
	 */
	public String getFamily_note() {
		return family_note;
	}

	/**
	 * @param family_note the family_note to set
	 */
	public void setFamily_note(String family_note) {
		this.family_note = family_note;
	}

	/**
	 * @return the pat_closed_nothing
	 */
	public boolean isPat_closed_nothing() {
		return pat_closed_nothing;
	}

	/**
	 * @param pat_closed_nothing the pat_closed_nothing to set
	 */
	public void setPat_closed_nothing(boolean pat_closed_nothing) {
		this.pat_closed_nothing = pat_closed_nothing;
	}

	/**
	 * @return the pat_closed_hypertension
	 */
	public boolean isPat_closed_hypertension() {
		return pat_closed_hypertension;
	}

	/**
	 * @param pat_closed_hypertension the pat_closed_hypertension to set
	 */
	public void setPat_closed_hypertension(boolean pat_closed_hypertension) {
		this.pat_closed_hypertension = pat_closed_hypertension;
	}

	/**
	 * @return the pat_closed_drugAddiction
	 */
	public boolean isPat_closed_drugAddiction() {
		return pat_closed_drugAddiction;
	}

	/**
	 * @param pat_closed_drugAddiction the pat_closed_drugAddiction to set
	 */
	public void setPat_closed_drugAddiction(boolean pat_closed_drugAddiction) {
		this.pat_closed_drugAddiction = pat_closed_drugAddiction;
	}

	/**
	 * @return the pat_closed_cardiovascular
	 */
	public boolean isPat_closed_cardiovascular() {
		return pat_closed_cardiovascular;
	}

	/**
	 * @param pat_closed_cardiovascular the pat_closed_cardiovascular to set
	 */
	public void setPat_closed_cardiovascular(boolean pat_closed_cardiovascular) {
		this.pat_closed_cardiovascular = pat_closed_cardiovascular;
	}

	/**
	 * @return the pat_closed_infective
	 */
	public boolean isPat_closed_infective() {
		return pat_closed_infective;
	}

	/**
	 * @param pat_closed_infective the pat_closed_infective to set
	 */
	public void setPat_closed_infective(boolean pat_closed_infective) {
		this.pat_closed_infective = pat_closed_infective;
	}

	/**
	 * @return the pat_closed_endocrinometabol
	 */
	public boolean isPat_closed_endocrinometabol() {
		return pat_closed_endocrinometabol;
	}

	/**
	 * @param pat_closed_endocrinometabol the pat_closed_endocrinometabol to set
	 */
	public void setPat_closed_endocrinometabol(boolean pat_closed_endocrinometabol) {
		this.pat_closed_endocrinometabol = pat_closed_endocrinometabol;
	}

	/**
	 * @return the pat_closed_respiratory
	 */
	public boolean isPat_closed_respiratory() {
		return pat_closed_respiratory;
	}

	/**
	 * @param pat_closed_respiratory the pat_closed_respiratory to set
	 */
	public void setPat_closed_respiratory(boolean pat_closed_respiratory) {
		this.pat_closed_respiratory = pat_closed_respiratory;
	}

	/**
	 * @return the pat_closed_cancer
	 */
	public boolean isPat_closed_cancer() {
		return pat_closed_cancer;
	}

	/**
	 * @param pat_closed_cancer the pat_closed_cancer to set
	 */
	public void setPat_closed_cancer(boolean pat_closed_cancer) {
		this.pat_closed_cancer = pat_closed_cancer;
	}

	/**
	 * @return the pat_closed_orto
	 */
	public boolean isPat_closed_orto() {
		return pat_closed_orto;
	}

	/**
	 * @param pat_closed_orto the pat_closed_orto to set
	 */
	public void setPat_closed_orto(boolean pat_closed_orto) {
		this.pat_closed_orto = pat_closed_orto;
	}

	/**
	 * @return the pat_closed_gyno
	 */
	public boolean isPat_closed_gyno() {
		return pat_closed_gyno;
	}

	/**
	 * @param pat_closed_gyno the pat_closed_gyno to set
	 */
	public void setPat_closed_gyno(boolean pat_closed_gyno) {
		this.pat_closed_gyno = pat_closed_gyno;
	}

	/**
	 * @return the pat_closed_other
	 */
	public boolean isPat_closed_other() {
		return pat_closed_other;
	}

	/**
	 * @param pat_closed_other the pat_closed_other to set
	 */
	public void setPat_closed_other(boolean pat_closed_other) {
		this.pat_closed_other = pat_closed_other;
	}

	/**
	 * @return the pat_closed_note
	 */
	public String getPat_closed_note() {
		return pat_closed_note;
	}

	/**
	 * @param pat_closed_note the pat_closed_note to set
	 */
	public void setPat_closed_note(String pat_closed_note) {
		this.pat_closed_note = pat_closed_note;
	}

	/**
	 * @return the pat_open_nothing
	 */
	public boolean isPat_open_nothing() {
		return pat_open_nothing;
	}

	/**
	 * @param pat_open_nothing the pat_open_nothing to set
	 */
	public void setPat_open_nothing(boolean pat_open_nothing) {
		this.pat_open_nothing = pat_open_nothing;
	}

	/**
	 * @return the pat_open_hypertension
	 */
	public boolean isPat_open_hypertension() {
		return pat_open_hypertension;
	}

	/**
	 * @param pat_open_hypertension the pat_open_hypertension to set
	 */
	public void setPat_open_hypertension(boolean pat_open_hypertension) {
		this.pat_open_hypertension = pat_open_hypertension;
	}

	/**
	 * @return the pat_open_drugAddiction
	 */
	public boolean isPat_open_drugAddiction() {
		return pat_open_drugAddiction;
	}

	/**
	 * @param pat_open_drugAddiction the pat_open_drugAddiction to set
	 */
	public void setPat_open_drugAddiction(boolean pat_open_drugAddiction) {
		this.pat_open_drugAddiction = pat_open_drugAddiction;
	}

	/**
	 * @return the pat_open_cardiovascular
	 */
	public boolean isPat_open_cardiovascular() {
		return pat_open_cardiovascular;
	}

	/**
	 * @param pat_open_cardiovascular the pat_open_cardiovascular to set
	 */
	public void setPat_open_cardiovascular(boolean pat_open_cardiovascular) {
		this.pat_open_cardiovascular = pat_open_cardiovascular;
	}

	/**
	 * @return the pat_open_infective
	 */
	public boolean isPat_open_infective() {
		return pat_open_infective;
	}

	/**
	 * @param pat_open_infective the pat_open_infective to set
	 */
	public void setPat_open_infective(boolean pat_open_infective) {
		this.pat_open_infective = pat_open_infective;
	}

	/**
	 * @return the pat_open_endocrinometabol
	 */
	public boolean isPat_open_endocrinometabol() {
		return pat_open_endocrinometabol;
	}

	/**
	 * @param pat_open_endocrinometabol the pat_open_endocrinometabol to set
	 */
	public void setPat_open_endocrinometabol(boolean pat_open_endocrinometabol) {
		this.pat_open_endocrinometabol = pat_open_endocrinometabol;
	}

	/**
	 * @return the pat_open_respiratory
	 */
	public boolean isPat_open_respiratory() {
		return pat_open_respiratory;
	}

	/**
	 * @param pat_open_respiratory the pat_open_respiratory to set
	 */
	public void setPat_open_respiratory(boolean pat_open_respiratory) {
		this.pat_open_respiratory = pat_open_respiratory;
	}

	/**
	 * @return the pat_open_cancer
	 */
	public boolean isPat_open_cancer() {
		return pat_open_cancer;
	}

	/**
	 * @param pat_open_cancer the pat_open_cancer to set
	 */
	public void setPat_open_cancer(boolean pat_open_cancer) {
		this.pat_open_cancer = pat_open_cancer;
	}

	/**
	 * @return the pat_open_orto
	 */
	public boolean isPat_open_orto() {
		return pat_open_orto;
	}

	/**
	 * @param pat_open_orto the pat_open_orto to set
	 */
	public void setPat_open_orto(boolean pat_open_orto) {
		this.pat_open_orto = pat_open_orto;
	}

	/**
	 * @return the pat_open_gyno
	 */
	public boolean isPat_open_gyno() {
		return pat_open_gyno;
	}

	/**
	 * @param pat_open_gyno the pat_open_gyno to set
	 */
	public void setPat_open_gyno(boolean pat_open_gyno) {
		this.pat_open_gyno = pat_open_gyno;
	}

	/**
	 * @return the pat_open_other
	 */
	public boolean isPat_open_other() {
		return pat_open_other;
	}

	/**
	 * @param pat_open_other the pat_open_other to set
	 */
	public void setPat_open_other(boolean pat_open_other) {
		this.pat_open_other = pat_open_other;
	}

	/**
	 * @return the pat_open_note
	 */
	public String getPat_open_note() {
		return pat_open_note;
	}

	/**
	 * @param pat_open_note the pat_open_note to set
	 */
	public void setPat_open_note(String pat_open_note) {
		this.pat_open_note = pat_open_note;
	}

	/**
	 * @return the pat_surgery
	 */
	public String getPat_surgery() {
		return pat_surgery;
	}

	/**
	 * @param pat_surgery the pat_surgery to set
	 */
	public void setPat_surgery(String pat_surgery) {
		this.pat_surgery = pat_surgery;
	}

	/**
	 * @return the pat_allergy
	 */
	public String getPat_allergy() {
		return pat_allergy;
	}

	/**
	 * @param pat_allergy the pat_allergy to set
	 */
	public void setPat_allergy(String pat_allergy) {
		this.pat_allergy = pat_allergy;
	}

	/**
	 * @return the pat_therapy
	 */
	public String getPat_therapy() {
		return pat_therapy;
	}

	/**
	 * @param pat_therapy the pat_therapy to set
	 */
	public void setPat_therapy(String pat_therapy) {
		this.pat_therapy = pat_therapy;
	}

	/**
	 * @return the pat_medicine
	 */
	public String getPat_medicine() {
		return pat_medicine;
	}

	/**
	 * @param pat_medicine the pat_medicine to set
	 */
	public void setPat_medicine(String pat_medicine) {
		this.pat_medicine = pat_medicine;
	}

	/**
	 * @return the pat_note
	 */
	public String getPat_note() {
		return pat_note;
	}

	/**
	 * @param pat_note the pat_note to set
	 */
	public void setPat_note(String pat_note) {
		this.pat_note = pat_note;
	}

	/**
	 * @return the phy_nutrition_normal
	 */
	public boolean isPhy_nutrition_normal() {
		return phy_nutrition_normal;
	}

	/**
	 * @param phy_nutrition_normal the phy_nutrition_normal to set
	 */
	public void setPhy_nutrition_normal(boolean phy_nutrition_normal) {
		this.phy_nutrition_normal = phy_nutrition_normal;
	}

	/**
	 * @return the phy_nutrition_abnormal
	 */
	public String getPhy_nutrition_abnormal() {
		return phy_nutrition_abnormal;
	}

	/**
	 * @param phy_nutrition_abnormal the phy_nutrition_abnormal to set
	 */
	public void setPhy_nutrition_abnormal(String phy_nutrition_abnormal) {
		this.phy_nutrition_abnormal = phy_nutrition_abnormal;
	}

	/**
	 * @return the phy_alvo_normal
	 */
	public boolean isPhy_alvo_normal() {
		return phy_alvo_normal;
	}

	/**
	 * @param phy_alvo_normal the phy_alvo_normal to set
	 */
	public void setPhy_alvo_normal(boolean phy_alvo_normal) {
		this.phy_alvo_normal = phy_alvo_normal;
	}

	/**
	 * @return the phy_alvo_abnormal
	 */
	public String getPhy_alvo_abnormal() {
		return phy_alvo_abnormal;
	}

	/**
	 * @param phy_alvo_abnormal the phy_alvo_abnormal to set
	 */
	public void setPhy_alvo_abnormal(String phy_alvo_abnormal) {
		this.phy_alvo_abnormal = phy_alvo_abnormal;
	}

	/**
	 * @return the phy_diuresis_normal
	 */
	public boolean isPhy_diuresis_normal() {
		return phy_diuresis_normal;
	}

	/**
	 * @param phy_diuresis_normal the phy_diuresis_normal to set
	 */
	public void setPhy_diuresis_normal(boolean phy_diuresis_normal) {
		this.phy_diuresis_normal = phy_diuresis_normal;
	}

	/**
	 * @return the phy_diuresis_abnormal
	 */
	public String getPhy_diuresis_abnormal() {
		return phy_diuresis_abnormal;
	}

	/**
	 * @param phy_diuresis_abnormal the phy_diuresis_abnormal to set
	 */
	public void setPhy_diuresis_abnormal(String phy_diuresis_abnormal) {
		this.phy_diuresis_abnormal = phy_diuresis_abnormal;
	}

	/**
	 * @return the phy_alcool
	 */
	public boolean isPhy_alcool() {
		return phy_alcool;
	}

	/**
	 * @param phy_alcool the phy_alcool to set
	 */
	public void setPhy_alcool(boolean phy_alcool) {
		this.phy_alcool = phy_alcool;
	}

	/**
	 * @return the phy_smoke
	 */
	public boolean isPhy_smoke() {
		return phy_smoke;
	}

	/**
	 * @param phy_smoke the phy_smoke to set
	 */
	public void setPhy_smoke(boolean phy_smoke) {
		this.phy_smoke = phy_smoke;
	}

	/**
	 * @return the phy_drug
	 */
	public boolean isPhy_drug() {
		return phy_drug;
	}

	/**
	 * @param phy_drug the phy_drug to set
	 */
	public void setPhy_drug(boolean phy_drug) {
		this.phy_drug = phy_drug;
	}

	/**
	 * @return the phy_period_normal
	 */
	public boolean isPhy_period_normal() {
		return phy_period_normal;
	}

	/**
	 * @param phy_period_normal the phy_period_normal to set
	 */
	public void setPhy_period_normal(boolean phy_period_normal) {
		this.phy_period_normal = phy_period_normal;
	}

	/**
	 * @return the phy_period_abnormal
	 */
	public String getPhy_period_abnormal() {
		return phy_period_abnormal;
	}

	/**
	 * @param phy_period_abnormal the phy_period_abnormal to set
	 */
	public void setPhy_period_abnormal(String phy_period_abnormal) {
		this.phy_period_abnormal = phy_period_abnormal;
	}

	/**
	 * @return the phy_menopause
	 */
	public boolean isPhy_menopause() {
		return phy_menopause;
	}

	/**
	 * @param phy_menopause the phy_menopause to set
	 */
	public void setPhy_menopause(boolean phy_menopause) {
		this.phy_menopause = phy_menopause;
	}

	/**
	 * @return the phy_menopause_years
	 */
	public int getPhy_menopause_years() {
		return phy_menopause_years;
	}

	/**
	 * @param phy_menopause_years the phy_menopause_years to set
	 */
	public void setPhy_menopause_years(int phy_menopause_years) {
		this.phy_menopause_years = phy_menopause_years;
	}

	/**
	 * @return the phy_hrt_normal
	 */
	public boolean isPhy_hrt_normal() {
		return phy_hrt_normal;
	}

	/**
	 * @param phy_hrt_normal the phy_hrt_normal to set
	 */
	public void setPhy_hrt_normal(boolean phy_hrt_normal) {
		this.phy_hrt_normal = phy_hrt_normal;
	}

	/**
	 * @return the phy_hrt_abnormal
	 */
	public String getPhy_hrt_abnormal() {
		return phy_hrt_abnormal;
	}

	/**
	 * @param phy_hrt_abnormal the phy_hrt_abnormal to set
	 */
	public void setPhy_hrt_abnormal(String phy_hrt_abnormal) {
		this.phy_hrt_abnormal = phy_hrt_abnormal;
	}

	/**
	 * @return the phy_pregnancy
	 */
	public boolean isPhy_pregnancy() {
		return phy_pregnancy;
	}

	/**
	 * @param phy_pregnancy the phy_pregnancy to set
	 */
	public void setPhy_pregnancy(boolean phy_pregnancy) {
		this.phy_pregnancy = phy_pregnancy;
	}

	/**
	 * @return the phy_pregnancy_number
	 */
	public int getPhy_pregnancy_number() {
		return phy_pregnancy_number;
	}

	/**
	 * @param phy_pregnancy_number the phy_pregnancy_number to set
	 */
	public void setPhy_pregnancy_number(int phy_pregnancy_number) {
		this.phy_pregnancy_number = phy_pregnancy_number;
	}

	/**
	 * @return the phy_pregnancy_birth
	 */
	public int getPhy_pregnancy_birth() {
		return phy_pregnancy_birth;
	}

	/**
	 * @param phy_pregnancy_birth the phy_pregnancy_birth to set
	 */
	public void setPhy_pregnancy_birth(int phy_pregnancy_birth) {
		this.phy_pregnancy_birth = phy_pregnancy_birth;
	}

	/**
	 * @return the phy_pregnancy_abort
	 */
	public int getPhy_pregnancy_abort() {
		return phy_pregnancy_abort;
	}

	/**
	 * @param phy_pregnancy_abort the phy_pregnancy_abort to set
	 */
	public void setPhy_pregnancy_abort(int phy_pregnancy_abort) {
		this.phy_pregnancy_abort = phy_pregnancy_abort;
	}
}
