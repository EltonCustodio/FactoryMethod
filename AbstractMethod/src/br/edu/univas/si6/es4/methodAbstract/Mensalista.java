package br.edu.univas.si6.es4.methodAbstract;

public class Mensalista extends Funcionario {

	private double salarioMensal;
	private int horasExtras;
	
	@Override
	protected CalculadoraImposto getCalculadoraImposto() {
		return new ImpostoMensalista(salarioMensal, horasExtras);
	}

	@Override
	public double salarioBruto() {
		return salarioMensal + (salarioMensal / 160 * horasExtras * 2);
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}



}
