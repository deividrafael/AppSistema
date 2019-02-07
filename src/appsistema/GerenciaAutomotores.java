package appsistema;
import java.util.ArrayList; 
public class GerenciaAutomotores {
    
    private ArrayList <AutoMotor> autoMotores = new ArrayList(10);                //Declaração de array list
    public ArrayList<AutoMotor> getAutoMotores() {
        return autoMotores;
    }
    public void adicionar(AutoMotor a){
        
        autoMotores.add(a);
    }

    public boolean remover(String placa){
        
        for (int i = 0; i < autoMotores.size(); i++) {
            AutoMotor auto = autoMotores.get(i);
            
            if (auto.getPlaca().equals(placa)){
                autoMotores.remove(auto);
                return true;
            }
        }
       return false;
    }
    
    public String listar() {
        String saida = "";
        if (autoMotores.isEmpty()) {

        } else {
            for (AutoMotor p : autoMotores) {
                saida += p.imprimir();
                saida += "\n==============\n";
            }
        }
        return saida;
    }
    public String buscarPorPlaca (String placa){        //public AutoMotor retorna a posição de memória do objeto
        for (AutoMotor auto : autoMotores) {
            if (auto.getPlaca().equals(placa)) {
               return auto.imprimir();
            }
        }
        return null;
    }
    
    public String listarCarroPorCombustivel (String combustível){
        for (AutoMotor auto : autoMotores) {
            if (auto instanceof Carro){
            if (((Carro) auto).getCombustivel().equalsIgnoreCase(combustível)){
                return auto.imprimir();
            }
            }
        }
        return null;
    }  
    
    public double obterValorDoImposto(String placa){
        for (AutoMotor auto : autoMotores) {
            if (auto.getPlaca().equalsIgnoreCase(placa)){
                return auto.calcularImposto();
            }
        }
        
        return -1;
    }
    
    public String listaCarros(){
        String saida = "";
        for (int i=0; i<autoMotores.size();i++) {
            AutoMotor auto = autoMotores.get(i);
            if (auto instanceof Carro){
                saida += auto.imprimir();
                saida += "\n";
           }
        }
        return saida;
    }
    
    public String listaMotocicletas(){
        String saida = "";
        for (int i=0; i<autoMotores.size();i++) {
            AutoMotor auto = autoMotores.get(i);
            if (auto instanceof Moto){
                saida += auto.imprimir();
                saida += "\n";
           }
        }
        return saida;
    }
    
    public String listaPicape(){
        String saida = "";
        for (int i=0; i<autoMotores.size();i++) {
            AutoMotor auto = autoMotores.get(i);
            if (auto instanceof Picape){
                saida += auto.imprimir();
                saida += "\n";
           }
        }
        return saida;
    }
    
    public int sizeLista(){
        return autoMotores.size();
    }
    
}   


    

