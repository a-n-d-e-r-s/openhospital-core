CREATE TABLE OH_PATIENTHISTORY (
	PAH_PAT_ID int NOT NULL ,
	PAH_FAM_NOTHING tinyint(1)  default 1 ,
	PAH_FAM_HYPER tinyint(1)  default 0 ,
	PAH_FAM_DRUGADD tinyint(1)  default 0 ,
	PAH_FAM_CARDIO tinyint(1)  default 0 ,
	PAH_FAM_INFECT tinyint(1)  default 0 ,
	PAH_FAM_ENDO tinyint(1)  default 0 ,
	PAH_FAM_RESP tinyint(1)  default 0 ,
	PAH_FAM_CANCER tinyint(1)  default 0 ,
	PAH_FAM_ORTO tinyint(1)  default 0 ,
	PAH_FAM_GYNO tinyint(1)  default 0 ,
	PAH_FAM_OTHER tinyint(1)  default 0 ,
	PAH_FAM_NOTE varchar(100) NULL ,
	PAH_PAT_CLO_NOTHING tinyint(1)  default 1 ,
	PAH_PAT_CLO_HYPER tinyint(1)  default 0 ,
	PAH_PAT_CLO_DRUGADD tinyint(1)  default 0 ,
	PAH_PAT_CLO_CARDIO tinyint(1)  default 0 ,
	PAH_PAT_CLO_INFECT tinyint(1)  default 0 ,
	PAH_PAT_CLO_ENDO tinyint(1)  default 0 ,
	PAH_PAT_CLO_RESP tinyint(1)  default 0 ,
	PAH_PAT_CLO_CANCER tinyint(1)  default 0 ,
	PAH_PAT_CLO_ORTO tinyint(1)  default 0 ,
	PAH_PAT_CLO_GYNO tinyint(1)  default 0 ,
	PAH_PAT_CLO_OTHER tinyint(1)  default 0 ,
	PAH_PAT_CLO_NOTE varchar(100) NULL ,
	PAH_PAT_OPN_NOTHING tinyint(1)  default 1 ,
	PAH_PAT_OPN_HYPER tinyint(1)  default 0 ,
	PAH_PAT_OPN_DRUGADD tinyint(1)  default 0 ,
	PAH_PAT_OPN_CARDIO tinyint(1)  default 0 ,
	PAH_PAT_OPN_INFECT tinyint(1)  default 0 ,
	PAH_PAT_OPN_ENDO tinyint(1)  default 0 ,
	PAH_PAT_OPN_RESP tinyint(1)  default 0 ,
	PAH_PAT_OPN_CANCER tinyint(1)  default 0 ,
	PAH_PAT_OPN_ORTO tinyint(1)  default 0 ,
	PAH_PAT_OPN_GYNO tinyint(1)  default 0 ,
	PAH_PAT_OPN_OTHER tinyint(1)  default 0 ,
	PAH_PAT_OPN_NOTE varchar(100) NULL ,
	PAH_PAT_SURGERY varchar(200) NULL ,
	PAH_PAT_ALLERGY varchar(100) NULL ,
	PAH_PAT_THERAPY	varchar(200) NULL ,
	PAH_PAT_MEDICINE varchar(200) NULL ,
	PAH_PAT_NOTE varchar(100) NULL ,
	PAH_PHY_NUTR_NOR tinyint(1)  default 1 ,
	PAH_PHY_NUTR_ABN varchar(30) NULL ,
	PAH_PHY_ALVO_NOR tinyint(1)  default 1 ,
	PAH_PHY_ALVO_ABN varchar(30) NULL ,
	PAH_PHY_DIURE_NOR tinyint(1)  NULL default 1 ,
	PAH_PHY_DIURE_ABN varchar(30) NULL ,
	PAH_PHY_ALCOOL tinyint(1)  default 0 ,
	PAH_PHY_SMOKE tinyint(1)  default 0 ,
	PAH_PHY_DRUG tinyint(1)  default 0 ,
	PAH_PHY_PERIOD_NOR tinyint(1)  default 1 ,
	PAH_PHY_PERIOD_ABN varchar(30) NULL ,
	PAH_PHY_MENOP tinyint(1)  default 0 ,
	PAH_PHY_MENOP_Y int  NULL ,
	PAH_PHY_HRT_NOR tinyint(1)  default 1 ,
	PAH_PHY_HRT_ABN varchar(30) NULL ,
	PAH_PHY_PREG tinyint(1)  default 0 ,
	PAH_PHY_PREG_N int  NULL ,
	PAH_PHY_PREG_BIRTH int  NULL ,
	PAH_PHY_PREG_ABORT int  NULL ,
	PAH_DATE_UPDATE	timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP ,
	
	INDEX ( PAH_PAT_ID  ) ,
	PRIMARY KEY ( PAH_PAT_ID )
) ENGINE=MyISAM;


--
-- CONSTRAINTS
--
ALTER TABLE OH_PATIENTHISTORY
	ADD CONSTRAINT FK_PATIENTHISTORY_PATIENT 
	FOREIGN KEY (PAH_PAT_ID) 
	REFERENCES PATIENT (PAT_ID)
	ON DELETE CASCADE
	ON UPDATE CASCADE;
