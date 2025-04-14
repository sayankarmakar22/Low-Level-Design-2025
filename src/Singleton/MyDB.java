package Singleton;

public class MyDB {
    private static  MyDB instance;
    private MyDB(){

    }

    public static MyDB getMyDb(){
        if(instance == null) instance = new MyDB();
        return instance;
    }
}
