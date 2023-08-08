package JavaTech;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;


public class AulaQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aula Queue Fila
		
		Queue<Integer> fila = new LinkedList<Integer>();
		int i;
		
		for (i = 0; i <=10; i++) {
			fila.add(i);
			
		}
		
		System.out.println("\nElementos da fila: " + fila);

		System.out.println("\nRemovendo elemento: " + fila.remove());
		
		System.out.println("\nElementos da fila: " + fila);
		
		System.out.println("\nAdicionando o elemento 11: " + fila.add(11));
		
		System.out.println("\nElementos da fila: " + fila);
		
		System.out.println("\nPegar um elemento da fila: " + fila.peek());
		
		System.out.println("\nPegar o tamanho da fila: " + fila.size());
		
		System.out.println("\nVerificar um elementos da fila: " + fila.contains(37));
		
		System.out.println("\nExibir e retirar o primeiro elemento da fila: " + fila.poll());
		
		System.out.println("\nElementos da fila: " + fila);
		
		Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("\nLimpar a fila: ");
		fila.clear();
		System.out.println(fila);
		
		System.out.println("\nA fila está vazia? " + fila.isEmpty());
		
		
	}

}
