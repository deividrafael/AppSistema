package appsistema;

public abstract class AutoMotor {

    private String modelo, marca,placa;
    private int anoDeFabricacao;
    private double valorDeMercado;
    
    public abstract double calcularImposto();

    
    public AutoMotor(int anoDeFabricacao, String modelo, String marca, String placa, double valorDeMercado) {
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.valorDeMercado = valorDeMercado;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public void setValorDeMercado(double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }
    
    public String imprimir() {
        return "anoDeFabricacao = " + anoDeFabricacao + ", modelo = " + modelo + 
               ", marca = " + marca + ", placa = " + placa + ", valorDeMercado = " + valorDeMercado;
    }
    
}


    

