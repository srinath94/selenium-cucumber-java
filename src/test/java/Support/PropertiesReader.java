package Support;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    public static String page_url;
    public static String browser_type;


    public void LoadProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("Config/settings.properties"));
        page_url = properties.getProperty("URL");
        browser_type = properties.getProperty("Browser");
    }
}
