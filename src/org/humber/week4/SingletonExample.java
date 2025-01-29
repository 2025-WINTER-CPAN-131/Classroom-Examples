package org.humber.week4;


class Database {

    private static Database instance;

    public Database() {}

    public static Database getInstance() {
        if(instance == null) {
            System.out.println("Creating new instance");
            instance = new Database();
        }
        return instance;
    }
}


public class SingletonExample {

    public static void main(String[] args) {

        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        Database db3 = new Database();

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);

    }

}
