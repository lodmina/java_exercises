import java.util.Scanner;

public class PerfilDeSaudeTeste {
    public static void main(String[] args){

        String nome, sobrenome, sexo;
        int diaNasc, mesNasc, anoNasc;
        double altura, peso;

        PerfilDeSaude paciente1 = new PerfilDeSaude();

        Scanner dados = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = dados.nextLine();

        System.out.println("Sobrenome: ");
        sobrenome = dados.nextLine();

        System.out.println("Sexo: (M/F)");
        sexo = dados.nextLine();

        System.out.println("Dia de nascimento: ");
        diaNasc = dados.nextInt();

        System.out.println("Mês de nascimento: ");
        mesNasc = dados.nextInt();

        System.out.println("Ano de nascimento: ");
        anoNasc = dados.nextInt();

        System.out.println("Altura: ");
        altura = dados.nextDouble();

        System.out.println("Peso: ");
        peso = dados.nextDouble();

        // usando os sets para as entradas dos atributos 
        paciente1.setNome(nome);
        paciente1.setSobrenome(sobrenome);
        paciente1.setSexo(sexo);
        paciente1.setDia(diaNasc);
        paciente1.setMes(mesNasc);
        paciente1.setAno(anoNasc);
        paciente1.setAltura(altura);
        paciente1.setPeso(peso);

        System.out.printf("Nome: %s Sobrenome: %s\n", paciente1.getNome(), paciente1.getSobrenome());
        System.out.printf("Sexo: %s\n", paciente1.getSexo());
        System.out.printf("Data de nascimento: %d/%d/%d \n", paciente1.getDia(), paciente1.getMes(), paciente1.getAno());
        System.out.printf("Altura: %.2f m\n", paciente1.getAltura(altura));
        System.out.printf("Peso: %.2f kg\n", paciente1.getPeso(peso));
        System.out.printf("Idade: %d\n", paciente1.idade(diaNasc, mesNasc, anoNasc));
        System.out.printf("IMC: %.2f m\n", paciente1.imc(peso, altura));
        System.out.printf("Frequência cardiaca máxima: " + paciente1.freqMax() + " bpm\n");
        System.out.printf("Frequência cardiaca alvo pode variar: "+paciente1.cardAlvo()+"\n");
        System.out.printf("Gráfico de valores do IMC: \n" + paciente1.grafico());

        dados.close();
    } // fim do main
    
}
