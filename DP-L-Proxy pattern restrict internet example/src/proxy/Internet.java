package proxy;

import java.util.ArrayList;
import java.util.List;

public class Internet implements subject.Internet {

	private real.Internet internet;
	private static List<String> restrictedSites;
	
	static {
		restrictedSites = new ArrayList<String>();
		restrictedSites.add("whatsapp.com");
		restrictedSites.add("facebook.com");
		restrictedSites.add("whatever.com");
		restrictedSites.add("badsites.com");
	}
	
	@Override
	public void connectTo(String url) throws Exception {
		
		if(restrictedSites.contains(url)) throw new Exception("Access denied due to bad url");
		
		if(internet == null) internet = new real.Internet();
		internet.connectTo(url);
	}

}
