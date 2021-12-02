public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo; // M ou F
    private int diaNasc; 
    private int mesNasc; 
    private int anoNasc;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private double freqCardMax;
    private double freqAlvoMax;
    private double freqAlvoMin;

    public PerfilDeSaude(){}

    // sets e gets de cada atributo da classe
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setDia(int diaNasc){
        this.diaNasc = diaNasc;
    }
    public int getDia(){
        return this.diaNasc;
    }
    public void setMes(int mesNasc){
        this.mesNasc = mesNasc;
    }
    public int getMes(){
        return this.mesNasc;
    }
    public void setAno(int anoNasc){
        this.anoNasc = anoNasc;
    }
    public int getAno(){
        return this.anoNasc;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(double altura){
        return this.altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(double peso){
        return this.peso;
    }

    // calculando a idade
    public int idade(int diaNasc, int mesNasc, int anoNasc){
        this.idade = ((((2021 - this.anoNasc)-1)*365)+((8+(12 - this.mesNasc))*30) + this.diaNasc + 6) / 365;
        return idade;
    }

    // calculando o imc
    public double imc(double peso, double altura){
        this.imc = this.peso/Math.pow(altura, 2); // peso dividido por altura ao quadrado
        return imc;
    }
    // calculando as frequencias cardiacas
    public double freqMax(){
        this.freqCardMax =220 - this.idade;
        return this.freqCardMax;
    }
    public String cardAlvo(){
        this.freqAlvoMin =  this.freqCardMax*0.5;
        this.freqAlvoMax = this.freqCardMax*0.85;
        return this.freqAlvoMin + "-" + this.freqAlvoMax;
    }
    // exibindo grafico de valores do imc
    public String grafico(){
        return "IMC\t\tCLASSIFICAÇÃO\t\tOBESIDADE(GRAU)\nMENOR QUE 18,5\t\tMAGREZA\t\t0\nENTRE 18,5 E 24,9\tNORMAL\t\t0\nENTRE 25,0 E 29,9\tSOBREPESO\tI\nENTRE 30,0 E 39,9\tOBESIDADE\tII\nMAIOR QUE 40,0\t\tOBESIDADE GRAVE\tIII\n";
    }

} // fim da classe PerfilDeSaude
