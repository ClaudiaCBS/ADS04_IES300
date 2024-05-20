
package observer;

public class Usuario implements IObserver{
    private String nome;
    
    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update() {
        System.out.println("Ola "+ this.nome+"! Voce recebeu uma notificacao.");
    }    
    
}
