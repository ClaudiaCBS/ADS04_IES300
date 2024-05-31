
package mvc.view;

import mvc.controller.Comportamento;
import mvc.model.Observable;


public class Gerente implements Observer{
    private String nome;
    private Comportamento controller;
    private Observable model;
    
    public Gerente(String nome){
        this.nome = nome;
    }
           
    @Override
    public void update(String tarefa) {
        System.out.println("Notificação para o gerente "+ nome + ": Tarefa '"+ tarefa + "' foi concluida!");
    }

}
