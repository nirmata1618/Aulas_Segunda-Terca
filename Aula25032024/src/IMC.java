import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = src.nextDouble();
		//Altura considerada como metros
		System.out.println("Informe sua altura: ");
		double altura = src.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("O seu imc deu : " + imc);

	}

}
