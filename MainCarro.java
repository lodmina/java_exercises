package src;
/* QUESTÃO 6 
Aluna: Ludmila Maria Pereira da Silva
*/ 
public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Prius");
        carro1.setAnoFabricacao(2022);
        carro1.setTipoCombustivel("Gasolina");
        System.out.println("Marca: "+carro1.getMarca()+", Modelo: "+carro1.getModelo()+", Ano de fabricação: "+carro1.getAnoFabricacao()+", Tipo de combustível: "+carro1.getTipoCombustivel());
        
        Carro carro2 = new Carro();
        carro2.setMarca("Ford");
        carro2.setModelo("Civic Sedan");
        carro2.setAnoFabricacao(2017);
        carro2.setTipoCombustivel("Flex");
        System.out.println("Marca: "+carro2.getMarca()+", Modelo: "+carro2.getModelo()+", Ano de fabricação: "+carro2.getAnoFabricacao()+", Tipo de combustível: "+carro2.getTipoCombustivel());
    
    }
}
