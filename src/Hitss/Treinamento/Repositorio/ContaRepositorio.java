package Hitss.Treinamento.Repositorio;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Enum.Status;
import Hitss.Treinamento.Enum.TipoConta;

public class ContaRepositorio {
	/// *** Classe Conta Reposit�rio
	public void Depositar(Conta c) {
		/// *** M�todo Dep�sito
		if (c.getStatus().equals(Status.Cancelada)) {
			/// *** Se Sua Conta For cancelada
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("-----------------------------------");
			/// *** Faz o Conceito de Perfumaria
			System.out.println("Prezado(a) Usu�rio(a) " + c.getDono() + ".");
			System.out.println("A sua conta est� cancelada, voc� n�o pode");
			System.out.println("Realizar nenhuma transa��o, caso n�o tenha");
			System.out.println("Feito o Cancelamento favor entrar em contato");
			System.out.println("Com o Banco: (21) 99911 - 7681");
			/// *** Gera a mensagem do usu�rio
			System.out.println("-----------------------------------");
			/// *** Faz o Conceito de Perfumaria
		}
		else
		{
			/// *** Se sua Conta Estiver Ativa
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Digite o valor do Dep�sito:");
			/// *** O Programa Pede para digitar o valor do Dep�sito
			try {
				/// *** Inicializa��o do Tratamento
				double valor;
				/// *** Declara��o da vari�vel Valor do Dep�sito
				Scanner teclado = new Scanner(System.in);
				/// *** Comando para digitar o valor pelo teclado
				valor = teclado.nextDouble();
				/// *** Comando para digitar no teclado o valor para fazer o dep�sito
				c.setSaldo(c.getSaldo() + valor);
				/// *** Saldo Recebe o Saldo + o Valor depositado
				String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Est� no Cheque Especial." : c.getSaldo() + "";
				/// *** Declara��o da Vari�vel que vai ver se o usu�rio est� ou n�o em cheque especial
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("     Resultado do Processo");
				/// *** Enunciado Resultado do Processo
				System.out.println("---------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c.getNumConta());
				/// *** Mostrar N�mero da Conta
				System.out.println("Tipo de Conta: " + c.getTipoConta());
				/// *** Mostrar Tipo da Conta
				System.out.println("Nome: " + c.getDono());
				/// *** Mostrar Dono da Conta
				System.out.println("Saldo Atual: R$ " + alerta);
				/// *** Mostrar Saldo da Conta
				System.out.println("Cpf: " + c.getCpf());
				/// *** Mostrar Cpf do Usu�rio da Conta
				System.out.println("---------------------------------");
				/// *** Conceito de Perfumaria
			} catch (Exception e) {
				/// *** Catch
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Erro de processamento: " + e.getMessage());
				/// *** Programa informa o erro
			}
		}
			
	}
	
	public void Sacar(Conta c) {
		/// *** M�todo Saque
		if (c.getStatus().equals(Status.Cancelada)) {
			/// *** Se A Conta estiver Cancelada
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("-----------------------------------");
			/// *** Conceito de Perfumaria
			System.out.println("Prezado(a) Usu�rio(a) " + c.getDono() + ".");
			System.out.println("A sua conta est� cancelada, voc� n�o pode");
			System.out.println("Realizar nenhuma transa��o, caso n�o tenha");
			System.out.println("Feito o Cancelamento favor entrar em contato");
			System.out.println("Com o Banco: (21) 99911 - 7681");
			/// *** Gerar a Mensagem de erro ao Usu�rio
			System.out.println("-----------------------------------");
			/// *** Conceito de Perfumaria
		}
		else
		{
			/// *** Se a Conta Estiver Positiva
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Digite o valor do Saque:");
			/// *** O Programa Informa Para Digitar o Valor do Saque
			try {
				/// *** Inicializa��o do Tratamento
				double valor;
				/// *** Declara��o da Vari�vel do Valor para fazer o saque
				Scanner teclado = new Scanner(System.in);
				/// *** Comando para digitar o valor pelo teclado
				valor = teclado.nextDouble();
				/// *** Comando para digitar pelo teclado o valor para fazer o Saque
				c.setSaldo(c.getSaldo() - valor);
				/// *** Saldo recebe Saldo - O valor sacado
				String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Est� no Cheque Especial." : c.getSaldo() + "";
				/// *** Declara��o da Vari�vel que verifica se a conta do usu�rio est� ou n�o em cheque especial
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("     Resultado do Processo");
				/// *** Enunciado
				System.out.println("---------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c.getNumConta());
				/// *** Informar N�mero da Conta
				System.out.println("Tipo de Conta: " + c.getTipoConta());
				/// *** Informar o Tipo da Conta
				System.out.println("Nome: " + c.getDono());
				/// *** Informar o Dono da Conta
				System.out.println("Saldo Atual: R$ " + alerta);
				/// *** Informar o Saldo da Conta
				System.out.println("Cpf: " + c.getCpf());
				/// *** Informar o Cpf do Usu�rio da Conta
				System.out.println("---------------------------------");
				/// *** Conceito de Perfumaria
			} catch (Exception e) {
				/// *** Catch
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("Erro de processamento: " + e.getMessage());
				/// *** Programa Informa o Erro
			}
		}
	}
	
	public void ConsultarSaldo(Conta c) {
		/// *** M�todo Consultar o Saldo 
		try {
			/// *** Inicializa��o do Tratamento
			String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Est� no Cheque Especial." : c.getSaldo() + "";
			/// *** Declara��o da Vari�vel que informa se a Conta do usu�rio est� ou n�o em cheque especial
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("     Resultado do Processo");
			/// *** Enunciado
			System.out.println("---------------------------------");
			/// *** Conceito de Perfumaria
			System.out.println("Conta: " + c.getNumConta());
			/// *** Informar N�mero da Conta
			System.out.println("Tipo de Conta: " + c.getTipoConta());
			/// *** Informar Tipo da Conta
			System.out.println("Nome: " + c.getDono());
			/// *** Informar Dono da Conta
			System.out.println("Saldo Atual: R$ " + alerta);
			/// *** Informar Saldo da Conta
			System.out.println("Cpf: " + c.getCpf());
			/// *** Informar Cpf do usu�rio da Conta
			System.out.println("---------------------------------");
			/// *** Conceito de Perfumaria
		} catch (Exception e) {
			/// *** Catch
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Erro de processamento: " + e.getMessage());
			/// *** Programa Informa o Erro
		}
	}
	
	public void InformarTodasAsContas() {
		/// *** M�todo Para Informar Todas as Contas 
		try {
			
			/// *** Conta 1
			Conta c1 = new Conta();
			/// *** Instanciar Conta
			c1.setNumConta(2);
			/// *** Colocar N�mero da Conta
			c1.setTipoConta(TipoConta.Conta_Poupanca);
			/// *** Informar Tipo da Conta
			c1.setDono("Jo�o Marques");
			/// *** Informar Dono da Conta
			c1.setSaldo(7000.00);
			/// *** Informar Saldo da Conta
			c1.setCpf("123.456.789-02");
			/// *** Informar Cpf da Conta
			c1.setStatus(Status.Ativa);
			/// *** Informar o Status da Conta
			String alerta1 = c1.getSaldo() < 0 ? c1.getSaldo() + " Est� no Cheque Especial." : c1.getSaldo() + "";
			/// *** Declara��o da Vari�vel Que Informa se o Usu�rio est� ou n�o em Cheque especial
			
			/// *** Conta 2
			Conta c2 = new Conta();
			/// *** Instancia da Classe Conta
			c2.setNumConta(3);
			/// *** Cadastrar N�mero da Conta
			c2.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo da Conta
			c2.setDono("Lucio Abra�o");
			/// *** Cadastrar Dono da Conta
			c2.setSaldo(-300.00);
			/// *** Cadastrar Saldo da Conta
			c2.setCpf("123.456.789-03");
			/// *** Cadastar Cpf da Conta
			c2.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta2 = c2.getSaldo() < 0 ? c2.getSaldo() + " Est� no Cheque Especial." : c2.getSaldo() + "";
			/// *** Declara��o da Vari�vel que verifica se a Conta do usu�rio est� ou n�o em cheque especial
			
			/// *** Conta 3
			Conta c3 = new Conta();
			/// *** Instancia da Classe Conta
			c3.setNumConta(4);
			/// *** Cadastrar N�mero da Conta
			c3.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo da Conta
			c3.setDono("Ang�lica Bueno");
			/// *** Cadastrar Dono da Conta
			c3.setSaldo(2300.00);
			/// *** Cadastrar Saldo da Conta
			c3.setCpf("123.456.789-04");
			/// *** Cadastrar Cpf da Conta
			c3.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			
			/// *** Conta 4
			Conta c4 = new Conta();
			/// *** Instanciar a Classe Conta
			c4.setNumConta(5);
			/// *** Cadastar N�mero da Conta
			c4.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c4.setDono("Maril�zia Andrade");
			/// *** Cadastrar Dono da Conta
			c4.setSaldo(9000.00);
			/// *** Cadastrar Saldo da Conta
			c4.setCpf("123.456.789-05");
			/// *** Cadastrar Cpf da Conta
			c4.setStatus(Status.Cancelada);
			/// *** Cadastrar Status da Conta
			
			/// *** Conta 5
			Conta c5 = new Conta();
			/// *** Instanciar Classe Conta
			c5.setNumConta(6);
			/// *** Cadastrar N�mero da Conta
			c5.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c5.setDono("Ana Lu�za");
			/// *** Cadastrar Dono da Conta
			c5.setSaldo(1800.00);
			/// *** Cadastrar Saldo da Conta
			c5.setCpf("123.456.789-06");
			/// *** Cadastrar Cpf da Conta
			c5.setStatus(Status.Cancelada);
			/// *** Cadastrar Status da Conta
			
			System.out.println("");
			/// *** Pular 1 linha
			System.out.println("                Resultado da Consulta");
			/// *** Enunciado
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			/// *** Conceito de Perfumaria
			System.out.println("Conta: " + c1.getNumConta() + ", Nome: " + c1.getDono() + ", Tipo de Conta: " + c1.getTipoConta() + ", Saldo: " + alerta1 + ", Cpf: " + c1.getCpf());
			/// *** Registro 1
			System.out.println("Conta: " + c2.getNumConta() + ", Nome: " + c2.getDono() + ", Tipo de Conta: " + c2.getTipoConta() + ", Saldo: " + alerta2 + ", Cpf: " + c2.getCpf());
			/// *** Registro 2
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			/// *** Conceito de Perfumaria
		} catch (Exception e) {
			/// *** Catch
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Erro de processamento:" + e.getMessage());
			/// *** Programa informa o Erro
		}
		
	}
	
	public void ConsultarConta(String cpf) {
		/// *** M�todo Consulta Conta
try {
	/// *** In�cio do Tratamento		
	
			/// *** Conta 1
			Conta c1 = new Conta();
			/// *** Instanciar a Classe Conta
			c1.setNumConta(2);
			/// *** Cadastrar N�mero da Conta
			c1.setTipoConta(TipoConta.Conta_Poupanca);
			/// *** Cadsatrar Tipo de Conta
			c1.setDono("Jo�o Marques");
			/// *** Cadastrar Dono da Conta
			c1.setSaldo(7000.00);
			/// *** Cadastrar Saldo da Conta
			c1.setCpf("123.456.789-02");
			/// *** Cadastrar Cpf da Conta
			c1.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta1 = c1.getSaldo() < 0 ? c1.getSaldo() + " Est� no Cheque Especial." : c1.getSaldo() + "";
			/// *** Declara��o da Vari�vel que verifica se a Conta do usu�rio est� ou n�o em cheque especial
			
			/// *** Conta 2
			Conta c2 = new Conta();
			/// *** Instanciar a Classe Conta
			c2.setNumConta(3);
			/// *** Cadastrar N�mero da Conta
			c2.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c2.setDono("Lucio Abra�o");
			/// *** Cadastrar Dono da Conta
			c2.setSaldo(-300.00);
			/// *** Cadastrar Saldo da Conta
			c2.setCpf("123.456.789-03");
			/// *** Cadastrar Cpf da Conta
			c2.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta2 = c2.getSaldo() < 0 ? c2.getSaldo() + " Est� no Cheque Especial." : c2.getSaldo() + "";
			/// *** Declara��o da vari�vel que verificar se o usu�rio est� ou n�o ativo
			
			/// *** Conta 3
			Conta c3 = new Conta();
			/// *** Instancia da Classe Conta
			c3.setNumConta(4);
			/// *** Cadastrar N�mero da Conta
			c3.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c3.setDono("Ang�lica Bueno");
			/// *** Cadastrar Dono da Conta
			c3.setSaldo(2300.00);
			/// *** Cadastrar Saldo da Conta
			c3.setCpf("123.456.789-04");
			/// *** Cadastrar Cpf da Conta
			c3.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta3 = c3.getSaldo() < 0 ? c3.getSaldo() + " Est� no Cheque Especial." : c3.getSaldo() + "";
			/// *** Declara��o da Vari�vel que verifica se o usu�rio est� ou n�o em cheque especial
			
			/// *** Conta 4
			Conta c4 = new Conta();
			/// *** Instancia da Classe Conta
			c4.setNumConta(4);
			/// *** Cadastrar N�mero da Conta
			c4.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo da Conta
			c4.setDono("Maril�zia Andrade");
			c4.setSaldo(9000.00);
			c4.setCpf("123.456.789-05");
			c4.setStatus(Status.Cancelada);
			String alerta4 = c4.getSaldo() < 0 ? c4.getSaldo() + " Est� no Cheque Especial." : c4.getSaldo() + "";

			/// *** Conta 5
			Conta c5 = new Conta();
			/// *** Inst�ncia da Conta 5
			c5.setNumConta(6);
			/// *** Setando o Valor no atributo n�mero da conta
			c5.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Setando o Valor no valor tipo da conta
			c5.setDono("Ana Lu�za");
			/// *** Setando o valor no atributo Dono da Conta isto �, o usu�rio da conta
			c5.setSaldo(1800.00);
			/// *** Setando o Valor Saldo da Conta
			c5.setCpf("123.456.789-06");
			/// *** Setando o Valor Cpf da Conta
			c5.setStatus(Status.Cancelada);
			/// *** Setando o Valor Status da Conta
			String alerta5 = c5.getSaldo() < 0 ? c5.getSaldo() + " Est� no Cheque Especial." : c5.getSaldo() + "";
			/// *** Declara��o da vari�vel que vai validar se a conta do usu�rio est� ou n�o em cheque especial
			if (c1.getCpf().equals(cpf)) {
				/// *** Se o Cpf da Conta for igual ao parametro Cpf
				System.out.println("");
				/// *** Pula 1 linha para o resultado da consulta n�o ficar muito bagun�ado
				System.out.println("                Resultado da Consulta");
				/// *** T�tulo Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c1.getNumConta());   
				/// *** Mostra N�mero da Conta
				System.out.println("Nome: " + c1.getDono());
				/// *** Mostra Usu�rio da Conta
				System.out.println("Tipo de Conta: " + c1.getTipoConta());
				/// *** Mostrar Tipo da Conta
				System.out.println("Saldo: " + alerta1);
				/// *** Mostrar o Saldo da Conta
				System.out.println("Cpf: " + c1.getCpf());
				/// *** Mostrar o Cpf 
				System.out.println("Status: " + c1.getStatus());
				/// *** Mostrar o Status
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}else if (c2.getCpf().equals(cpf)) {
				/// *** Se o Atributo Cpf for igual ao par�metri Cpf
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado do Resultado
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c2.getNumConta());
				/// *** Mostra N�mero da Conta
				System.out.println("Nome: " + c2.getDono());
				/// *** Mostrar Usu�rio da Conta
				System.out.println("Tipo de Conta: " + c2.getTipoConta());
				/// *** Mostrar Tipo de Conta
				System.out.println("Saldo: " + alerta2);
				/// *** Mostrar o Saldo da Conta
				System.out.println("Cpf: " + c2.getCpf());
				/// *** Mostrar o Cpf da Conta
				System.out.println("Status: " + c2.getStatus());
				/// *** Mostrar o Saldo da Conta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}else if (c3.getCpf().equals(cpf)) {
				/// *** Se o Atributo Cpf for Igual ao Par�metro Cpf
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c3.getNumConta());
				/// *** Mostrar N�mero da Conta
				System.out.println("Nome: " + c3.getDono());
				/// *** Mostrar Usu�rio da Conta
				System.out.println("Tipo de Conta: " + c3.getTipoConta());
				/// *** Mostrar o Tipo da Conta
				System.out.println("Saldo: " + alerta3);
				/// *** Mostrar o Saldo da Conta
				System.out.println("Cpf: " + c3.getCpf());
				/// *** Mostrar o Cpf do Usu�rio da Conta
				System.out.println("Status: " + c3.getStatus());
				/// *** Mostrar o Status da Conta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}else if (c4.getCpf().equals(cpf)) {
				/// *** Se o Atributo Cpf for igual ao Par�metro Cpf
				System.out.println("");
				/// *** Pula 1 Linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c4.getNumConta());   
				/// *** Atributo N�mero da Conta
				System.out.println("Nome: " + c4.getDono());
				/// *** Atributo Usu�rio da Conta
				System.out.println("Tipo de Conta: " + c4.getTipoConta());
				/// *** Mostrar Tipo da Conta
				System.out.println("Saldo: " + alerta4);
				/// *** Mostrar Saldo da Conta 
				System.out.println("Cpf: " + c4.getCpf());
				/// *** Mostrar Cpf
				System.out.println("Status: " + c4.getStatus());
				/// *** Mostrar Status da Conta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}else if (c5.getCpf().equals(cpf)) {
				/// *** Se o Atributo Cpf for igual ao Parametro Cpf
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c5.getNumConta());
				/// *** Mostrar N�mero da Conta
				System.out.println("Nome: " + c5.getDono());
				/// *** Mostrar Usu�rio da Conta
				System.out.println("Tipo de Conta: " + c5.getTipoConta());
				/// *** Mostrar Tipo da Conta
				System.out.println("Saldo: " + alerta5);
				/// *** Mostrar Saldo da Conta
				System.out.println("Cpf: " + c5.getCpf());
				/// *** Mostra Cpf do Usu�rio da Conta
				System.out.println("Status: " + c5.getStatus());
				/// *** Mostrar Status da Conta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}else {
				/// *** Se n�o for encontrado nenhum resultado do Usu�rio
				System.out.println("");
				/// *** Pular 1 linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Nenhuma Conta Encontrada.");
				/// *** O Resultado de que n�o foi encontrado nenhum resultado
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}
		} catch (Exception e) {
			/// *** Captura do Erro
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Erro de processamento:" + e.getMessage());
			/// *** Mensagem de erro
		}
	}
}
