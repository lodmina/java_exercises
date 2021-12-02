public class LeQuadrado {

    public int tamLado;

    public void construindoQuad(int tamLado){
        
        if(tamLado >= 1 && tamLado <= 38){

        // laços que construirão o quadrado:
        System.out.print("Saída: ");
        //aresta horizontal de cima:
            for (int i=0; i<tamLado; i++){
                System.out.print(" * ");
            }System.out.println("");//pula linha para aresta vertical esquerda

            //aresta vertical da esquerda:
            for (int i=0; i<tamLado-2; i++){ //tamLado-2 pq aproveita-se os dois * de cada ponta do quadrado 
                System.out.print("\t");
                System.out.print("*");

                    // espaço vazio dentro do quadrado:
                    for(int j=0; j<tamLado-1; j++){ //tamLado-1 para compensar o próximo * da linha e alinhar
                        System.out.print("   ");
                    }
                    // aresta vertical da direita:
    
                    for(int l=tamLado-1; l<tamLado; l++){ //a variavel contadora l recebe tamLado-1 para alinhar com as arestas horizontais
                        System.out.print("*");
                    }System.out.println(" ");
            }

            //aresta horizontal de baixo:
            System.out.print("\t");
            for (int i=0; i<tamLado; i++){
                System.out.print(" * ");
            } 

        }else{
            System.out.println("Digite um tamanho entre 1 e 38");
        }
    }
}
