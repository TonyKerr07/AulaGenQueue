package JavaTech;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio Queue 2
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int op;
		String novo;
		
		
		do {
			System.out.println("Menu - Organiza pilha de livros: ");
			System.out.println("\n1 - Adiciona livro na pilha");
			System.out.println("\n2 - Listar livros da pilha");
			System.out.println("\n3 - Retirar livro do topo da pilha");
			System.out.println("\n0 - Finalizar programa");
			
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				leia.nextLine(); //Usado para consumir a nova linha em branco e ler o "novo".
				novo = leia.nextLine();
				
				pilha.add(novo);
				
				System.out.println("\nFila: ");
				System.out.println(pilha);
				
				System.out.println("\nO livro " + novo + " foi adicionado!");
								
				
			break;
			
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
					
				} else {
					System.out.println("\nPilha de livros: ");
					System.out.println(pilha);
					
				}
			break;
			
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
					
				} else {
					novo = pilha.pop();
					
					System.out.println("\nO livro " + novo + " foi retirado da pilha!");
					
					System.out.println("\nPilha de livros: ");
					System.out.println(pilha);
					
				}
			break;
			
			case 0:
				System.out.println("\nPrograma finalizado!");
				
			break;
			
			default :
				System.out.println("\nSelecione uma opção válida!");
			break;
			
			}
							
		} while (op !=0 );
		
		

	}

}
