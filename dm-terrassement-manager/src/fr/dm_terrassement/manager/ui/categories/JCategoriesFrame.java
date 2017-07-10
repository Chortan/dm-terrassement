package fr.dm_terrassement.manager.ui.categories;

import fr.dm_terrassement.manager.ui.JAbstractFrame;

public class JCategoriesFrame extends JAbstractFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8059195539503825081L;

	public JCategoriesFrame() {
		super("DM-Terrassement - Categories");
		super.controller = new JCategoriesController(this);
		super.panel = new JCategoriesPanel(super.controller);
		this.setupUI();
	}
	
	@Override
	public void setupUI() {
		super.setupUI();
		
		this.setVisible(true);
	}
	
	

}
