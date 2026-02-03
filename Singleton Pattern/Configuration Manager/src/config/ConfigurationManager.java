package config;

public class ConfigurationManager {
    private String appName;
    private String dbURL;
    private double timeOut;
    private static ConfigurationManager instance;

    private ConfigurationManager(String appName, String dbURL, double timeOut){
        System.out.println("Configuration created and successful!");
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager("Example App", "www.exampledb.com", 1200);
        }
        return instance;
    }
    public void getProperty(String key){
        System.out.println("Properties for " + key + "\nProps.....");
    }
    public void setProperty(String key, String value){
        System.out.println("Conf property set");
    }
}
