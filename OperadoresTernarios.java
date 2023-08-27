package fundamentos;

import java.util.Scanner;

public class DesafioDoModulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qual operacao deseja realizar?: \n(+) - Soma\n(-) - Subtracao\n(*) - Multiplicacao\n(/) - Divisao\n(%) - Modulo\n");
		String operacao = entrada.nextLine();
		
		System.out.print("Digite o primeiro numero: ");
		Double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		Double num2 = entrada.nextDouble();
		
		//Lógica do cálculo
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		entrada.close();
		
		System.out.printf("O resultado da operacao foi: %.2f %s %.2f = %.2f",num1,operacao,num2,resultado);
		
		
	}
}
