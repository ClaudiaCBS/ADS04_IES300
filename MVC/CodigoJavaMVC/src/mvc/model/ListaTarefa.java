
package mvc.model;

import mvc.view.Observer;
import java.util.ArrayList;
import java.util.List;
import mvc.controller.Comportamento;


public class ListaTarefa implements Observable, ITarefa{
    private List<Observer> observers = new ArrayList<Observer>();
    private List<ITarefa> tarefas = new ArrayList<ITarefa>();
    private boolean concluida;
    private String nome;
    private Comportamento comportamento;
    

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public ListaTarefa(String nome) {
        this.nome = nome;
    }
    
    public void concluir(){
        this.comportamento.realizar();
        this.concluida = true;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this.getNome());
        }
    }
    
    public void addTarefa (ITarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removeTarefa (ITarefa tarefa) {
        tarefas.remove(tarefa);
    }
    
    @Override
    public void realizarTarefa() {
         for (ITarefa tarefa : tarefas) {
             tarefa.realizarTarefa();
         }
         this.notifyObservers();
    }
    
    public boolean isConcluida() {
        return concluida;
    }

    public String getNome() {
        return nome;
    }
    
     
    
}
