package org.isf.anamnesis.model.old.remove.when.done;
///**
// * 
// */
//package org.isf.anamnesis.model.old;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.isf.utils.db.HybernateSessions;
//
///**
// * @author Mwithi
// *
// */
//public class AnamnesisOperations {
//
//	private static Session session;
//	
//	/**
//	 * 
//	 */
//	public AnamnesisOperations() {}
//	
//	/**
//	 * 
//	 * @param path - the PatientHistory to save
//	 */
//	public void saveOrUpdate(PatientHistoryDTO path) {
//		session =  HybernateSessions.getSession("h8.properties");
//		Transaction tx = session.beginTransaction();
//		try {
//			session.saveOrUpdate(path);
//			tx.commit();
//		} catch (Exception e) {
//			if (tx!=null) tx.rollback();
//			e.printStackTrace(); 
//		} 
//	}
//	
//	/**
//	 * 
//	 * @param patID
//	 * @return the PatientHistory for Patient nr patID
//	 */
//	public PatientHistoryDTO getByID(int patID) {
//		session =  HybernateSessions.getSession("h8.properties");
//		PatientHistoryDTO path = null;
//		Transaction tx = session.beginTransaction();
//		try {
//			path = (PatientHistoryDTO) session.get(PatientHistoryDTO.class, patID);
//			tx.commit();
//		} catch (Exception e) {
//			if (tx!=null) tx.rollback();
//			e.printStackTrace(); 
//		} 
//		return path;
//	}
//}
