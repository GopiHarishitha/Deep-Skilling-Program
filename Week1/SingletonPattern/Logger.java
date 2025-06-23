package Week1.SingletonPattern;

public class Logger{
    // Declaring the instance of the class
    // private because only one instance per class
    private static Logger instance;
    // private constructor so that new instance cannot be instantiated directy
    private Logger() {}
    // method to get the instance
    public static Logger getInstance(){
        if (instance==null){
            synchronized (Logger.class){
                if(instance==null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}