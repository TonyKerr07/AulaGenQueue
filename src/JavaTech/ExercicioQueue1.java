package JavaTech;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercício Queue1
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int op;
		String novo;
		
		
		do {
			System.out.println("Menu - Fila do Banco: ");
			System.out.println("\n1 - Adiciona Cliente na fila");
			System.out.println("\n2 - Listar Clientes da fila");
			System.out.println("\n3 - Chamar uma pessoa da fila");
			System.out.println("\n0 - Finalizar programa");
			
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("\nDigite o nome: ");
				leia.nextLine(); //Usado para consumir a nova linha em branco e ler o "novo".
				novo = leia.nextLine();
				
				fila.add(novo);
				
				System.out.println("\nFila: ");
				System.out.println(fila);
				
				System.out.println("\nCliente " + novo + " adicionado!");
				
			break;
			
			case 2:
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
					
				} else {
					System.out.println("\nFila: ");
					System.out.println(fila);
					
				}
			break;
			
			case 3:
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
					
				} else {
					novo = fila.poll();
					
					System.out.println("\nO cliente " + novo + " foi chamado!");
					
					System.out.println("\nFila: ");
					System.out.println(fila);
					
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
