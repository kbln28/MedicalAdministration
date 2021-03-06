package de.rho.server.dao.persistence;

import java.io.File;

import de.rho.server.dao.boundary.InDaoToFile;

/**
 * @author Heiko, Roger
 * @version 1.4
 * Dateizugriffe
 *   
 */

public class DaoToFile implements InDaoToFile{

	@Override
	public String locateFile() {			
		
		String filetype = (".csv");
		String filename = ("yourdata"+filetype);
		String pathtofile = (""+filename); // hier koennte auch ein vollstaendiger Pfad stehen c:/Users/heiko/Documents/GitHub/MedicalAdministration/
		 
		return pathtofile;
	}

	@Override
	public boolean permitFileGeneration() {
		
		File file = new File (locateFile()); //nutzt Rueckgabewert (pathtofile) von locateFile()
		
		if (file.exists()) {
			System.out.println("Datei vorhanden. Erstellen-Status: 'false'. (Nein)");
			return false;
		}
		
		else {
			System.out.println("Datei nicht vorhanden. Erstellen-Status: 'true'. (Ja) Datei kann erstellt werden.");
			return true;			 
		}
	}
}
