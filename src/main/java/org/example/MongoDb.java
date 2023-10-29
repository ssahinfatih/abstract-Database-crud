package org.example;

public class MongoDb extends  AbstractDb {
    @Override
    void update() {
        System.out.println("MongoDb ile güncellendi");
    }

    @Override
    void get() {
        System.out.println("MongoDb ile getirildi");
    }
}
