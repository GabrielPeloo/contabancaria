package conta.model;

public class ContaCorrente {
	//Atributos do objeto
	private int numeroCartao;
	private int limiteSaque;
	private int validadeM;
	private int validadeA;
	private int tipo;
	private String titular;
	private float saldo;
	//public ContaCorrente(String titular, int numeroCartao, int validadeM, int validadeA, float saldo, int limiteSaque, int tipo)
	public ContaCorrente(String titular, int numeroCartao, int validadeM, int validadeA, float saldo, int limiteSaque, int tipo) {
		this.titular = titular;
		this.numeroCartao = numeroCartao;
		this.validadeM= validadeM;
		this.validadeA= validadeA;
		this.saldo = saldo;
		this.limiteSaque= limiteSaque;
		this.tipo = tipo;
				
	}
	
// get retorno a informação
	public int getNumero() {
		return numeroCartao;
	}
	
// set estamos inserindo uma informação no atributo
	public void setNumero(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getAgencia() {
		return limiteSaque;
	}

	public void setAgencia(int limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getValidadeM() {
		return validadeM;
	}
	public void setSaldo(int validadeM) {
		this.validadeM = validadeM;
	}
	public int getValidadeA() {
		return validadeA;
	}

	public void setValidadeA(int validadeA) {
		this.validadeA = validadeA;
	}

	public void visualizar() {
		System.out.println("\n *******************************************");
		System.out.println("Titular: " + this.titular);
		System.out.println("\n *******************************************");
		System.out.println("Numero do Cartão: " + this.numeroCartao);
		System.out.println("\n *******************************************");
		System.out.println("Validade do Cartão: " + this.validadeM+"/"+this.validadeA);
		System.out.println("\n *******************************************");
		System.out.println("Saldo: " + this.saldo+"\n");
		System.out.println("\n *******************************************");
		System.out.println("Limite de Saque: " + this.limiteSaque);
		System.out.println("\n *******************************************");
		System.out.println("Cheque Especial: " + this.tipo);
		
		
	
	}
}
