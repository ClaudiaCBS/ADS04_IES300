
package observer;


public class Observer {

    
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Claudia de Carlos Braga Secco");
        Usuario user2 = new Usuario("Mateus de Sousa Raimundo");
        Usuario user3 = new Usuario("Giuliano Bertoti");
        
        Notificador app = new Notificador();
        app.addObserver(user3);
        app.addObserver(user2);
        app.addObserver(user1);
        
        app.notifyObserver();
        System.out.println("");
        app.removeObserver(user3);
        System.out.println("");
        app.notifyObserver();
    }
    
}
