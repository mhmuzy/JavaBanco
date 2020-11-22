package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Classes.Conta;
import Hitss.Treinamento.Enum.Status;
import Hitss.Treinamento.Enum.TipoConta;
import Hitss.Treinamento.Repositorio.*;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {
		System.out.println("");
		/// *** Pula 1 linha para ajuste, da palavra não ficar muito colada em cima, conceito
		/// *** De Perfumaria
		System.out.println("                  Hitss Treinamento");
		/// *** Título do Programa
		System.out.println("");
		/// *** Pula 1 linha para o enunciado que pede para digitar o número da conta não 
		/// *** Ficar muito colado em cima
		System.out.println("Digita o número da sua conta");
		/// *** Enunciado que pede para digitar o número da sua conta
		try {
			/// *** Inicialização do Tratamento
			Scanner teclado = new Scanner(System.in);
			/// *** Comando para Digitar um valor pelo teclado
			int numConta;
			/// *** Variavel para digitar o valor do número da conta
			numConta = teclado.nextInt();
			/// *** Comando na variável para poder digitar o valor nela pelo teclado
			switch (numConta) {
			/// *** Inicio do Comando Case
			case 1:
				/// *** Caso o número da Conta for 1
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a opção desejada:");
				/// *** O programa pede para digitar a opção desejada
				System.out.println("(1) - Consultar Conta Pelo Cpf do Funcionário");
				/// *** Mostrar a opção 1 Consulta do Cpf do Usuário da conta para puxar
				/// *** A Informação dele
				System.out.println("(2) - Listar todas as Contas");
				/// *** Listar todas as contas de Todos os Usuários
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro;
				/// *** Declaração da variável de ponteiro
				ponteiro = teclado.nextInt();
				/// *** Variável Ponteiro recebe um valor para poder digitar o valor dela
				/// *** Pelo teclado
				System.out.println("");
				/// *** Pula 1 Linha para não ficar o enunciado seguinte colado em cima
				if (ponteiro == 1) {
					/// *** Se o ponteiro for igual a 1
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Digite o Cpf do(a) Usuário(a) da Conta:");
					/// *** O Programa vai pedir para digitar o Cpf do usuário(a) da conta
					String cpf;
					/// *** Declaração da Varíáavel cpf do usuário da conta
					cpf = teclado.next();
					/// *** Variável cpf do usuário da conta recebe um comanado que vai poder
					/// *** Colocar o valor do Cpf do usuário da conta pelo teclado
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Instância da Classe Conta Repositório
					contaRepositorio.ConsultarConta(cpf);
					/// *** Objeto Conta Repositório vai consultar a conta do usuário através do 
					/// *** Cpf dele
				}else if (ponteiro == 2) {
					/// *** Se Ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Vai ser feita a instância da Classe Conta Repositório
					contaRepositorio.InformarTodasAsContas();
					/// *** Objeto Conta Repositório Atua o Método Vai informar todas as Contas dos 
					/// *** Usuários cadastrados no banco
				}else {
					/// *** Se digitar um valor que não está batendo com a informação informada
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a opção informada.");
					/// *** O Programa gera a mensagem pedindo para informar a opção informada
				}
				
				break;
				/// *** Finalizou o Processo
			case 2:
				/// *** Caso Consulte a Conta 2
				System.out.println("");
				/// *** Pula 1 linha para não ficar uma coisa colada na outra
				System.out.println("Selecione a Opção Desejada:");
				/// *** O Programa pede para selecionar a opção desejada
				System.out.println("(1) - Fazer Depósito");
				/// *** O Programa Informa a opção 1 - Fazer Depósito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa Informa a opção 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa Informa a Opção 3 - Consultar Saldo
				System.out.println("");
				/// *** Pula 1 Linha
				int ponteiro2;
				/// *** Declaração da Variável Ponteiro 2
				ponteiro2 = teclado.nextInt();
				/// *** Ponteiro 2 Recebe o comando que pode botar o valor nele pelo teclado
				Conta c1 = new Conta();
				/// *** Instancia da Classe Conta
				c1.setNumConta(2);
				/// *** Atributo Número da Conta do Objeto Conta Recebe 2
				c1.setTipoConta(TipoConta.Conta_Poupanca);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe Conta Poupança
				c1.setDono("João Marques");
				/// *** Atributo Dono do Objeto Conta Recebe João Marques
				c1.setSaldo(7000.00);
				/// *** Atributp Saldo do Objeto Conta Recebe 7 mil reais.
				c1.setCpf("123.456.789-02");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-02
				c1.setStatus(Status.Ativa);
				/// *** Atributo Status do Objeto Conta Recebe: Ativa
				String alerta1 = c1.getSaldo() < 0 ? c1.getSaldo() + " Está no Cheque Especial." : c1.getSaldo() + "";
				/// *** Declaração da Variável que valida o Saldo se a Conta do usuário está ou não no cheque especial
				
				if (ponteiro2 == 1) {
					/// *** Se ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositório
					contaRepositorio.Depositar(c1);
					/// *** Faz o Deposito da Conta do Usuário
				}else if (ponteiro2 == 2) {
					/// *** Se Ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositório
					contaRepositorio.Sacar(c1);
					/// *** Faz o Saque na Conta do usuário
				}else if (ponteiro2 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositorio
					contaRepositorio.ConsultarSaldo(c1);
					/// *** É consultada o Saldo da Conta do usuário
				} else {
					/// *** Se digitar um número que não está na Opção Informada
					System.out.println("");
					/// *** Pula 1 Linha
					System.out.println("Por favor, selecione a opção desejada.");
					/// *** Gera a mensagem pedindo para selecionar a opção desejada
				}
				
				break;
			case 3:
				/// *** Se o número da Conta for 3
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a Opção Desejada:");
				/// *** O Programa avisa para digitar a opção desejada
				System.out.println("(1) - Fazer Depósito");
				/// *** O Programa informa a opção 1 - Fazer depósito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa informa a opção 2 Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O programa informa a opção 3 consultar saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro3;
				/// *** Declaração da variável de ponteiro
				ponteiro3 = teclado.nextInt();
				/// *** Variavel de ponteiro recebe um comando para digitar o seu valor pelo 
				/// *** Teclado
				Conta c2 = new Conta();
				/// *** Faz a Instancia da Classe Conta
				c2.setNumConta(3);
				/// *** Atributo Número da Conta do Objeto Conta Recebe 3
				c2.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe Conta Corrente
				c2.setDono("Lucio Abraão");
				/// *** Atributo Dono do Objeto Conta Recebe Lucio Abraão
				c2.setSaldo(-300.00);
				/// *** Atributo Saldo do Objeto Conta Recebe: -300.00
				c2.setCpf("123.456.789-03");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-03
				c2.setStatus(Status.Ativa);
				/// *** Atributo Status do Objeto Conta Recebe Ativa
				String alerta2 = c2.getSaldo() < 0 ? c2.getSaldo() + " Está no Cheque Especial." : c2.getSaldo() + "";
				/// *** Declaração da variável que verifica se a Conta do usuário está ou não em 
				/// *** Cheque Especial
				
				if (ponteiro3 == 1) {
					/// *** Se ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositório
					contaRepositorio.Depositar(c2);
					/// *** Faz o Deposito na Conta do usuário
				}else if (ponteiro3 == 2) {
					/// *** Se o ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Classe Conta Repositório
					contaRepositorio.Sacar(c2);
					/// *** Faz o Saque na Conta do usuário
				}else if (ponteiro3 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Conta Repositório
					contaRepositorio.ConsultarSaldo(c2);
					/// *** É Consultado o Saldo na Conta do Usuário
				} else {
					/// *** Se Digita um número que não está nas opções informadas
					System.out.println("");
					/// *** Pula 1 Linha
					System.out.println("Por favor, selecione a opção desejada.");
					/// *** O Programa informa para selecionar a opção desejada
				}
				
				break;
			case 4:
				/// *** Se caso o número da conta for 4
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a Opção Desejada:");
				/// *** O Programa Informa para selecionar a opção desejada
				System.out.println("(1) - Fazer Depósito");
				/// *** O Programa informa a opção 1 - Fazer Depósito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa Informa a Opção 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa Informa a Opção 3 - Consultar Saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro4;
				/// *** Declaração da variável ponteiro
				ponteiro4 = teclado.nextInt();
				/// *** Variavel Ponteiro recebe um comando para digitar o seu valor pelo 
				/// *** Teclado
				Conta c3 = new Conta();
				/// *** Faz a Instancia na Classe Conta
				c3.setNumConta(4);
				/// *** Atributo Número da Conta do Objeto Conta Recebe 4
				c3.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta Recebe Conta Corrente
				c3.setDono("Angélica Bueno");
				/// *** Atributo Dono do Objeto Conta Recebe Angélica Bueno
				c3.setSaldo(2300.00);
				/// *** Atributo Saldo do Ojeto Conta Recebe 2300 reais
				c3.setCpf("123.456.789-04");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-04
				c3.setStatus(Status.Ativa);
				/// *** Atributo Status Recebe Ativa
				String alerta3 = c3.getSaldo() < 0 ? c3.getSaldo() + " Está no Cheque Especial." : c3.getSaldo() + "";
				/// *** Declaração da Variável que verifica se a Conta do usuário está ou não em cheque especial
				if (ponteiro4 == 1) {
					/// *** Se Ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositorio
					contaRepositorio.Depositar(c3);
					/// *** Faz o Deposito na Conta do Usuario
				}else if (ponteiro4 == 2) {
					/// *** Se Depósito for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Classe Conta Repositorio
					contaRepositorio.Sacar(c3);
					/// *** Faz o Saque na Conta do Usuário
				}else if (ponteiro4 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Calsse Conta Repositório
					contaRepositorio.ConsultarSaldo(c3);
					/// *** Faz a Consulta do saldo na Conta do usuario
				} else {
					/// *** Se digitar um número que não está nas opções informadas
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a opção desejada.");
					/// *** O Programa informa para selecionar a opção desejada
				}
				break;
			case 5:
				/// *** Se o Número da Conta For 5
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Selecione a Opção Desejada:");
				/// *** O Programa informa para selecionar a opção desejada
				System.out.println("(1) - Fazer Depósito");
				/// *** O Programa informa a opção 1 - Fazer Depósito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa informa a opção 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa informa a opção 3 - Consultar o Saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro5;
				/// *** Declaração da Variável Ponteiro
				ponteiro5 = teclado.nextInt();
				/// *** Variável Ponteiro Recebe o Comando que vai poder colocar o valor nele
				/// *** Pelo Teclado
				Conta c4 = new Conta();
				/// *** Instância na Classe Conta
				c4.setNumConta(4);
				/// *** Atributo Número da Conta do Objeto Conta Recebe 4
				c4.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe Conta Corrente
				c4.setDono("Marilúzia Andrade");
				/// *** Atributo Dono do Objeto Conta Recebe: Marilúzia Andrade
				c4.setSaldo(9000.00);
				/// *** Atributo Saldo do Objeto Conta Recebe: 9 mil reais
				c4.setCpf("123.456.789-05");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-05
				c4.setStatus(Status.Cancelada);
				/// *** Atributo Status do Objeto Conta Recebe: Cancelada
				String alerta4 = c4.getSaldo() < 0 ? c4.getSaldo() + " Está no Cheque Especial." : c4.getSaldo() + "";
				/// *** Declaração da Variável que verifica se a Conta do usuário está ou não em Cheque Especial
				if (ponteiro5 == 1) {
					/// *** Se Ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Instancia a Classe Conta Repositório
					contaRepositorio.Depositar(c4);
					/// *** Faz o Deposito na Conta do Usuário
				}else if (ponteiro5 == 2) {
					/// *** Se Ponteiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Instancia a Classe Conta Repositório
					contaRepositorio.Sacar(c4);
					/// *** Faz o Saque na Conta do Usuário
				}else if (ponteiro5 == 3) {
					/// *** Se Ponteiro for igual a 3
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Instancia a Classe Conta Repositório
					contaRepositorio.ConsultarSaldo(c4);
					/// *** Faz a Consulta do Saldo da Conta do Usuário
				} else {
					/// *** Se Digitar um número que não está nas opções informadas
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a opção desejada.");
					/// *** O Programa informa para selecionar a opção desejada
				}
				break;
			case 6:
				/// *** Se o Número da Conta For Igual a 6
				System.out.println("");
				/// *** Pula 1 Linha
				System.out.println("Selecione a Opção Desejada:");
				/// *** O Programa Informa Para Selecionar a Opção Desejada
				System.out.println("(1) - Fazer Depósito");
				/// *** O Programa informa a opção 1 - para fazer o Depósito
				System.out.println("(2) - Fazer Saque");
				/// *** O Programa informa a opção 2 - Fazer Saque
				System.out.println("(3) - Consultar Saldo");
				/// *** O Programa informa a opção 3 - Consultar Saldo
				System.out.println("");
				/// *** Pula 1 linha
				int ponteiro6;
				/// *** Declaração da Variável Ponteiro
				ponteiro6 = teclado.nextInt();
				/// *** Ponteiro Recebe o Comando que vai colocar o valor pelo teclado
				Conta c5 = new Conta();
				/// *** Instancia na Classe Conta
				c5.setNumConta(6);
				/// *** Atributo Número da Conta do Objeto Conta Recebe: 6
				c5.setTipoConta(TipoConta.Conta_Corrente);
				/// *** Atributo Tipo de Conta do Objeto Conta Recebe: Conta Correnete
				c5.setDono("Ana Luíza");
				/// *** Atributo Dono do Objeto Conta Recebe: Ana Luíza
				c5.setSaldo(1800.00);
				/// *** Atributo Saldo do Objeto Conta Recebe: 1800.00
				c5.setCpf("123.456.789-06");
				/// *** Atributo Cpf do Objeto Conta Recebe: 123.456.789-06
				c5.setStatus(Status.Cancelada);
				/// *** Atributo Status do Objeto Conta Recebe: Cancelada
				String alerta5 = c5.getSaldo() < 0 ? c5.getSaldo() + " Está no Cheque Especial." : c5.getSaldo() + "";
				/// *** Declaração da Variável que ver se a Conta do Usuário está ou não em cheque especial
				if (ponteiro6 == 1) {
					/// *** Se Ponteiro for igual a 1
					
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Conta Repositório
					contaRepositorio.Depositar(c5);
					/// *** Faz o Depósito na Conta do Usuário
				}else if (ponteiro6 == 2) {
					/// *** Se Ponetiro for igual a 2
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia da Conta Repositorio
					contaRepositorio.Sacar(c5);
					/// *** Faz o Saque na Conta do Usuário
				}else if (ponteiro6 == 3) {
					/// *** Se Ponteiro for igual a 3 
					ContaRepositorio contaRepositorio = new ContaRepositorio();
					/// *** Faz a Instancia na Classe da Conta Repositório
					contaRepositorio.ConsultarSaldo(c5);
					/// *** Faz a Consulta do Saldo da Conta do usuário
				} else {
					/// *** Se não digitar o valor conforme as opções informadas
					System.out.println("");
					/// *** Pula 1 linha
					System.out.println("Por favor, selecione a opção desejada.");
					/// *** O Programa informa para selecionar a opção desejada
				}
				break;
			default:
				/// *** Se digitar um número da conta que não bate
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Nenhum usuário da conta encontrada.");
				/// *** O Programa informa para selecionar a opção desejada
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
