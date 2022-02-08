package designpatterns.singleton;

public class ThreadSafeSingletonUpgrade {
    private static ThreadSafeSingletonUpgrade instance;
    private ThreadSafeSingletonUpgrade(){}

    public static ThreadSafeSingletonUpgrade getInstance(){
        if(instance == null){
            synchronized(ThreadSafeSingletonUpgrade.class){
                if(instance == null){
                    instance = new ThreadSafeSingletonUpgrade();
                }
            }
        }
        return instance;
    }
}
