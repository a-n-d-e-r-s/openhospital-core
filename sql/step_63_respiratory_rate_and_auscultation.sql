ALTER TABLE PATIENTEXAMINATION 
	ADD COLUMN PEX_RR INT(11) NULL DEFAULT NULL COMMENT 'Respiratory rate in bpm' AFTER PEX_BOWEL_DESC,
	ADD COLUMN PEX_AUSC VARCHAR(50) NULL DEFAULT NULL COMMENT 'Auscultation: normal, wheezes, rhonchi, crackles, stridor, bronchial' AFTER PEX_RR;
	