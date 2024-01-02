package conta.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;
	
	Scanner leia = new Scanner(System.in);
	
	private float saldoConta1 = 500;
	private float saldoConta2 = 0;
	private float valorSaldo;
	public ContaController(float saldoConta1, float saldoConta2, float valorSaldo) {
		this.saldoConta1 = saldoConta1;
		this.saldoConta2 = saldoConta2;
		this.valorSaldo = valorSaldo;
	}
	
	

	public float getSaldoConta1() {
		return saldoConta1;
	}



	public void setSaldoConta1(float saldoConta1) {
		this.saldoConta1 = saldoConta1;
	}



	public float getSaldoConta2() {
		return saldoConta2;
	}



	public void setSaldoConta2(float saldoConta2) {
		this.saldoConta2 = saldoConta2;
	}



	public float getValorSaldo() {
		return valorSaldo;
	}



	public void setValorSaldo(float valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public void sacar() {
		boolean loop = true;
		System.out.println("\n *******************************************");
		System.out.println("Seu saldo é: " + saldoConta1);
		do {
			
			try {
				System.out.println("Digite quanto deseja sacar: ");
				valorSaldo = leia.nextFloat();
		
			} catch (InputMismatchException e) {
				System.out.println("Digite valores númericos!");
				leia.nextLine();
				valorSaldo = leia.nextFloat();
			}finally {
				loop = false;
			}
		}while (loop);
		System.out.println("\nRetire o valor de " + valorSaldo +" no caixa!!");
		saldoConta1 -= valorSaldo;
		System.out.println("Saldo atual: " + saldoConta1);	
		System.out.println("\n *******************************************");
	
	}
	
	public void depositar() {
		boolean loop = true;
		System.out.println("\n *******************************************");
		System.out.println("Seu saldo é: " + saldoConta1);
		do {
			
			try {
				System.out.println("Digite quanto deseja depositar: ");
				valorSaldo = leia.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores númericos!");
				leia.nextLine();
				valorSaldo = leia.nextFloat();
			}finally {
				loop = false;
			}
		}while (loop);
		System.out.println("Foi depositado o valor de " + valorSaldo +" na sua conta!!");
		saldoConta1 += valorSaldo;
		System.out.println("Saldo atual: " + saldoConta1);	
		System.out.println("\n *******************************************");
	
	}
	
	public void transferir() {
		boolean loop = true;
		System.out.println("\n *******************************************");
		System.out.println("Seu saldo é: " + saldoConta1);
		do {
			
			try {
				System.out.println("Digite quanto deseja transferir para sua conta secundária: ");
				valorSaldo = leia.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores númericos!");
				leia.nextLine();
				valorSaldo = leia.nextFloat();
			}finally {
				loop = false;
			}
		}while (loop);
		System.out.println("Foi transferido o valor de " + valorSaldo +" para sua conta secundária!!");
		saldoConta1 -= valorSaldo;
		saldoConta2 += valorSaldo;
		System.out.println("Saldo atual da conta primária: " + saldoConta1);
		System.out.println("Saldo atual da conta secundária: " + saldoConta2);
		System.out.println("\n *******************************************");
	
	}

	@Override
	public void procurarPorNumero(int numero) {

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("O número da conta criada é "+conta.getNumero());
	}

	@Override
	public void atualizar(Conta conta) {

	}

	@Override
	public void deletar(int numero) {

	}

	@Override
	public void sacar(int numero, float valor) {

	}

	@Override
	public void depositar(int numero, float valor) {

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {

	}

	public int gerarNumero() {
		return ++ numero;
	}


}