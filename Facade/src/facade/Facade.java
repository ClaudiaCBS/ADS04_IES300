
 
package facade;

import facade.CalculadoraFacade;


public class Facade {

    
    public static void main(String[] args) {
        CalculadoraFacade calculadora = new CalculadoraFacade();

        // Usando a calculadora através da interface Facade
        System.out.println("5 + 3 = " + calculadora.calcular("+", 5, 3));
        System.out.println("5 - 3 = " + calculadora.calcular("-", 5, 3));
        System.out.println("5 * 3 = " + calculadora.calcular("*", 5, 3));
        System.out.println("5 / 3 = " + calculadora.calcular("/", 5, 3));
    }
    
}
