-- Anamnesis Button
INSERT INTO OH_MENUITEM VALUES ('btnadmpatnewanamnesis','angal.patient.anamnesis','angal.patient.anamnesis','x','A','btnadmnew','none','N', 1);
INSERT INTO OH_MENUITEM VALUES ('btnadmpateditanamnesis','angal.patient.anamnesis','angal.patient.anamnesis','x','A','btnadmedit','none','N', 1);
INSERT INTO OH_MENUITEM VALUES ('btnadmanamnesis','angal.admission.anamnesis','angal.admission.anamnesis','x','A','admission','none','N', 1);
INSERT INTO OH_MENUITEM VALUES ('btnopdnewanamnesis','angal.opd.anamnesis','angal.opd.anamnesis','x','A','btnopdnew','none','N', 1);
INSERT INTO OH_MENUITEM VALUES ('btnopdeditanamnesis','angal.opd.anamnesis','angal.opd.anamnesis','x','A','btnopdedit','none','N', 1);

-- Examination Button
INSERT INTO OH_MENUITEM VALUES ('btnopdnewexamination','angal.opd.examination','angal.opd.examination','x','A','btnopdnew','none','N', 1);
INSERT INTO OH_MENUITEM VALUES ('btnopdeditexamination','angal.opd.examination','angal.opd.examination','x','A','btnopdedit','none','N', 1);

-- Admin activation (default: btnadmpatnewanamnesis, btnadmpateditanamnesis, btnopdnewxamination, btnopdeditxamination)
INSERT INTO OH_GROUPMENU (GM_UG_ID_A, GM_MNI_ID_A, GM_ACTIVE)  VALUES  ('admin','btnadmanamnesis','N');
INSERT INTO OH_GROUPMENU (GM_UG_ID_A, GM_MNI_ID_A, GM_ACTIVE)  VALUES  ('admin','btnadmpatnewanamnesis','Y');
INSERT INTO OH_GROUPMENU (GM_UG_ID_A, GM_MNI_ID_A, GM_ACTIVE)  VALUES  ('admin','btnadmpateditanamnesis','Y');
INSERT INTO OH_GROUPMENU (GM_UG_ID_A, GM_MNI_ID_A, GM_ACTIVE)  VALUES  ('admin','btnopdnewanamnesis','N');
INSERT INTO OH_GROUPMENU (GM_UG_ID_A, GM_MNI_ID_A, GM_ACTIVE)  VALUES  ('admin','btnopdeditanamnesis','N');
INSERT INTO OH_GROUPMENU (GM_UG_ID_A, GM_MNI_ID_A, GM_ACTIVE)  VALUES  ('admin','btnopdnewexamination','Y');
INSERT INTO OH_GROUPMENU (GM_UG_ID_A, GM_MNI_ID_A, GM_ACTIVE)  VALUES  ('admin','btnopdeditexamination','Y');