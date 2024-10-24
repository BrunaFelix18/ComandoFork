import java.util.Scanner;
/*Cálculo de Salário: Leia o salário de 5 funcionários e 
 * informe se cada um deles está abaixo ou acima do salário mínimo.*/
public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double salario;
		
		for (int i=1; i<= 5; i++){
		System.out.println("Informe seu salario:");
		System.out.println("Funcionario "+ i +" :");
		salario = scanner.nextDouble();
		
		if(salario>1412) {
			System.out.println("Funcionario "+ i + " seu salário está acima do salário mínimo");
		}
		else {
			System.out.println("Funcionario "+ i + " seu salário está abaixo do salário mínimo");
		}
		}
	}

}
