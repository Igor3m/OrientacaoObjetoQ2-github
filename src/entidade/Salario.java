package entidade;

public class Salario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public void dadosFuncionario() {
		double salarioLiquido = salarioBruto - imposto;
		System.out.println(nome + "," + " " + "$" + " " + salarioLiquido);
	}
	
	public void salarioComPorcentagem(double porcentagem) {
		porcentagem = porcentagem / 100;
		porcentagem = salarioBruto * porcentagem;
		salarioBruto += porcentagem;
		double salarioLiquido = salarioBruto-imposto;
		
		System.out.println(nome + "," + " " + "$" + " " + salarioLiquido);
		
	}

}
