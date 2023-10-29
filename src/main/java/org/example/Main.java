package org.example;

public class Main {
    public static void main(String[] args) {


        AbstractDb abstractDb= new MySqlDb();
        AbstractDb abstractDb1= new MongoDb();

        abstractDb.update();
        abstractDb1.get();
    }
}