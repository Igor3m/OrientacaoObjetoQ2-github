package aplica��o;

import java.util.Scanner;

import entidade.Salario;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Salario s = new Salario();
		s.nome = sc.nextLine();
		s.salarioBruto = sc.nextDouble();
		s.imposto = sc.nextDouble();
		
		s.dadosFuncionario();
		
		double porcentagem;
		System.out.println("Qual a porcentagem ir� aumentar no salario?");
		porcentagem = sc.nextDouble();
		
		s.salarioComPorcentagem(porcentagem);
		
		sc.close();
	}

}
