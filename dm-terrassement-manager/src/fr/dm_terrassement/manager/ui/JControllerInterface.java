package fr.dm_terrassement.manager.ui;

public interface JControllerInterface {
	public void onInit();
	public void onClose();
	public void onFinish();
	public JAbstractFrame getApplicationContext();
}
