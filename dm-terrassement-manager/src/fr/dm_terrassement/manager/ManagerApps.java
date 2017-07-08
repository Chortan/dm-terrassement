package fr.dm_terrassement.manager;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import fr.dm_terrassement.manager.ui.menu.JMenuFrame;

public class ManagerApps {
	private final static Logger Log = Logger.getLogger(ManagerApps.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Log.debug("Start application");
		new JMenuFrame();
	}
}
