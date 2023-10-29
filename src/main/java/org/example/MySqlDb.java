package org.example;

public class MySqlDb extends  AbstractDb {
    @Override
    void update() {
        System.out.println("MySqlDb ile güncellendi");
    }

    @Override
    void get() {
        System.out.println("MySqlDb ile getirildi");
    }
}