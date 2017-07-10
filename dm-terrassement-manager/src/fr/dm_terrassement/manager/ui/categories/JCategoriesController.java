package fr.dm_terrassement.manager.ui.categories;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.dm_terrassement.manager.pojo.Category;
import fr.dm_terrassement.manager.resources.HttpResourceManager;
import fr.dm_terrassement.manager.ui.JAbstractFrame;
import fr.dm_terrassement.manager.ui.JController;

public class JCategoriesController extends JController{

	private List<Category> categories;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public JCategoriesController(JAbstractFrame context) {
		super(context);
		try {
			HttpResourceManager http = new HttpResourceManager(new URL("http://127.0.0.1/assets/data/services.json"));
			String json = http.getJsonResource();
			this.logger.debug(json);
			ObjectMapper mapper = new ObjectMapper();
			
			Category[] categories  = mapper.readValue(json, Category[].class);
			this.categories = Arrays.asList(categories);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onInit() {
		this.logger.debug("set visible of frame category on true");
		this.context.setVisible(true);
		this.context.pack();
		this.logger.debug("Add Action lisner on categories List");
		((JCategoriesPanel)this.context.getPanel()).addActionLisner();
		
	}

	public void onClose() {
		// TODO Auto-generated method stub
		
	}

	public void onFinish() {
		// TODO Auto-generated method stub
		
	}

	public JAbstractFrame getApplicationContext() {
		return this.context;
	}
	
	public List<Category> getCategories() {
		return categories;
	}

}
