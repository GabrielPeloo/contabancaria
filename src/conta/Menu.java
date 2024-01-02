package conta;

import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		ContaController c4 = new ContaController();
		
		int opcao;
		
		while (true) {
			System.out.println(Cores.TEXTO_BRANCO + Cores.ANSI_BLUE_BACKGROUND +
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("                                                      ");
			System.out.println("                  BANCO OBELISCO                      ");
			System.out.println("                                                      ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Entre com a opção desejada:                           ");
			System.out.println("                                                      "+Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Banco Obelisco - OBELISCO CAMPEÃO!!");
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
				
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
				
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
				//Conta c1 = new Conta(123456, 123, 1, "Gabriel Luiz", 2500.0f);
				//c1.visualizar();
				
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				ContaCorrente c2 = new ContaCorrente("Gabriel Luiz", 40028922, 03, 30, 4500.0f, 500, 3);
				c2.visualizar();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
				
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
				
				break;
			case 10:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Conta Poupança\n\n");
				ContaPoupanca c3 = new ContaPoupanca(0.3f, 3450.0f);
				c3.visualizar();
				
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção inválida!!\n\n"+Cores.TEXT_RESET);
			
			}
			
		}
	}

}
