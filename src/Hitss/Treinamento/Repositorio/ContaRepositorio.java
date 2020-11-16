package Hitss.Treinamento.Repositorio;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Enum.Status;
import Hitss.Treinamento.Enum.TipoConta;

public class ContaRepositorio {
	
	public void Depositar(Conta c) {
		
		if (c.getStatus().equals(Status.Cancelada)) {
			System.out.println("");
			System.out.println("-----------------------------------");
			System.out.println("Prezado(a) Usuário(a) " + c.getDono() + ".");
			System.out.println("A sua conta está cancelada, você não pode");
			System.out.println("Realizar nenhuma transação, caso não tenha");
			System.out.println("Feito o Cancelamento favor entrar em contato");
			System.out.println("Com o Banco: (21) 99911 - 7681");
			System.out.println("-----------------------------------");
		}
		else
		{
			System.out.println("");
			System.out.println("Digite o valor do Depósito:");
			try {
				double valor;
				
				Scanner teclado = new Scanner(System.in);
				
				valor = teclado.nextDouble();
				
				c.setSaldo(c.getSaldo() + valor);
				
				String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Está no Cheque Especial." : c.getSaldo() + "";
				
				System.out.println("");
				System.out.println("     Resultado do Processo");
				System.out.println("---------------------------------");
				System.out.println("Conta: " + c.getNumConta());
				System.out.println("Tipo de Conta: " + c.getTipoConta());
				System.out.println("Nome: " + c.getDono());
				System.out.println("Saldo Atual: R$ " + alerta);
				System.out.println("Cpf: " + c.getCpf());
				System.out.println("---------------------------------");
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Erro de processamento: " + e.getMessage());
			}
		}
			
	}
	
	public void Sacar(Conta c) {
		if (c.getStatus().equals(Status.Cancelada)) {
			System.out.println("");
			System.out.println("-----------------------------------");
			System.out.println("Prezado(a) Usuário(a) " + c.getDono() + ".");
			System.out.println("A sua conta está cancelada, você não pode");
			System.out.println("Realizar nenhuma transação, caso não tenha");
			System.out.println("Feito o Cancelamento favor entrar em contato");
			System.out.println("Com o Banco: (21) 99911 - 7681");
			System.out.println("-----------------------------------");
		}
		else
		{
			System.out.println("");
			System.out.println("Digite o valor do Saque:");
			try {
				double valor;
				
				Scanner teclado = new Scanner(System.in);
				
				valor = teclado.nextDouble();
				
				c.setSaldo(c.getSaldo() - valor);
				
				String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Está no Cheque Especial." : c.getSaldo() + "";
				
				System.out.println("");
				System.out.println("     Resultado do Processo");
				System.out.println("---------------------------------");
				System.out.println("Conta: " + c.getNumConta());
				System.out.println("Tipo de Conta: " + c.getTipoConta());
				System.out.println("Nome: " + c.getDono());
				System.out.println("Saldo Atual: R$ " + alerta);
				System.out.println("Cpf: " + c.getCpf());
				System.out.println("---------------------------------");
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Erro de processamento: " + e.getMessage());
			}
		}
	}
	
	public void ConsultarSaldo(Conta c) {
		try {
			
			String alerta = c.getSaldo() < 0 ? c.getSaldo() + " Está no Cheque Especial." : c.getSaldo() + "";
			
			System.out.println("");
			System.out.println("     Resultado do Processo");
			System.out.println("---------------------------------");
			System.out.println("Conta: " + c.getNumConta());
			System.out.println("Tipo de Conta: " + c.getTipoConta());
			System.out.println("Nome: " + c.getDono());
			System.out.println("Saldo Atual: R$ " + alerta);
			System.out.println("Cpf: " + c.getCpf());
			System.out.println("---------------------------------");
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
	
	public void InformarTodasAsContas() {
		
		try {
			
			/// *** Conta 1
			Conta c1 = new Conta();
			c1.setNumConta(2);
			c1.setTipoConta(TipoConta.Conta_Poupanca);
			c1.setDono("João Marques");
			c1.setSaldo(7000.00);
			c1.setCpf("123.456.789-02");
			c1.setStatus(Status.Ativa);
			String alerta1 = c1.getSaldo() < 0 ? c1.getSaldo() + " Está no Cheque Especial." : c1.getSaldo() + "";
			
			
			/// *** Conta 2
			Conta c2 = new Conta();
			c2.setNumConta(3);
			c2.setTipoConta(TipoConta.Conta_Corrente);
			c2.setDono("Lucio Abraão");
			c2.setSaldo(-300.00);
			c2.setCpf("123.456.789-03");
			c2.setStatus(Status.Ativa);
			String alerta2 = c2.getSaldo() < 0 ? c2.getSaldo() + " Está no Cheque Especial." : c2.getSaldo() + "";
			
			/// *** Conta 3
			Conta c3 = new Conta();
			c3.setNumConta(4);
			c3.setTipoConta(TipoConta.Conta_Corrente);
			c3.setDono("Angélica Bueno");
			c3.setSaldo(2300.00);
			c3.setCpf("123.456.789-04");
			c3.setStatus(Status.Ativa);
			
			/// *** Conta 4
			Conta c4 = new Conta();
			c4.setNumConta(4);
			c4.setTipoConta(TipoConta.Conta_Corrente);
			c4.setDono("Marilúzia Andrade");
			c4.setSaldo(9000.00);
			c4.setCpf("123.456.789-05");
			c4.setStatus(Status.Cancelada);
			
			/// *** Conta 5
			Conta c5 = new Conta();
			c5.setNumConta(6);
			c5.setTipoConta(TipoConta.Conta_Corrente);
			c5.setDono("Ana Luíza");
			c5.setSaldo(1800.00);
			c5.setCpf("123.456.789-06");
			c5.setStatus(Status.Cancelada);
			
			System.out.println("                Resultado da Consulta");
			System.out.println("---------------------------------------------------------");
			System.out.println("Conta: " + c1.getNumConta() + ", Nome: " + c1.getDono() + ", Tipo de Conta: " + c1.getTipoConta() + ", Saldo: " + alerta1 + ", Cpf: " + c1.getCpf());
			System.out.println("Conta: " + c2.getNumConta() + ", Nome: " + c2.getDono() + ", Tipo de Conta: " + c2.getTipoConta() + ", Saldo: " + alerta2 + ", Cpf: " + c2.getCpf());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
