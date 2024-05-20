
package observer;

import java.util.ArrayList;
import java.util.List;


public class Notificador implements IObservavel {
    private List<IObserver> usuarios = new ArrayList<IObserver>();

    @Override
    public void addObserver(IObserver observer) {
        usuarios.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        usuarios.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Atualizacao Realizada!");
        System.out.println("================================");
        for (IObserver usuario : usuarios){
            usuario.update();
        } 
    }
    
}
