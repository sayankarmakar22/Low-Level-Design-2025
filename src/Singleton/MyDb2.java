package Singleton;

public class MyDb2 {

    private static MyDb2 instance = new MyDb2();

    public static MyDb2 getInstance() {
        return instance;
    }
}
