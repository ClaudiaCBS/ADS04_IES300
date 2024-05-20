
package singletonpattern;

import java.util.ArrayList;
import java.util.List;


public class MyDatabase {
    private static MyDatabase instance = null;
    private List<User> users = new ArrayList<User>();
    
    private MyDatabase (){};
    
    public static MyDatabase getInstance(){
        if (MyDatabase.instance == null){
            MyDatabase.instance = new MyDatabase();
        }
        return MyDatabase.instance;
    }
    
    public void add(User user){
        users.add(user);
    }
    
    public void remove(User user){
        users.remove(user);
    }
    
    public void show(){
        for (User user : users){
            System.out.println("name: " + user.name + ", age: " + user.age);
        }
    }
    
}
