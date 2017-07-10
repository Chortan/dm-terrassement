package fr.dm_terrassement.manager.resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class HttpResourceManager {
	private URL url;
	
	public HttpResourceManager(URL url){
		this.url = url;
	}
	
	public String getJsonResource(){
		try {
			InputStream is = this.url.openStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      
	      StringBuilder sb = new StringBuilder();
	      String cp = null;
	      while ((cp = rd.readLine()) != null) {
	        sb.append(cp);
	      }
		      
		      return sb.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "{}";
	}
	
	
	public URL getUrl() {
		return url;
	}
	
	
}
