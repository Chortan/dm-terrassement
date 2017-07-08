package fr.dm_terrassement.manager.ui;

import javax.swing.JPanel;

public class JAbstractPanel extends JPanel{
	private static final long serialVersionUID = -3456326981674719710L;
	
	protected JControllerInterface controller;
	
	public JAbstractPanel(JControllerInterface controller){
		this.controller = controller;
	}
}
