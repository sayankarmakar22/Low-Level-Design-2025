package Singleton;

public class Main {
     public static void main(String[] args) {

         // lazy initialization using static method

         MyDB sql = MyDB.getMyDb();
         System.out.println("Lazy Singleton -> " + sql.hashCode());
         MyDB sql2 = MyDB.getMyDb();
         System.out.println("Lazy Singleton -> " + sql2.hashCode());

         //eager initialization using static method and variable

         MyDb2 sql3 = MyDb2.getInstance();
         System.out.println("Eager Singleton -> " + sql3.hashCode());
         MyDb2 sql4 = MyDb2.getInstance();
         System.out.println("Eager Singleton -> " + sql4.hashCode());

         // Thread safe singleton class
         MyDb3 sql5 = MyDb3.getMyDb();
         System.out.println("Thread Singleton -> " + sql5.hashCode());
         MyDb3 sql6 = MyDb3.getMyDb();
         System.out.println("Thread Singleton -> " + sql6.hashCode());

    }
}
