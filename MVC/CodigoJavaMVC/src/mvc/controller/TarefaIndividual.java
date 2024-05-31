
package mvc.controller;

import mvc.controller.Comportamento;
import mvc.model.ListaTarefa;
import mvc.view.Observer;


public class TarefaIndividual implements Comportamento {
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
        System.out.println("Realização de Tarefa Individual!");
        model.realizarTarefa();
    }
    
}
