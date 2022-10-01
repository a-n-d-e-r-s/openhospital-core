///**
// * StpOperations.java - 05/dic/2012
// *
// * @author Mwithi
// */
//package org.isf.stp.model.delete.when.done;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.isf.stp.model.PatientStp;
//import org.isf.utils.db.HybernateSessions;
//import org.isf.utils.exception.OHException;
//
///**
// * @author Mwithi
// *
// */
//public class StpOperations {
//
//	private static Session session;
//
//	/**
//	 *
//	 */
//	public StpOperations() {}
//
//	/**
//	 *
//	 * @param stp - the PatientStp to save
//	 * @throws OHException
//	 */
//	public void saveOrUpdate(PatientStp stp) throws OHException {
//		session =  HybernateSessions.getSession("h8.properties");
//		Transaction tx = session.beginTransaction();
//		try {
//			session.saveOrUpdate(stp);
//			tx.commit();
//		} catch (Exception e) {
//			if (tx!=null) tx.rollback();
//			throw new OHException(null, e);
//		}
//	}
//
//	/**
//	 *
//	 * @param patID
//	 * @return the PatientStp for Patient nr patID
//	 * @throws OHException
//	 */
//	public PatientStp getByID(int patID) throws OHException {
//		session =  HybernateSessions.getSession("h8.properties");
//		PatientStp stp = null;
//		Transaction tx = session.beginTransaction();
//		try {
//			stp = (PatientStp) session.get(PatientStp.class, patID);
//			tx.commit();
//		} catch (Exception e) {
//			if (tx!=null) tx.rollback();
//			throw new OHException(null, e);
//		}
//		return stp;
//	}
//
//	/**
//	 *
//	 * @return the list of PatientStp
//	 * @throws OHException
//	 */
//	@SuppressWarnings("unchecked")
//	public ArrayList<PatientStp> findAll() throws OHException {
//		session =  HybernateSessions.getSession("h8.properties");
//		ArrayList<PatientStp> stpList = new ArrayList<PatientStp>();
//		Transaction tx = session.beginTransaction();
//		try {
//			stpList = (ArrayList<PatientStp>) session.createCriteria(PatientStp.class).list();
//			tx.commit();
//		} catch (Exception e) {
//			if (tx!=null) tx.rollback();
//			throw new OHException(null, e);
//		}
//		return stpList;
//	}
//
//	/**
//	 *
//	 * @return the HashMap<PAT_ID, STP> of PatientStp
//	 * @throws OHException
//	 */
//	public HashMap<Integer, String> getHashMap() throws OHException {
//		List<PatientStp> stpList = findAll();
//		HashMap<Integer, String> stpMap = new HashMap<Integer, String>();
//		for (PatientStp stp : stpList) {
//			stpMap.put(stp.getPatID(), stp.getStp());
//		}
//		return stpMap;
//	}
//}
