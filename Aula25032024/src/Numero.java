import java.util.Scanner;
public class Numero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int numero = entrada.nextInt();
		int antecessor = numero - 1;
		int sucessor = numero + 2;
		
		System.out.println("O antecessor de "+ numero + " é "+ antecessor);
		System.out.println("O sucessor de " + numero + " é "+ sucessor);
		
		entrada.close();
	}

}
