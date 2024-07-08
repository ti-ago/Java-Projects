package calculadora;

public class Operadores {
    private double valor1;
    private double valor2;
    private double result;

    public Operadores() {
    }
    
    public double somar(double n1, double n2){
        this.setValor1(n1);
        this.setValor2(n2);
        double s = n1+n2;
        this.setResult(s);
        return s;
    }
    
    public double subtrair(double n1, double n2){
        this.setValor1(n1);
        this.setValor2(n2);
        double s = n1-n2;
        this.setResult(s);
        return s;
    }
    
    public double multiplicar(double n1, double n2){
        this.setValor1(n1);
        this.setValor2(n2);
        double s = n1*n2;
        this.setResult(s);
        return s;
    }
    
    public double dividir(double n1, double n2){
        this.setValor1(n1);
        this.setValor2(n2);
        double s = n1/n2;
        this.setResult(s);
        return s;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
}

