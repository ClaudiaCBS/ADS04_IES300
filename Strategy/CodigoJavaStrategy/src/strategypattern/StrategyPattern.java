
package strategypattern;

import Classe.Bilhar;
import Classe.Hospede;
import Classe.Piscina;


public class StrategyPattern {

    
    public static void main(String[] args) {
        //Cria novas instâncias na classe e atribuiu a variavel passatempo1 e passatempo2
        Bilhar passatempo1 = new Bilhar();
        Piscina passatempo2 = new Piscina();
        //Instanciando o objeto hospede com argumento passatempo1
        Hospede hospede = new Hospede(passatempo1);
        //Chama o método Lazer() do objeto hospede (passatempo1)
        hospede.Lazer();
        //Método setPassatempo() é usado para definir um novo passatempo para o objeto hospede (neste caso, estamos definindo passatempo2 como o novo passatempo)
        hospede.setPassatempo(passatempo2);
        //Chama o método Lazer() do objeto hospede (passatempo2)
        hospede.Lazer();
    }
}
