package fr.dm_terrassement.manager.ui;

import javax.swing.JFrame;

public abstract class JAbstractFrame extends JFrame{
	private static final long serialVersionUID = 4380973787000150288L;
	
	protected JControllerInterface controller;
	protected JAbstractPanel panel;
	
	public JAbstractFrame(String title){
		super(title);
	}
	
	public void call(JControllerInterface controller, JAbstractPanel panel){
		this.controller = controller;
		this.panel = panel;
		this.setupUI();
	}
	
	public void setupUI(){
		this.add(this.panel);
		
		this.pack();
		this.setVisible(true);
		this.controller.onInit();
	}
	
	public JAbstractPanel getFramePanel(){
		return this.panel;
	}
	
	
}
