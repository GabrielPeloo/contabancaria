package conta.model;

public class ContaPoupanca {

	private float jurosMes;
	private float saldoPoupanca;
	
	public ContaPoupanca(float juroMes,float saldoPoupanca) {
		this.jurosMes = juroMes;
		this.saldoPoupanca = saldoPoupanca;
		
	}

	public float getJurosMes() {
		return jurosMes;
	}

	public void setJurosMes(float jurosMes) {
		this.jurosMes = jurosMes;
	}

	public float getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(float saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	public void visualizar() {
		System.out.println("Essa conta gera "+jurosMes+"% de juros ao mês");
		System.out.println("Seu saldo atual é de: "+saldoPoupanca);
	}
	
}
