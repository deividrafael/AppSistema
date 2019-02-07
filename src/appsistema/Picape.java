package appsistema;

public class Picape extends AutoMotor {
    
    private String cabine;

    public Picape(int anoDeFabricacao, String modelo, String marca, String placa, double valorDeMercado, String cabine) {
        super(anoDeFabricacao, modelo, marca, placa, valorDeMercado);
        this.cabine = cabine;
    }

    public void setCabine(String cabine) {
        this.cabine = cabine;
    }

    public String getCabine() {
        return cabine;
    }

    @Override
    public double calcularImposto() {

        if (getAnoDeFabricacao() > 1998){
        
            if (getCabine().equals("simples")){
                return getValorDeMercado()*0.02;
            }
            if (getCabine().equals("dupla")){
                return getValorDeMercado()*0.04;
            }
            System.out.println("Veículo livre de imposto!!"); 
        }
        return 0;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + ", Tipo de cabine:" + getCabine(); 
    }

    
}
