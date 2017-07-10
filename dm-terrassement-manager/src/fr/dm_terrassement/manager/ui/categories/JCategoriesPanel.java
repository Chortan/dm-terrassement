package fr.dm_terrassement.manager.ui.categories;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;

import org.apache.log4j.Logger;

import fr.dm_terrassement.manager.pojo.Category;
import fr.dm_terrassement.manager.ui.JAbstractPanel;
import fr.dm_terrassement.manager.ui.JControllerInterface;
import fr.dm_terrassement.manager.ui.category.JCategoryFrame;

public class JCategoriesPanel extends JAbstractPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4645650678559200861L;

	private JList<Category> categoriesList;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public JCategoriesPanel(JControllerInterface controller) {
		super(controller);
		this.setupUI();
		
	}
	
	private void setupUI() {
		Category[] categories = (Category[]) ((JCategoriesController)super.controller).getCategories().toArray();
		this.categoriesList = new JList<Category>(categories);
		this.add(this.categoriesList);
		
	}
	
	public void addActionLisner() {
		this.categoriesList.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent evt) {
		        @SuppressWarnings("unchecked")
				JList<Category> list = (JList<Category>)evt.getSource();
		        logger.debug("Event mouse on categoriesList");
		        
		        new JCategoryFrame(list.getSelectedValue());
		        
		    }
		});
	}
	
	

}
