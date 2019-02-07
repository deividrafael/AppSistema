package appsistema;

import java.util.Scanner;

public class AppSistema {
    
    public static void main(String[] args) {
        GerenciaAutomotores am = new GerenciaAutomotores();                                             //Estância de um novo objeto de classe
        Scanner leia = new Scanner(System.in);
    
        int op = 0;
        
         do{
            System.out.println("Qual automotor voce deseja inserir na lista:\nc-Carro m-Moto p-Picape");
            String tp = leia.next();
        switch(tp){
            case "c":
                System.out.println("Digite o ano de fabricação:");
                int ano = leia.nextInt();
                System.out.println("Digite o modelo:");
                String modelo = leia.next();
                System.out.println("Digite a marca:");
                String marca = leia.next();
                System.out.println("Digite a placa:");
                String placa = leia.next();
                System.out.println("Digite o valor de mercado:");
                double valor = leia.nextDouble();
                System.out.println("Digite o tipo de combustível:");
                String combustível = leia.next();
                am.adicionar(new Carro(ano, modelo, marca, placa, valor, combustível));
            break;
            case "m":
                System.out.println("Digite o ano de fabricação:");
                int anoMoto = leia.nextInt();
                System.out.println("Digite o modelo:");
                String modeloMoto = leia.next();
                System.out.println("Digite a marca:");
                String marcaMoto = leia.next();
                System.out.println("Digite a placa:");
                String placaMoto = leia.next();
                System.out.println("Digite o valor de mercado:");
                double valorMoto = leia.nextDouble();
                am.adicionar(new Moto(anoMoto, modeloMoto, marcaMoto, placaMoto, valorMoto));
            break;
            case "p":
                System.out.println("Digite o ano de fabricação:");
                int anop = leia.nextInt();
                System.out.println("Digite o modelo:");
                String modelop = leia.next();
                System.out.println("Digite a marca:");
                String marcap = leia.next();
                System.out.println("Digite a placa:");
                String placap = leia.next();
                System.out.println("Digite o valor de mercado:");
                double valorp = leia.nextDouble();
                System.out.println("Digite o tipo de cabine:");
                String cabine = leia.next();
                am.adicionar(new Picape(anop, modelop, marcap, placap, valorp, cabine));
            break;
            default:
                System.out.println("Automotor inválido");
        }
        System.out.println("Deseja continuar?\n Digite 1 para sim ou 2 para não");
        op = leia.nextInt();
        }while (op == 1); 
       
        System.out.println(am.listar());
        System.out.println("Digite a placa do veículo que deseja remover da lista:");
        String placaRemove = leia.next();
        System.out.println("Automotor removido: " + am.remover(placaRemove));                   //Remove automotor na lista usando a placa como parâmetro
        
        System.out.println("Digite uma placa para buscar na lista:");
        String placaBusca = leia.next();
        System.out.println("Automotor encontrado:\n" + am.buscarPorPlaca(placaBusca));          //Busca automotor na lista usando a placa de parâmetro
       
        System.out.println("Digite um tipo de combustível para exibir os veiculos na lista");
        String combustivel = leia.next();        
        System.out.println(am.listarCarroPorCombustivel(combustivel));                          //Lista automotores que tem o mesmo tipo de combustível
        
        System.out.println("Digite a placa do veiculo para calcular imposto:");
        String placaImposto = leia.next();
        System.out.println("Imposto: " + am.obterValorDoImposto(placaImposto));  
        
        System.out.println("Carros cadastrados:\n"+am.listaCarros());                           //Lista a quantidade de carros
        System.out.println("Picapes cadastradas:\n" + am.listaPicape());                        //Lista a quantidade de picapes 
        System.out.println("Motos cadastradas:\n" + am.listaMotocicletas());                    //Lista a quantidade de motos
        System.out.println("Automotores cadastrados: " + am.sizeLista());                       //Retorna a quantidade de automotores na lista
        
        
    }

}
