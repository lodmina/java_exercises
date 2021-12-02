
public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    //private Double salarioSemanal;

    public Empregado(String nome, 
                    String sobrenome, 
                    double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salarioMensal>0)
            this.salarioMensal = salarioMensal;

    }// fim do construtor

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalarioMensal(double salarioMensal){
        if(salarioMensal>0)
            this.salarioMensal = salarioMensal;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }
} // fim da classe Empregado
