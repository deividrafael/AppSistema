package appsistema;

public class Moto extends AutoMotor {

    public Moto(int anoDeFabricacao, String modelo, String marca, String placa, double valorDeMercado) {
        super(anoDeFabricacao, modelo, marca, placa, valorDeMercado);
    }

    @Override
    public double calcularImposto() {
        
        if (getAnoDeFabricacao() >1998 && getAnoDeFabricacao()<2018)
            return getValorDeMercado()*0.02;
        
        if (getAnoDeFabricacao() < 1998){
            System.out.println("Veículo livre de imposto");
            
        }
        return 0;
        
    }

    
}
