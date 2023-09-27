package lista02;
import java.util.ArrayList;
import java.util.Scanner;
public class Utilidades {

	    Scanner scanner = new Scanner(System.in);
	    public Utilidades() {
	    }
	    //EXERCICIO 01:
		public int somatorio(int vet[]) {
			int soma = 0;
			for(int i=2;i<vet.length-2; i++) {
		    soma+=vet[i];
			}
			return soma;
		}
		// EXERCICIO 02:
		public void numerosPares(int in, int f) {
			System.out.print("Numeros pares = ");
			for(;in <= f; in++) {
				if(in % 2 == 0) {
				   System.out.print(in + " ");
				}
			}
			System.out.println("\n");
		}
		//EXERCICIO 03:
		public float media() {
			
			System.out.println("Digite o tamanho dos vetores:  ");
			int tamanho = scanner.nextInt();
			
		    float vet1[] = new float[tamanho];
		    float vet2[] = new float[tamanho];
		    
			float soma = 0;
		    float media = 0;
		    
		    System.out.println("Digite o primeiro vetor: ");
		    for(int i = 0;i<tamanho;i++) {
		    	vet1[i] = scanner.nextFloat();
		    }
		    System.out.println("Digite o segundo vetor: ");
		    for(int i = 0;i<tamanho;i++) {
		    	vet2[i] = scanner.nextFloat();
			}
		    for(int i=0; i < tamanho;i++) {
		    	soma += vet1[i]+vet2[i];
		    }
		
		media = soma/(2*tamanho);	
	    return media;			
	    }
		
		//EXERCICIO 04:
        public float media_ponderada() {
        System.out.println("Digite o numero de notas: ");
        int tamanho = scanner.nextInt();
        int soma_pesos = 0;
        float soma = 0;
        float media = 0;
        float notas[] = new float[tamanho];
        int pesos[] = new int[tamanho];
        
        for(int i = 0; i< tamanho ;i++) {
        	System.out.println("Digite a nota " +i + ": ");
        	notas[i] = scanner.nextFloat();
        	
            System.out.println("Digite o peso correspondente: ");
            pesos[i] = scanner.nextInt();
            
            soma += notas[i]*pesos[i];
            soma_pesos += pesos[i];
        }
        media = soma/soma_pesos;
        return media;
        }
        //EXERCICIO 05:
        public int contagem_de_elementos(String vet1[],String vet2[],String elemento) {
            int repeticao = 0;
            
            for(int i = 0;i < vet1.length;i++) {
            	if(vet1[i].equals(elemento)) {
            		repeticao++;
            	}
            }
            for(int i = 0; i < vet2.length;i++) {
            	if(vet2[i].equals(elemento)) {
            		repeticao++;
            	}
            }
            return repeticao;
        }
        //EXERCICIO 06:	
        public String[] copia_de_vetor(String vet[]) {
        	String copia[]= new String[vet.length+1];
        	for(int i = 0;i<vet.length;i++) {
        		copia[i]=vet[i];
        	}
        	return copia;
        }
        //EXERCICIO 07:
        public int[] ordenação_crescente(int vet[]) {
        	int tamanho = vet.length;
        	
        	for(int i=0; i < tamanho-1; i++) {
        		
        		int menor = vet[i];
    			int menor_indice = i;
    			
        		for(int j=i+1;j<tamanho;j++) {
        			if(vet[j]<menor) {
        			 menor = vet[j];
        			 menor_indice = j;
        		 }	
            }
        		int temp = vet[i];
        		vet[i]=menor;
        		vet[menor_indice] = temp;
        	}
          return vet;
        }
        //EXERCICIO 08:
        public boolean verificacao_de_ordenacao(int vet[]) {
        	int tamanho = vet.length;
        	boolean ordenado = false;
        	
        	for(int i=0;i<tamanho;i++) {
        		if(i==0) {
        			ordenado = true;
        		}
        		else if(vet[i]>vet[i-1]) {
        			ordenado = true;
        		}
        		else {
        			ordenado = false;
        			i = tamanho-1;
        		}
        	}
        	return ordenado;
        }
        //EXERCICIO 09:
        public int k_esimo_maior_valor(int vet[],int k) { 
        	
        	for(int i = 0;i<vet.length-1;i++) {
        		int menor = vet[i];
            	int menor_indice = i;
            	
        		for(int j = i+1;j<vet.length;j++) {
        			if(vet[j]<vet[menor_indice]){
        				menor = vet[j];
        			    menor_indice = j;
        			}
        		}
        		int temp = vet[i];
        		vet[i] = menor;
        		vet[menor_indice]=temp;
           }
         return vet[vet.length-k]; 	
        }
        //EXERCICIO 10:
        public int k_esimo_menor_valor(int vet[],int k) { 
        	
        	for(int i = 0;i<vet.length-1;i++) {
        		int menor = vet[i];
            	int menor_indice = i;
            	
        		for(int j = i+1;j<vet.length;j++) {
        			if(vet[j]<vet[menor_indice]){
        				menor = vet[j];
        			    menor_indice = j;
        			}
        		}
        		int temp = vet[i];
        		vet[i] = menor;
        		vet[menor_indice]=temp;
           }
         return vet[k-1]; 	
        } 
      //EXERCICIO 11: 
        public boolean verificacao_de_igualdade(int vet1[],int vet2[]) {
        	boolean igual = false;
        	int tamanho = vet1.length;
        	if(vet1.length != vet2.length) {
        		 igual = false;
        	}
        	else {
        		 for(int i = 0;i < tamanho;i++) {
        			if(vet1[i]==vet2[i]) { 
        				igual = true;
        			}
        			else {
        				igual = false;
        				i = tamanho-1;
        			}
        		 }
        	}
        	return igual;
        }
        //EXERCICIO 12:
        public double potencia(int base, int expoente) {
        	int resultado=0;
        	for(int i=1;i<expoente;i++) {
        		if(i == 1) {
        		resultado = base*base;	
        		}
        		else {
        		resultado = resultado*base;	
        		}
        	}
        	return resultado;
        }
        //EXERCICIO 13:
        public void numero_primo(int numero) {
        	int num_div = 0;
        	for(int i=1;i <= numero;i++) {
        		if(numero % i == 0) {
        			num_div++;
        		}
        	}
        	if(num_div > 2 || numero == 1) {
        		System.out.println("O numero nao e primo!");
        	}
        	else {
        		System.out.println("O numero e primo!");
        	}
        }
        //EXERCICIO 14:
        public String[] busca_por_ocorrencias(String vet1[], String vet2[]) {
            ArrayList<String> elementosComuns = new ArrayList<String>();  
            
            for(int i = 0; i < vet1.length;i++) {
        		for(int j=0;j<vet2.length;j++) {
        			if(vet1[i].equals(vet2[j])) {
        				elementosComuns.add(vet1[i]);        			}
        		}
        	}
        	String vet3[]=new String[elementosComuns.size()];
        	for(int i=0;i<vet3.length;i++) {
        		vet3[i]=elementosComuns.get(i);
        	}
        	return vet3;
        }
        //EXERCICIO 15:
        public int[] remocao_de_elemento_do_vetor(int vet1[],int k) {
        	ArrayList<Integer> lista = new ArrayList<Integer>();
        	for(int i = 0;i<vet1.length;i++) {
        		lista.add(vet1[i]);
        	}
        	while(lista.contains(k)) {
        		lista.remove(Integer.valueOf(k));
        }
        	int vet2[] = new int[lista.size()];
        
        	for(int i = 0;i<vet2.length;i++) {
        	    vet2[i] = lista.get(i);
        	}
        		return vet2;
        }
        //EXERCICIO 16:
        public boolean palindromo(String palavra) {
        	int tamanho = palavra.length();
        	char bab[] = new char[tamanho];
        	char aba[] = new char[tamanho];
        	for(int i = 0;i<tamanho;i++) {
        	    bab[i] = palavra.charAt(i);
        	}
        	for(int i = tamanho-1,j=0;i>=0;i--,j++) {
        		aba[j] = palavra.charAt(i);
        	}
        	for(int i = 0; i < tamanho;i++) {
        		if(aba[i]!=bab[i]) {
        			return false;
        		}
        	}
        	return true;
        }
        //EXERCICIO 17:
        public boolean verificacao_de_numero_primo(int k) {
        	int num_div = 0;
        	for(int i=1;i <= k;i++) {
        		if(k % i == 0) {
        			num_div++;
        		}
        	}
        		if(num_div > 2 || k == 1) {
                		return false;
                }
               
            return true;
        }
        //EXERCICIO 18:
        public String inversao_de_string(String palavra) {
        	char[] caracteres = palavra.toCharArray();
        	int tamanho = caracteres.length;
        	
        	for(int i=0;i<tamanho/2;i++) {
        		char temp = caracteres[i];
        		caracteres[i] = caracteres[tamanho - i - 1];
        		caracteres[tamanho - i - 1] = temp;
        	}
        return new String(caracteres);	
        }
        //EXERCICIO 19:
        public float juros_compostos(float valor, float taxa, int tempo) {
        	float resultado = valor;
        	for(int i=1; i < tempo;i++) {
        		resultado = resultado*(1+taxa);
        	}
        return resultado;
        }
        //EXERCICIO 20;
        public boolean numero_perfeito(int numero) {
        	int divisores[] = new int[numero]; 
        	int index_div = 0;
            int soma =0;
        	for(int i = 1; i < numero;i++) {
            	if(numero % i == 0) {
            		divisores[index_div]=i;
            		index_div++;
            	}
            }
            for(int i = 0;i<index_div;i++) {
            	soma += divisores[i];
            	
            }
            if(soma == numero) {
            	return true;
            }
            return false;
        }
        //EXERCICIO 21:
        public char[] diminuicao_de_vetor(int num) {
        	char[] vetor = new char[num];
            
            for (int i = 0; i < num; i++) {
                vetor[i] = 'a'; 
            }

            while (num > 1) {
                   num--;
                char[] novoVetor = new char[num];
                System.arraycopy(vetor, 0, novoVetor, 0,num);
                vetor = novoVetor;
            }
            
            return vetor;
        }
        //EXERCICIO 22:
        public void imprimir_elementos() {
        System.out.println("Digite o numero de Linhas: ");
        int n = scanner.nextInt();
        
        System.out.println("Digite o numero de Colunas: ");
        int m = scanner.nextInt();
        
        System.out.println("Digite uma opcao de impressao: \n1 - a \n2 - b\n3 - c\n4 - d\n5 - e\n6 - f" );
        int escolha = scanner.nextInt();
        
        switch(escolha) {
        
        case 1:
        for(int i = 0; i < n; i++) {
        	for(int j = 0;j < m; j++) {
        		if(j<=i) {
        			System.out.print(j+" ");
        		}
        		else if(j==m-1) {
        			System.out.print(" " + "\n");
        		}
        	}
        }
        break;
        
        case 2:
        for(int i = 1;i<n+1;i++) {	
        	for(int j = 1; j < m+1;j++) {
            	   
        		   if((i%2==0 && j%2==0)||(i%2 != 0 && j%2 != 0)) {
            		   if(j!=m) {
            			   System.out.print("@");
            		   }
            		   else {
            			   System.out.println("@");
            		   }
            	   }
            	   else {
            		   if(j!= m) {
            			   System.out.print("*");
            		   }
            		   else {
            			   System.out.println("*");
            		   }
            	   }
            	   
        	}
        }
        break;
        
        case 3:
        	for (int i = 0; i < n; i++) {
        	    for (int j = 0; j < m; j++) {
        	        if (i == n / 2 || j == m / 2) {
        	            System.out.print("@");
        	        } else {
        	            if (i % 2 == 0) {
        	                System.out.print(j);
        	            } else {
        	                System.out.print(m - j - 1);
        	            }
        	        }

        	        if (j == m - 1) {
        	            System.out.println();
        	        } else {
        	            System.out.print(" ");
        	        }
        	    }
        	}

        break;
        
        case 4:
        	for(int i = 0; i < n; i++) {
        		for(int j = 0;j < m; j++) {
        		if((j>0 && j<m-1)&&(i>0&&i<n-1)){
            			System.out.print("*");
            		}
        		else {
        		    if (j == 0 || i == 0 || j == m - 1 || i == n - 1) {
                        if (j == 0) {
                            System.out.print(i);
                        } else if (i == 0) {
                            System.out.print(j);
                        } else if (j == m - 1) {
                            System.out.print(m - 1 - i);
                        } else if (i == n - 1) {
                            System.out.print(n -1 - j);
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); 

        }	
        break;	
        
        case 5:
        	for(int i =0;i < n;i++) {
        		for(int j =0; j < m;j++) {
        			if(j==m/2) {
        				System.out.print("||");
        			}
        			else {
        				if((j < m/2 && i < n/2) || (j < m/2 && i > n/2)|| (j > m/2 && i > n/2) || (j > m/2 && i<n/2) || (i == n/2 && j!=m/2))
        					if(j < m/2 && i < n/2) {
        						System.out.print("#");
        					}
        					else if(j < m/2 && i > n/2) {
        						System.out.print("*");
        					}
        					else if(j > m/2 && i > n/2) {
        						System.out.print("%");
        					}
        					else if(j > m/2 && i < n/2) {
        						System.out.print("!");
        					}
        					else {
        						System.out.print("=");
        					}
        			}
        		}
        		System.out.print("\n");
        	}
        	break;
        	
        case 6:
        	for(int i =0;i<n;i++) {
        		for(int j = 0; j < m;j++) {
        			if((i==j)||(i+j==m-1)) {
        				System.out.print(j);
        			}
        			else {
        				System.out.print("*");
        			}
        		}
        		System.out.print("\n");
        	}
        	break;
        default:
        	System.out.println("Numero Invalido");
        }
        }
}
        