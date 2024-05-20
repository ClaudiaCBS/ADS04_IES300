
package singletonpattern;


public class SingletonPattern {

    
    public static void main(String[] args) {
        
        MyDatabase db1 = MyDatabase.getInstance();
        
        User user1 = new User("Luiz", 30);
        User user2 = new User("Maria", 63);
        
        db1.add(user1);
        db1.add(user2);
        System.out.println("Instancia 1 mostrando o Banco de Dados");
        db1.show();
        
        MyDatabase db2 = MyDatabase.getInstance();
                
                
        User user3 = new User("Roberta", 27);
        User user4 = new User("Fernando", 13);
        
        
        db2.add(user3);
        db2.add(user4);
        System.out.println();
        System.out.println("Instancia 2 mostrando o Banco de Dados");
        db2.show();
        System.out.println();
        System.out.println("Instancia 1 mostrando o Banco de Dados");
        db1.show();
    }
    
}
