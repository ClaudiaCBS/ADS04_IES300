
package Classe;


public class Hospede {
    public IPassatempo passatempo;

    //Construtor    
    public Hospede(IPassatempo passatempo) {
        this.passatempo = passatempo;
    }

    //Método get
    public IPassatempo getPassatempo() {
        return passatempo;
    }
    

    //Método set
    public void setPassatempo(IPassatempo passatempo){
        this.passatempo = passatempo;
    }
    
    //Método para acessar classe Interface
    public void Lazer() {
        passatempo.Lazer();
    }
    
    
}
