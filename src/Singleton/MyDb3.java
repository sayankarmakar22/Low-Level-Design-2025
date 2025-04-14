package Singleton;

public class MyDb3 {
    private static  MyDb3 instance;
    private MyDb3(){

    }

    public static MyDb3 getMyDb(){
       if(instance == null){
           synchronized (MyDb3.class){
               if(instance == null){
                   instance = new MyDb3();
               }
           }
       }
       return instance;
    }

}
