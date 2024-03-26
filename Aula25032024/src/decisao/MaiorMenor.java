package decisao;
import java.util.Scanner;
public class MaiorMenor {

	public static void main(String[] args) {
		Scanner fonte = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int a1 = fonte.nextInt();
		System.out.println("Digite outro número: ");
		int a2 = fonte.nextInt();
		if(a1 > a2) {
			System.out.println(a1+" é maior que "+a2);
		} else if(a1 < a2) {
			System.out.println(a2 +" é maior que "+a1);
		} else {
			System.out.println(a1 +" é igual a "+ a2);
		}
	}

}
