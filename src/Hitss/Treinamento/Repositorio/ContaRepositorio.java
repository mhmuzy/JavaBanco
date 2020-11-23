package Hitss.Treinamento.Repositorio;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Enum.Status;
import Hitss.Treinamento.Enum.TipoConta;

public class ContaRepositorio {
	/// *** Classe Conta Repositório
	public void Depositar(Conta c) {
		/// *** Método Depósito
		if (c.getStatus().equals(Status.Cancelada)) {
			/// *** Se Sua Conta For cancelada
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("-----------------------------------");
			/// *** Faz o Conceito de Perfumaria
			System.out.println("Prezado(a) Usuário(a) " + c.getDono() + ".");
			System.out.println("A sua conta está cancelada, você não pode");
			System.out.println("Realizar nenhuma transação, caso não tenha");
			System.out.println("Feito o Cancelamento favor entrar em contato");
			System.out.println("Com o Banco: (21) 99911 - 7681");
			/// *** Gera a mensagem do usuário
			System.out.println("-----------------------------------");
			/// *** Faz o Conceito de Perfumaria
		}
		else
		{
			/// *** Se sua Conta Estiver Ativa
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("Digite o valor do Depósito:");
			/// *** O Programa Pede para digitar o valor do Depósito
			try {
				/// *** Inicialização do Tratamento
				double valor;
				/// *** Declaração da variável Valor do Depósito
				Scanner teclado = new Scanner(System.in);
				/// *** Comando para digitar o valor pelo teclado
				valor = teclado.nextDouble();
				/// *** Comando para digitar no teclado o valor para fazer o depósito
				c.setSaldo(c.getSaldo() + valor);
				/// *** Saldo Recebe o Saldo + o Valor depositado
				String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Está no Cheque Especial." : c.getSaldo() + "";
				/// *** Declaração da Variável que vai ver se o usuário está ou não em cheque especial
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("     Resultado do Processo");
				/// *** Enunciado Resultado do Processo
				System.out.println("---------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c.getNumConta());
				/// *** Mostrar Número da Conta
				System.out.println("Tipo de Conta: " + c.getTipoConta());
				/// *** Mostrar Tipo da Conta
				System.out.println("Nome: " + c.getDono());
				/// *** Mostrar Dono da Conta
				System.out.println("Saldo Atual: R$ " + alerta);
				/// *** Mostrar Saldo da Conta
				System.out.println("Cpf: " + c.getCpf());
				/// *** Mostrar Cpf do Usuário da Conta
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
		/// *** Método Saque
		if (c.getStatus().equals(Status.Cancelada)) {
			/// *** Se A Conta estiver Cancelada
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("-----------------------------------");
			/// *** Conceito de Perfumaria
			System.out.println("Prezado(a) Usuário(a) " + c.getDono() + ".");
			System.out.println("A sua conta está cancelada, você não pode");
			System.out.println("Realizar nenhuma transação, caso não tenha");
			System.out.println("Feito o Cancelamento favor entrar em contato");
			System.out.println("Com o Banco: (21) 99911 - 7681");
			/// *** Gerar a Mensagem de erro ao Usuário
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
				/// *** Inicialização do Tratamento
				double valor;
				/// *** Declaração da Variável do Valor para fazer o saque
				Scanner teclado = new Scanner(System.in);
				/// *** Comando para digitar o valor pelo teclado
				valor = teclado.nextDouble();
				/// *** Comando para digitar pelo teclado o valor para fazer o Saque
				c.setSaldo(c.getSaldo() - valor);
				/// *** Saldo recebe Saldo - O valor sacado
				String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Está no Cheque Especial." : c.getSaldo() + "";
				/// *** Declaração da Variável que verifica se a conta do usuário está ou não em cheque especial
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("     Resultado do Processo");
				/// *** Enunciado
				System.out.println("---------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c.getNumConta());
				/// *** Informar Número da Conta
				System.out.println("Tipo de Conta: " + c.getTipoConta());
				/// *** Informar o Tipo da Conta
				System.out.println("Nome: " + c.getDono());
				/// *** Informar o Dono da Conta
				System.out.println("Saldo Atual: R$ " + alerta);
				/// *** Informar o Saldo da Conta
				System.out.println("Cpf: " + c.getCpf());
				/// *** Informar o Cpf do Usuário da Conta
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
		/// *** Método Consultar o Saldo 
		try {
			/// *** Inicialização do Tratamento
			String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Está no Cheque Especial." : c.getSaldo() + "";
			/// *** Declaração da Variável que informa se a Conta do usuário está ou não em cheque especial
			System.out.println("");
			/// *** Pula 1 linha
			System.out.println("     Resultado do Processo");
			/// *** Enunciado
			System.out.println("---------------------------------");
			/// *** Conceito de Perfumaria
			System.out.println("Conta: " + c.getNumConta());
			/// *** Informar Número da Conta
			System.out.println("Tipo de Conta: " + c.getTipoConta());
			/// *** Informar Tipo da Conta
			System.out.println("Nome: " + c.getDono());
			/// *** Informar Dono da Conta
			System.out.println("Saldo Atual: R$ " + alerta);
			/// *** Informar Saldo da Conta
			System.out.println("Cpf: " + c.getCpf());
			/// *** Informar Cpf do usuário da Conta
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
		/// *** Método Para Informar Todas as Contas 
		try {
			
			/// *** Conta 1
			Conta c1 = new Conta();
			/// *** Instanciar Conta
			c1.setNumConta(2);
			/// *** Colocar Número da Conta
			c1.setTipoConta(TipoConta.Conta_Poupanca);
			/// *** Informar Tipo da Conta
			c1.setDono("João Marques");
			/// *** Informar Dono da Conta
			c1.setSaldo(7000.00);
			/// *** Informar Saldo da Conta
			c1.setCpf("123.456.789-02");
			/// *** Informar Cpf da Conta
			c1.setStatus(Status.Ativa);
			/// *** Informar o Status da Conta
			String alerta1 = c1.getSaldo() < 0 ? c1.getSaldo() + " Está no Cheque Especial." : c1.getSaldo() + "";
			/// *** Declaração da Variável Que Informa se o Usuário está ou não em Cheque especial
			
			/// *** Conta 2
			Conta c2 = new Conta();
			/// *** Instancia da Classe Conta
			c2.setNumConta(3);
			/// *** Cadastrar Número da Conta
			c2.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo da Conta
			c2.setDono("Lucio Abraão");
			/// *** Cadastrar Dono da Conta
			c2.setSaldo(-300.00);
			/// *** Cadastrar Saldo da Conta
			c2.setCpf("123.456.789-03");
			/// *** Cadastar Cpf da Conta
			c2.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta2 = c2.getSaldo() < 0 ? c2.getSaldo() + " Está no Cheque Especial." : c2.getSaldo() + "";
			/// *** Declaração da Variável que verifica se a Conta do usuário está ou não em cheque especial
			
			/// *** Conta 3
			Conta c3 = new Conta();
			/// *** Instancia da Classe Conta
			c3.setNumConta(4);
			/// *** Cadastrar Número da Conta
			c3.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo da Conta
			c3.setDono("Angélica Bueno");
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
			/// *** Cadastar Número da Conta
			c4.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c4.setDono("Marilúzia Andrade");
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
			/// *** Cadastrar Número da Conta
			c5.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c5.setDono("Ana Luíza");
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
		/// *** Método Consulta Conta
try {
	/// *** Início do Tratamento		
	
			/// *** Conta 1
			Conta c1 = new Conta();
			/// *** Instanciar a Classe Conta
			c1.setNumConta(2);
			/// *** Cadastrar Número da Conta
			c1.setTipoConta(TipoConta.Conta_Poupanca);
			/// *** Cadsatrar Tipo de Conta
			c1.setDono("João Marques");
			/// *** Cadastrar Dono da Conta
			c1.setSaldo(7000.00);
			/// *** Cadastrar Saldo da Conta
			c1.setCpf("123.456.789-02");
			/// *** Cadastrar Cpf da Conta
			c1.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta1 = c1.getSaldo() < 0 ? c1.getSaldo() + " Está no Cheque Especial." : c1.getSaldo() + "";
			/// *** Declaração da Variável que verifica se a Conta do usuário está ou não em cheque especial
			
			/// *** Conta 2
			Conta c2 = new Conta();
			/// *** Instanciar a Classe Conta
			c2.setNumConta(3);
			/// *** Cadastrar Número da Conta
			c2.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c2.setDono("Lucio Abraão");
			/// *** Cadastrar Dono da Conta
			c2.setSaldo(-300.00);
			/// *** Cadastrar Saldo da Conta
			c2.setCpf("123.456.789-03");
			/// *** Cadastrar Cpf da Conta
			c2.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta2 = c2.getSaldo() < 0 ? c2.getSaldo() + " Está no Cheque Especial." : c2.getSaldo() + "";
			/// *** Declaração da variável que verificar se o usuário está ou não ativo
			
			/// *** Conta 3
			Conta c3 = new Conta();
			/// *** Instancia da Classe Conta
			c3.setNumConta(4);
			/// *** Cadastrar Número da Conta
			c3.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo de Conta
			c3.setDono("Angélica Bueno");
			/// *** Cadastrar Dono da Conta
			c3.setSaldo(2300.00);
			/// *** Cadastrar Saldo da Conta
			c3.setCpf("123.456.789-04");
			/// *** Cadastrar Cpf da Conta
			c3.setStatus(Status.Ativa);
			/// *** Cadastrar Status da Conta
			String alerta3 = c3.getSaldo() < 0 ? c3.getSaldo() + " Está no Cheque Especial." : c3.getSaldo() + "";
			/// *** Declaração da Variável que verifica se o usuário está ou não em cheque especial
			
			/// *** Conta 4
			Conta c4 = new Conta();
			/// *** Instancia da Classe Conta
			c4.setNumConta(4);
			/// *** Cadastrar Número da Conta
			c4.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Cadastrar Tipo da Conta
			c4.setDono("Marilúzia Andrade");
			c4.setSaldo(9000.00);
			c4.setCpf("123.456.789-05");
			c4.setStatus(Status.Cancelada);
			String alerta4 = c4.getSaldo() < 0 ? c4.getSaldo() + " Está no Cheque Especial." : c4.getSaldo() + "";

			/// *** Conta 5
			Conta c5 = new Conta();
			/// *** Instância da Conta 5
			c5.setNumConta(6);
			/// *** Setando o Valor no atributo número da conta
			c5.setTipoConta(TipoConta.Conta_Corrente);
			/// *** Setando o Valor no valor tipo da conta
			c5.setDono("Ana Luíza");
			/// *** Setando o valor no atributo Dono da Conta isto é, o usuário da conta
			c5.setSaldo(1800.00);
			/// *** Setando o Valor Saldo da Conta
			c5.setCpf("123.456.789-06");
			/// *** Setando o Valor Cpf da Conta
			c5.setStatus(Status.Cancelada);
			/// *** Setando o Valor Status da Conta
			String alerta5 = c5.getSaldo() < 0 ? c5.getSaldo() + " Está no Cheque Especial." : c5.getSaldo() + "";
			/// *** Declaração da variável que vai validar se a conta do usuário está ou não em cheque especial
			if (c1.getCpf().equals(cpf)) {
				/// *** Se o Cpf da Conta for igual ao parametro Cpf
				System.out.println("");
				/// *** Pula 1 linha para o resultado da consulta não ficar muito bagunçado
				System.out.println("                Resultado da Consulta");
				/// *** Título Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c1.getNumConta());   
				/// *** Mostra Número da Conta
				System.out.println("Nome: " + c1.getDono());
				/// *** Mostra Usuário da Conta
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
				/// *** Se o Atributo Cpf for igual ao parâmetri Cpf
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado do Resultado
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c2.getNumConta());
				/// *** Mostra Número da Conta
				System.out.println("Nome: " + c2.getDono());
				/// *** Mostrar Usuário da Conta
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
				/// *** Se o Atributo Cpf for Igual ao Parâmetro Cpf
				System.out.println("");
				/// *** Pula 1 linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c3.getNumConta());
				/// *** Mostrar Número da Conta
				System.out.println("Nome: " + c3.getDono());
				/// *** Mostrar Usuário da Conta
				System.out.println("Tipo de Conta: " + c3.getTipoConta());
				/// *** Mostrar o Tipo da Conta
				System.out.println("Saldo: " + alerta3);
				/// *** Mostrar o Saldo da Conta
				System.out.println("Cpf: " + c3.getCpf());
				/// *** Mostrar o Cpf do Usuário da Conta
				System.out.println("Status: " + c3.getStatus());
				/// *** Mostrar o Status da Conta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}else if (c4.getCpf().equals(cpf)) {
				/// *** Se o Atributo Cpf for igual ao Parâmetro Cpf
				System.out.println("");
				/// *** Pula 1 Linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Conta: " + c4.getNumConta());   
				/// *** Atributo Número da Conta
				System.out.println("Nome: " + c4.getDono());
				/// *** Atributo Usuário da Conta
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
				/// *** Mostrar Número da Conta
				System.out.println("Nome: " + c5.getDono());
				/// *** Mostrar Usuário da Conta
				System.out.println("Tipo de Conta: " + c5.getTipoConta());
				/// *** Mostrar Tipo da Conta
				System.out.println("Saldo: " + alerta5);
				/// *** Mostrar Saldo da Conta
				System.out.println("Cpf: " + c5.getCpf());
				/// *** Mostra Cpf do Usuário da Conta
				System.out.println("Status: " + c5.getStatus());
				/// *** Mostrar Status da Conta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
			}else {
				/// *** Se não for encontrado nenhum resultado do Usuário
				System.out.println("");
				/// *** Pular 1 linha
				System.out.println("                Resultado da Consulta");
				/// *** Enunciado Resultado da Consulta
				System.out.println("---------------------------------------------------------");
				/// *** Conceito de Perfumaria
				System.out.println("Nenhuma Conta Encontrada.");
				/// *** O Resultado de que não foi encontrado nenhum resultado
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
