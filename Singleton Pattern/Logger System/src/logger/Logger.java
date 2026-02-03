package logger;

public class Logger {
    private static Logger instance;
    private String logInfo = "Logging info";
    private String logError = "Log error";

    private Logger(){
        System.out.println("Logger instance created");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void getLogInfo(){
        System.out.println(logInfo);
    }
    public void getLogError(){
        System.out.println(logError);
    }

}
