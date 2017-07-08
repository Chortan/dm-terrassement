package fr.dm_terrassement.manager.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.apache.log4j.Logger;

public abstract class JController implements JControllerInterface{

	protected JAbstractFrame context;
	private final static Logger Log = Logger.getLogger(JAbstractPanel.class);
	
	public JController(JAbstractFrame context){
		this.context = context;
		this.setupActionLisner();
	}
	
	public void onInit() {
		Log.debug("Frame "+this.context.getName()+" are initiated");
	}
	
	public void onClose() {
		Log.debug("Frame "+this.context.getName()+" are closing");
		this.onFinish();
	}

	public void onFinish() {
		Log.debug("Frame "+this.context.getName()+" are finised");
		
	}
	
	private void setupActionLisner(){
		this.context.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                onClose();
            }            
            
        });
	}
	
	public JAbstractFrame getApplicationContext() {
		return this.context;
	}
	
}
