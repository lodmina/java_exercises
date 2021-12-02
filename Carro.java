package src;
/* QUESTÃO 6 
Aluna: Ludmila Maria Pereira da Silva
*/
public class Carro {
    String marca;
    String modelo;
    int anoFabricacao;
    String tipoCombustivel;

    void setMarca(String marca){
        this.marca = marca;
    }
    String getMarca(){
        return this.marca;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return this.modelo;
    }

    void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    int getAnoFabricacao(){
        return this.anoFabricacao;
    }

    void setTipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    String getTipoCombustivel(){
        return this.tipoCombustivel;
    }

}
