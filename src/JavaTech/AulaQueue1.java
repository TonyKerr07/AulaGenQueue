package JavaTech;

import java.util.Stack;
import java.util.Iterator;

public class AulaQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aula Queue 1 - Stack
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato preto");
		
		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nRetirar o elemento: " + pilha.pop());

		System.out.println("\nElementos da Pilha: " + pilha);

		System.out.println("\nRetirar o elemento: " + pilha.pop());

		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nElemento do topo da Pilha: " + pilha.peek());
		
		System.out.println("\nAdicionar um elemento na Pilha: " + pilha.push("Prato Roxo"));
		
		System.out.println("\nElementos da Pilha: " + pilha);
		
		System.out.println("\nTamanho da Pilha: " + pilha.size());
		
		System.out.println("\nO elemento prato verde existe na Pilha: " + pilha.contains("Prato Verde"));
		
		System.out.println("\nExibir todos os elementos da Pilha através do ITERATOR: ");

		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		pilha.clear();
		
		System.out.println("\nA pilha está vazia?" + pilha.isEmpty());
		
	}

}
