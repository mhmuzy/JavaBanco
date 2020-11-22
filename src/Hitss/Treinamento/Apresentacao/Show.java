package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Classes.Conta;
import Hitss.Treinamento.Enum.Status;
import Hitss.Treinamento.Enum.TipoConta;
import Hitss.Treinamento.Repositorio.*;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {
		System.out.println("");
		/// *** Pula 1 linha para ajuste, da palavra n�o ficar muito colada em cima, conceito
		/// *** De Perfumaria
		System.out.println("                  Hitss Treinamento");
		/// *** T�tulo do Programa
		System.out.println("");
		/// *** Pula 1 linha para o enunciado que pede para digitar o n�mero da conta n�o 
		/// *** Ficar muito colado em cima
		System.out.println("Digita o n�mero da sua conta");
		/// *** Enunciado que pede para digitar o n�mero da sua conta
		try {
			/// *** Inicializa��o do Tratamento
			Scanner teclado = new Scanner(System.in);
			/// *** Comando para Digitar um valor pelo teclado
			int numConta;
			/// *** Variavel para digitar o valor do n�mero da conta
			numConta = teclado.nextInt();
			/// *** Comando na vari�vel para poder digitar o valor nela pelo teclado
			switch (numConta) {
			/// *** Inicio do Comando Case
			case 1:
				/// *** Caso o n�mero da Conta for 1
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a op��o desejada:");
				/// *** O programa pede para digitar a op��o desejada
				System.out.println("(1) - Consultar Conta Pelo Cpf do Funcion�rio");
				/// *** Mostrar a op��o 1 Consulta do Cpf do Usu�rio da conta para puxar
				/// *** A Informa��o dele
				System.out.println("(2) - Listar todas as Contas");
				/// *** Listar todas as contas de Todos os Usu�rios
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro;
				/// *** Declara��o da vari�vel de ponteiro
				ponteiro = teclado.nextInt();
				/// *** Vari�vel Ponteiro recebe um valor para poder digitar o valor dela
				/// *** Pelo teclado
				System.out.println("");
				/// *** Pula 1 Linha para n�o ficar o enunciado seguinte colado em cima
				if (ponteiro == 1) {
					/// *** Se o ponteiro for igual a 1
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Digite o Cpf do(a) Usu�rio(a) da Conta:");
					/// *** O Programa vai pedir para digitar o Cpf do usu�rio(a) da conta
					String cpf;
					/// *** Declara��o da Var��avel cpf do usu�rio da conta
					cpf = teclado.next();
					/// *** Vari�vel cpf do usu�rio da conta recebe um comanado que vai poder
					/// *** Colocar o valor do Cpf do usu�rio da conta pelo teclado
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Inst�ncia da Classe Conta Reposit�rio
					contaRepositorio.ConsultarConta(cpf);
					/// *** Objeto Conta Reposit�rio vai consultar a conta do usu�rio atrav�s do 
					/// *** Cpf dele
				}else if (ponteiro == 2) {
					/// *** Se Ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Vai ser feita a inst�ncia da Classe Conta Reposit�rio
					contaRepositorio.InformarTodasAsContas();
					/// *** Objeto Conta Reposit�rio Atua o M�todo Vai informar todas as Contas dos 
					/// *** Usu�rios cadastrados no banco
				}else {
					/// *** Se digitar um valor que n�o est� batendo com a informa��o informada
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a op��o informada.");
					/// *** O Programa gera a mensagem pedindo para informar a op��o informada
				}
				
				break;
				/// *** Finalizou o Processo
			case 2:
				/// *** Caso Consulte a Conta 2
				System.out.println("");
				/// *** Pula 1 linha para n�o ficar uma coisa colada na outra
				System.out.println("Selecione a Op��o Desejada:");
				/// *** O Programa pede para selecionar a op��o desejada
				System.out.println("(1) - Fazer Dep�sito");
				/// *** O Programa Informa a op��o 1 - Fazer Dep�sito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa Informa a op��o 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa Informa a Op��o 3 - Consultar Saldo
				System.out.println("");
				/// *** Pula 1 Linha
				int ponteiro2;
				/// *** Declara��o da Vari�vel Ponteiro 2
				ponteiro2 = teclado.nextInt();
				/// *** Ponteiro 2 Recebe o comando que pode botar o valor nele pelo teclado
				Conta c1 = new Conta();
				/// *** Instancia da Classe Conta
				c1.setNumConta(2);
				/// *** Atributo N�mero da Conta do Objeto Conta Recebe 2
				c1.setTipoConta(TipoConta.Conta_Poupanca);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe Conta Poupan�a
				c1.setDono("Jo�o Marques");
				/// *** Atributo Dono do Objeto Conta Recebe Jo�o Marques
				c1.setSaldo(7000.00);
				/// *** Atributp Saldo do Objeto Conta Recebe 7 mil reais.
				c1.setCpf("123.456.789-02");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-02
				c1.setStatus(Status.Ativa);
				/// *** Atributo Status do Objeto Conta Recebe: Ativa
				String alerta1 = c1.getSaldo() < 0 ? c1.getSaldo() + " Est� no Cheque Especial." : c1.getSaldo() + "";
				/// *** Declara��o da Vari�vel que valida o Saldo se a Conta do usu�rio est� ou n�o no cheque especial
				
				if (ponteiro2 == 1) {
					/// *** Se ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Reposit�rio
					contaRepositorio.Depositar(c1);
					/// *** Faz o Deposito da Conta do Usu�rio
				}else if (ponteiro2 == 2) {
					/// *** Se Ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Reposit�rio
					contaRepositorio.Sacar(c1);
					/// *** Faz o Saque na Conta do usu�rio
				}else if (ponteiro2 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositorio
					contaRepositorio.ConsultarSaldo(c1);
					/// *** � consultada o Saldo da Conta do usu�rio
				} else {
					/// *** Se digitar um n�mero que n�o est� na Op��o Informada
					System.out.println("");
					/// *** Pula 1 Linha
					System.out.println("Por favor, selecione a op��o desejada.");
					/// *** Gera a mensagem pedindo para selecionar a op��o desejada
				}
				
				break;
			case 3:
				/// *** Se o n�mero da Conta for 3
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a Op��o Desejada:");
				/// *** O Programa avisa para digitar a op��o desejada
				System.out.println("(1) - Fazer Dep�sito");
				/// *** O Programa informa a op��o 1 - Fazer dep�sito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa informa a op��o 2 Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O programa informa a op��o 3 consultar saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro3;
				/// *** Declara��o da vari�vel de ponteiro
				ponteiro3 = teclado.nextInt();
				/// *** Variavel de ponteiro recebe um comando para digitar o seu valor pelo 
				/// *** Teclado
				Conta c2 = new Conta();
				/// *** Faz a Instancia da Classe Conta
				c2.setNumConta(3);
				/// *** Atributo N�mero da Conta do Objeto Conta Recebe 3
				c2.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe Conta Corrente
				c2.setDono("Lucio Abra�o");
				/// *** Atributo Dono do Objeto Conta Recebe Lucio Abra�o
				c2.setSaldo(-300.00);
				/// *** Atributo Saldo do Objeto Conta Recebe: -300.00
				c2.setCpf("123.456.789-03");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-03
				c2.setStatus(Status.Ativa);
				/// *** Atributo Status do Objeto Conta Recebe Ativa
				String alerta2 = c2.getSaldo() < 0 ? c2.getSaldo() + " Est� no Cheque Especial." : c2.getSaldo() + "";
				/// *** Declara��o da vari�vel que verifica se a Conta do usu�rio est� ou n�o em 
				/// *** Cheque Especial
				
				if (ponteiro3 == 1) {
					/// *** Se ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Reposit�rio
					contaRepositorio.Depositar(c2);
					/// *** Faz o Deposito na Conta do usu�rio
				}else if (ponteiro3 == 2) {
					/// *** Se o ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Classe Conta Reposit�rio
					contaRepositorio.Sacar(c2);
					/// *** Faz o Saque na Conta do usu�rio
				}else if (ponteiro3 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Conta Reposit�rio
					contaRepositorio.ConsultarSaldo(c2);
					/// *** � Consultado o Saldo na Conta do Usu�rio
				} else {
					/// *** Se Digita um n�mero que n�o est� nas op��es informadas
					System.out.println("");
					/// *** Pula 1 Linha
					System.out.println("Por favor, selecione a op��o desejada.");
					/// *** O Programa informa para selecionar a op��o desejada
				}
				
				break;
			case 4:
				/// *** Se caso o n�mero da conta for 4
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a Op��o Desejada:");
				/// *** O Programa Informa para selecionar a op��o desejada
				System.out.println("(1) - Fazer Dep�sito");
				/// *** O Programa informa a op��o 1 - Fazer Dep�sito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa Informa a Op��o 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa Informa a Op��o 3 - Consultar Saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro4;
				/// *** Declara��o da vari�vel ponteiro
				ponteiro4 = teclado.nextInt();
				/// *** Variavel Ponteiro recebe um comando para digitar o seu valor pelo 
				/// *** Teclado
				Conta c3 = new Conta();
				/// *** Faz a Instancia na Classe Conta
				c3.setNumConta(4);
				/// *** Atributo N�mero da Conta do Objeto Conta Recebe 4
				c3.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta Recebe Conta Corrente
				c3.setDono("Ang�lica Bueno");
				/// *** Atributo Dono do Objeto Conta Recebe Ang�lica Bueno
				c3.setSaldo(2300.00);
				/// *** Atributo Saldo do Ojeto Conta Recebe 2300 reais
				c3.setCpf("123.456.789-04");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-04
				c3.setStatus(Status.Ativa);
				/// *** Atributo Status Recebe Ativa
				String alerta3 = c3.getSaldo() < 0 ? c3.getSaldo() + " Est� no Cheque Especial." : c3.getSaldo() + "";
				/// *** Declara��o da Vari�vel que verifica se a Conta do usu�rio est� ou n�o em cheque especial
				if (ponteiro4 == 1) {
					/// *** Se Ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositorio
					contaRepositorio.Depositar(c3);
					/// *** Faz o Deposito na Conta do Usuario
				}else if (ponteiro4 == 2) {
					/// *** Se Dep�sito for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositorio
					contaRepositorio.Sacar(c3);
					/// *** Faz o Saque na Conta do Usu�rio
				}else if (ponteiro4 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Calsse Conta Reposit�rio
					contaRepositorio.ConsultarSaldo(c3);
					/// *** Faz a Consulta do saldo na Conta do usuario
				} else {
					/// *** Se digitar um n�mero que n�o est� nas op��es informadas
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a op��o desejada.");
					/// *** O Programa informa para selecionar a op��o desejada
				}
				break;
			case 5:
				/// *** Se o N�mero da Conta For 5
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a Op��o Desejada:");
				/// *** O Programa informa para selecionar a op��o desejada
				System.out.println("(1) - Fazer Dep�sito");
				/// *** O Programa informa a op��o 1 - Fazer Dep�sito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa informa a op��o 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa informa a op��o 3 - Consultar o Saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro5;
				/// *** Declara��o da Vari�vel Ponteiro
				ponteiro5 = teclado.nextInt();
				/// *** Vari�vel Ponteiro Recebe o Comando que vai poder colocar o valor nele
				/// *** Pelo Teclado
				Conta c4 = new Conta();
				/// *** Inst�ncia na Classe Conta
				c4.setNumConta(4);
				/// *** Atributo N�mero da Conta do Objeto Conta Recebe 4
				c4.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe Conta Corrente
				c4.setDono("Maril�zia Andrade");
				/// *** Atributo Dono do Objeto Conta Recebe: Maril�zia Andrade
				c4.setSaldo(9000.00);
				/// *** Atributo Saldo do Objeto Conta Recebe: 9 mil reais
				c4.setCpf("123.456.789-05");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-05
				c4.setStatus(Status.Cancelada);
				/// *** Atributo Status do Objeto Conta Recebe: Cancelada
				String alerta4 = c4.getSaldo() < 0 ? c4.getSaldo() + " Est� no Cheque Especial." : c4.getSaldo() + "";
				/// *** Declara��o da Vari�vel que verifica se a Conta do usu�rio est� ou n�o em Cheque Especial
				if (ponteiro5 == 1) {
					/// *** Se Ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Instancia a Classe Conta Reposit�rio
					contaRepositorio.Depositar(c4);
					/// *** Faz o Deposito na Conta do Usu�rio
				}else if (ponteiro5 == 2) {
					/// *** Se Ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Instancia a Classe Conta Reposit�rio
					contaRepositorio.Sacar(c4);
					/// *** Faz o Saque na Conta do Usu�rio
				}else if (ponteiro5 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Instancia a Classe Conta Reposit�rio
					contaRepositorio.ConsultarSaldo(c4);
					/// *** Faz a Consulta do Saldo da Conta do Usu�rio
				} else {
					/// *** Se Digitar um n�mero que n�o est� nas op��es informadas
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a op��o desejada.");
					/// *** O Programa informa para selecionar a op��o desejada
				}
				break;
			case 6:
				/// *** Se o N�mero da Conta For Igual a 6
				System.out.println("");
				/// *** Pula 1 Linha
				System.out.println("Selecione a Op��o Desejada:");
				/// *** O Programa Informa Para Selecionar a Op��o Desejada
				System.out.println("(1) - Fazer Dep�sito");
				/// *** O Programa informa a op��o 1 - para fazer o Dep�sito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa informa a op��o 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa informa a op��o 3 - Consultar Saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro6;
				/// *** Declara��o da Vari�vel Ponteiro
				ponteiro6 = teclado.nextInt();
				/// *** Ponteiro Recebe o Comando que vai colocar o valor pelo teclado
				Conta c5 = new Conta();
				/// *** Instancia na Classe Conta
				c5.setNumConta(6);
				/// *** Atributo N�mero da Conta do Objeto Conta Recebe: 6
				c5.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe: Conta Correnete
				c5.setDono("Ana Lu�za");
				/// *** Atributo Dono do Objeto Conta Recebe: Ana Lu�za
				c5.setSaldo(1800.00);
				/// *** Atributo Saldo do Objeto Conta Recebe: 1800.00
				c5.setCpf("123.456.789-06");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-06
				c5.setStatus(Status.Cancelada);
				/// *** Atributo Status do Objeto Conta Recebe: Cancelada
				String alerta5 = c5.getSaldo() < 0 ? c5.getSaldo() + " Est� no Cheque Especial." : c5.getSaldo() + "";
				/// *** Declara��o da Vari�vel que ver se a Conta do Usu�rio est� ou n�o em cheque especial
				if (ponteiro6 == 1) {
					/// *** Se Ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Conta Reposit�rio
					contaRepositorio.Depositar(c5);
					/// *** Faz o Dep�sito na Conta do Usu�rio
				}else if (ponteiro6 == 2) {
					/// *** Se Ponetiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Conta Repositorio
					contaRepositorio.Sacar(c5);
					/// *** Faz o Saque na Conta do Usu�rio
				}else if (ponteiro6 == 3) {
					/// *** Se Ponteiro for igual a 3 
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Classe da Conta Reposit�rio
					contaRepositorio.ConsultarSaldo(c5);
					/// *** Faz a Consulta do Saldo da Conta do usu�rio
				} else {
					/// *** Se n�o digitar o valor conforme as op��es informadas
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a op��o desejada.");
					/// *** O Programa informa para selecionar a op��o desejada
				}
				break;
			default:
				/// *** Se digitar um n�mero da conta que n�o bate
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Nenhum usu�rio da conta encontrada.");
				/// *** O Programa informa para selecionar a op��o desejada
				break;
			}
			
		} catch (Exception e) {
			/// *** Se der um erro e cair no catch
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Erro de processamento: " + e.getMessage());
			/// *** O Programa informa o erro
		}
		
	}
}
