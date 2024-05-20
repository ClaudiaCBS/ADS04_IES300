
package facade;


public class CalculadoraFacade {
    private Calculos calculadora;

    public CalculadoraFacade() {
        this.calculadora = new Calculos();
    }

    public int calcular(String operador, int a, int b) {
        switch (operador) {
            case "+":
                return calculadora.somar(a, b);
            case "-":
                return calculadora.subtrair(a, b);
            case "*":
                return calculadora.multiplicar(a, b);
            case "/":
                return calculadora.dividir(a, b);
            default:
                throw new IllegalArgumentException("Operador invalido");
        }
    }

    
}
