package fr.dm_terrassement.manager.ui.menu;

import java.awt.Dimension;
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
	
	@Override
	public void setupUI() {
		super.setupUI();
		this.setupFrameUI();
	}
	
	private void setupFrameUI(){
		this.setSize(new Dimension(400, 200));
		this.setResizable(false);
		
	}

}
