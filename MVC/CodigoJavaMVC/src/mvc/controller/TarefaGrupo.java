
package mvc.controller;

import mvc.model.ListaTarefa;
import java.util.ArrayList;
import java.util.List;
import mvc.view.Observer;


public class TarefaGrupo implements Comportamento {
    private Observer view;
    private ListaTarefa model;

    public void setView (Observer o){
        this.view = o;
    }
    
    public void setModel (ListaTarefa t) {
        this.model = t;
    }

    @Override
    public void realizar() {
        model.addObserver(view);
        System.out.println("Realização de Tarefa em Grupo!");
        model.realizarTarefa();
    }
    
    
}
