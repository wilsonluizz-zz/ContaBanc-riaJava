package entidades;

public class Contapf {
	private String nomeTitular;
	private int numeroConta;
	private double valorDeposito;
	
	public Contapf() {
		
	}
	
	public Contapf(String nomeTitular, int numeroConta, double valorDeposito) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.valorDeposito = valorDeposito;
	}
	
	public Contapf(String nomeTitular, int numeroConta) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getValorDeposito() {
		return valorDeposito;
	}

	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	
	public double mostrasaldo(double saldo) {
		return valorDeposito ++;
	}
	
	public void opdeposito(double valor) {
		valorDeposito += valor;
	}
	
	public void opsaque(double valor) {
		 valorDeposito -= valor + 5;
	}

	public String toString() {
		return "Informações da conta: "
				+ "Dados da conta Nome: " + nomeTitular + " , Numero da conta " + numeroConta +
				" , Saldo  R$ " + valorDeposito;
	}
	
	
	
	

}
