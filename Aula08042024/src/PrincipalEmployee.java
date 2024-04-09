import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrincipalEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Informe seu nome: ");
        emp.name = sc.nextLine();


        System.out.println("Informe seu salario bruto: ");
        emp.grossSalary = sc.nextDouble();


        System.out.println("Informe a taxa: ");
        emp.tax = sc.nextDouble();


        System.out.println("Employee: " + emp);


        System.out.println("Informe a porcentagem de Aumento");
        double increasePercent = sc.nextDouble();
        emp.increaseSalary(increasePercent);

        System.out.println("Updated data: " + emp);
        }
    }