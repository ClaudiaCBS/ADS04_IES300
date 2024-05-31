
package mvc;

import mvc.model.ListaTarefa;
import mvc.model.Tarefa;
import mvc.view.Gerente;
import mvc.controller.TarefaGrupo;
import mvc.controller.TarefaIndividual;


public class GerenciadorTarefas {

    
    public static void main(String[] args) {
        ListaTarefa tarefa1 = new ListaTarefa("Tarefa 1");
        ListaTarefa tarefa2 = new ListaTarefa("Tarefa 2");

        Gerente gerente = new Gerente("João");

        Tarefa lavarLouca = new Tarefa("Lavando Louça!");
        Tarefa varrerCasa = new Tarefa("Varrendo Casa");
        
        tarefa1.addTarefa(lavarLouca);
        tarefa2.addTarefa(varrerCasa);
        

        TarefaGrupo tarefaGrupo = new TarefaGrupo();
        TarefaIndividual tarefaIndividual = new TarefaIndividual();
        
        tarefaGrupo.setView(gerente);
        tarefaIndividual.setView(gerente);
        
        tarefaGrupo.setModel(tarefa1);
        tarefaIndividual.setModel(tarefa2);

        tarefaGrupo.realizar();
        tarefaIndividual.realizar();

    }
    
}
