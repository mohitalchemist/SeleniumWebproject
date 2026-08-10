package Day40;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		Properties propertiesobj = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Cofig.properties");
		propertiesobj.load(file);
		String url=propertiesobj.getProperty("appurl");
		String email=propertiesobj.getProperty("email");
		String password=propertiesobj.getProperty("password");
		String orderid=propertiesobj.getProperty("orderid");
		String customerid=propertiesobj.getProperty("customerid");
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);
		System.out.println(orderid);
		System.out.println(customerid);
		Set<String> keys=propertiesobj.stringPropertyNames();
		System.out.println(keys);
		
		

	}

}
