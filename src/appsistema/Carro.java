package appsistema;

public class Carro extends AutoMotor {
    private String combustivel;

  
    
    public Carro(int anoDeFabricacao, String modelo, String marca, String placa, double valorDeMercado, String combustivel) {
        super(anoDeFabricacao, modelo, marca, placa, valorDeMercado);
        this.combustivel = combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    public String getCombustivel() {
        return combustivel;
    }

    @Override
    public double calcularImposto() {
        if (getAnoDeFabricacao() > 1998){

            switch(getCombustivel()){
                case "diesel": case "gasolina": case "flex":
                    return getValorDeMercado()*0.04;
                case "alcool": case "gnv":
                    return getValorDeMercado()*0.03;
                default:
                    System.out.println("Combustível inválido!");
            }
            System.out.println("Isento de imposto!!");
        }
        System.out.println("veículo isento de imposto!!");
        return 0;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + ", Tipo de combutível:" + getCombustivel(); 
    }
    
}

