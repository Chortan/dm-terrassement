package fr.dm_terrassement.manager.ui.category;

import fr.dm_terrassement.manager.pojo.Category;
import fr.dm_terrassement.manager.ui.JAbstractFrame;

public class JCategoryFrame extends JAbstractFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1609494054262206989L;

	public JCategoryFrame(Category category){
		super("DM-Terrassement - "+(category.getName()==null? "nouveau":category.getName()));
		this.setVisible(true);
	}
	
	@Override
	public void setupUI() {
		super.setupUI();
		this.setVisible(true);
	}

}
