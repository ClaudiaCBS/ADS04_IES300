
package mvc.model;


public class Tarefa implements ITarefa {
    private String nome;
    private boolean concluido = false;
    
    public Tarefa (String nome){
        this.nome = nome;
    }

    @Override
    public void realizarTarefa() {
        this.concluido = true;
        System.out.println("Tarefa Concluída = " + this.nome);
    }
    
}
