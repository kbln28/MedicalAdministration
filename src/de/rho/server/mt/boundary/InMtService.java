package de.rho.server.mt.boundary;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import de.rho.server.mt.entity.MedTreatment;

/**
 * @author Heiko, Roger
 * @version 1.0
 * 
 * Methodenvorlage fuer MtService
 *
 */

public interface InMtService  extends Remote {

	
	/**************/
	/**** CRUD ****/
	/**************/
		
		// -- For MtService.createMtDB
		public void createMtInDB(MedTreatment mt) throws RemoteException;
		
		// -- For MtService.readMtDB
		public MedTreatment readMtInDB(int id) throws RemoteException;
		
		// -- For MtService.updateMtDB
		public void updateMtInDB(MedTreatment mt) throws RemoteException;
				
		
	/**************/
	/**** List ****/
	/**************/
		
		// -- For MtServiceImpl.getMtListFromDB
		public ArrayList<MedTreatment> getMtListFromDB(int patientid) throws RemoteException;
		
}
