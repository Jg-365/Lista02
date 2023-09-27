package lista02;
public class Main{
	
	 public static void main(String[] args) {
		Utilidades utilidades = new Utilidades(); 
		//EXERCICIO 01
		System.out.println("Exercicio 1:");
		int vet[] = {1,2,3,4,5,6,7};
		int resultado = utilidades.somatorio(vet);
		System.out.println("Resultado = " + resultado);
		
		//EXERCICIO 02
		System.out.println("Exercicio 2:");
		utilidades.numerosPares(1,9);
		
		//EXERCICIO 03
		System.out.println("Exercicio 3:");
		float media = utilidades.media();
		System.out.println(media);
	    
	    //EXERCICIO 04
	    System.out.println("Exercicio 4:");
	    float media_pond = utilidades.media_ponderada();
	    System.out.println("A media geral foi:" + media_pond);
	
		//EXERCICIO 05
		System.out.println("Exercicio 5:");
		int repeticoes;
		String vet1[]= {"B","a","n","a","n","a"};
		String vet2[]= {"M","a","c","a","c","o"};
		String elemento = "a";
		repeticoes = utilidades.contagem_de_elementos(vet1,vet2,elemento);
		System.out.println("O elemento " + elemento + " aparece " + repeticoes + " vezes");	 
        
	    //EXERCICIO 06
	    System.out.println("Exercicio 6: ");
	      
	    String vet6[] = {"f","l","a","m","e","n","g","o"};
	    String copia[]=utilidades.copia_de_vetor(vet6);
	      
	    System.out.print("O vetor gerado foi: ");
	      for(int i = 0;i<vet6.length;i++) {
	           System.out.print(copia[i]);
	    }
		System.out.println("\n");
		
		//EXERCICIO 07
		System.out.println("Exercicio 7: ");
		
		int[] numero = {4,4,3,2,1};
		int[] crescente = utilidades.ordenação_crescente(numero);
		
		System.out.println("O vetor reordenado e: ");
		for(int i = 0; i <crescente.length;i++) {
			System.out.print(crescente[i]);
		}
		System.out.println("\n");
		
	    //EXERCICIO 08
	    System.out.println("Exercicio 8: ");
	    boolean ordenacao;
	    int vet5[]= {1,2,3,4,5};
	    ordenacao = utilidades.verificacao_de_ordenacao(vet5);
	    System.out.println("O sistema é ordenado de forma crescente?" + ordenacao);
	    System.out.println("\n");
	    
	    //EXERCICIO 09
	    System.out.println("Exercicio 9: ");
	    int k_esimo_maior;
	    int vet7[] = {1,2,3,4,5};
	    int k1 = 3;
	    k_esimo_maior = utilidades.k_esimo_maior_valor(vet7, k1);
	    System.out.println("O " + k1 + "° maior valor eh: " + k_esimo_maior);
	    System.out.println("\n");
	    
		
		//EXERCICIO 10
		System.out.println("Exercicio 10: ");
		int k_esimo_menor;
		int vet8[] = {1,2,3,4,5};
		int k2 = 1;
		k_esimo_menor = utilidades.k_esimo_menor_valor(vet8, k2);
		System.out.println("O " + k2 + "° menor valor eh: " + k_esimo_menor);
		System.out.println("\n");
        
		//EXERCICIO 11
		System.out.println("Exercicio 11: ");
		boolean igual;
		int veta[] = {1,2,3,4,5};
		int vetb[] = {1,2,3,4,5};
		igual = utilidades.verificacao_de_igualdade(veta, vetb);
		System.out.println("Um vetor eh igual ao outro?: " + "R: " + igual);
		System.out.println("\n");
		
		//EXERCICIO 12
		System.out.println("Exercicio 12: ");
		double result;
		int base = 2;
		int expoente = 20;
		
		result = utilidades.potencia(base, expoente);
		System.out.println("O resultado da potencia eh: "+result);
		System.out.println("\n");
		
		//EXERCICIO 13
		System.out.println("Exercicio 13: ");
		int num = 5;
		utilidades.numero_primo(num);
		System.out.println("\n");
		
		
		//EXERCICIO 14
		System.out.println("Exercicio 14: ");
		String vet9[] = {"p","r","e","g","o"};
		String vet10[] = {"p","r","e","g","o"};
		
		String vet11[] = utilidades.busca_por_ocorrencias(vet9, vet10);
		for(int i = 0;i<vet11.length;i++) {
			System.out.print(vet11[i]);
		}
		System.out.println("\n");
		
		
		//EXERCICIO 15
		System.out.println("Exercicio  15: ");
		int vet12[] = {1,2,2,2,3,4,5,5,5,6};
		int k3 = 2;
		int r[] = utilidades.remocao_de_elemento_do_vetor(vet12, k3);
		
		for(int i = 0;i<r.length;i++) {
		System.out.print(r[i]);
		}
		
		//EXERCICIO 16
		System.out.println("Exercicio 16: ");
		String a = "ababa";
		boolean b = utilidades.palindromo(a);
		System.out.println("A palavra é um palindromo? R: " + b);
	    
	    
		
		//EXERCICIO 17
		System.out.println("Exercicio 17: ");
		int a1 = 10;
		boolean b1=false;
		b = utilidades.verificacao_de_numero_primo(a1);
		System.out.println(b1);
		
		//EXERCICIO 18:
		System.out.println("Exercicio 18: ");
		String word = "Boolean";
		System.out.println("A palavra invertida eh: " + utilidades.inversao_de_string(word));
		
		//EXERCICIO 19:
                System.out.println("Exercicio 19: ");
		float valor_inicial=1000;
		float taxa_juros = 0.1f;
		int num_periodos = 2;
		System.out.println("O valor do Montante é de: " + utilidades.juros_compostos(valor_inicial, taxa_juros, num_periodos));
		    
		    
		//EXERCICIO 20:
		System.out.println("Exercicio 20: ");
		int num_perf = 1;
		System.out.println(utilidades.numero_perfeito(num_perf));
		 	
			
		//EXERCICIO 21:
	        System.out.println("Exercicio 21: ");
		int num_reducao = 5;
		System.out.println(utilidades.diminuicao_de_vetor(num_reducao));
		 	
			
		//EXERCICIO 22:
		System.out.println("Exercicio 22: ");
	        utilidades.imprimir_elementos();
		        } 
	        } 
	
