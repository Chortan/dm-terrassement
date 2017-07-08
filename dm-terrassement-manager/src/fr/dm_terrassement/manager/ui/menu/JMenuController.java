package fr.dm_terrassement.manager.ui.menu;

import fr.dm_terrassement.manager.ui.JAbstractFrame;
import fr.dm_terrassement.manager.ui.JController;

public class JMenuController extends JController{

	public JMenuController(JAbstractFrame context) {
		super(context);
	}
	
	@Override
	public void onFinish() {
		super.onFinish();
		System.exit(1);
	}
	
}
