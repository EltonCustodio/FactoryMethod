package br.edu.univas.si6.es4.methodAbstract;

public class ImpostoMensalista implements CalculadoraImposto {

	private double salarioMensal;

	public ImpostoMensalista(double salarioMensal, int horasExtras) {
		this.salarioMensal = salarioMensal;
	}

	@Override
	public double calcularImposto() {
		return salarioMensal * .2;
	}

}
