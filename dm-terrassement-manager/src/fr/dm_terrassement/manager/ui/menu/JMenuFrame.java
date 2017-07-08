package fr.dm_terrassement.manager.ui.menu;

import fr.dm_terrassement.manager.ui.JAbstractFrame;
import fr.dm_terrassement.manager.ui.JControllerInterface;

public class JMenuFrame extends JAbstractFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -263172985124276297L;

	public JMenuFrame() {
		super("DM-Terrassement - Menu");
		JControllerInterface controller = new JMenuController(this);
		super.call(new JMenuController(this) , new JMenuPanel(controller));
		
	}

}
