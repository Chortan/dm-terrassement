package fr.dm_terrassement.manager.ui.menu;

import org.apache.log4j.Logger;

import fr.dm_terrassement.manager.ui.JAbstractFrame;
import fr.dm_terrassement.manager.ui.JController;
import fr.dm_terrassement.manager.ui.categories.JCategoriesFrame;

public class JMenuController extends JController{
	
	private Logger logger = Logger.getLogger(this.getClass());

	public JMenuController(JAbstractFrame context) {
		super(context);
	}
	
	@Override
	public void onInit() {
		// TODO Auto-generated method stub
		super.onInit();
	}
	
	@Override
	public void onFinish() {
		super.onFinish();
		System.exit(1);
	}
	
	public void categoriesOnClick(){
		this.logger.debug("open categories");
		new JCategoriesFrame();
		this.context.setVisible(false);
	}
	
	public void imagesOnClick(){
		this.logger.debug("open images");
	}
	
}
