package Hitss.Treinamento.Classes;

import Hitss.Treinamento.Enum.*;

public class Conta {
	/// *** Declaração da Classe Conta
	private int numConta;
	/// *** Atributo Número da Conta
	private TipoConta tipoConta;
	/// *** Atributo Tipo da Conta
	private String Dono;
	/// *** Atributo Dono da Conta
	private double Saldo;
	/// *** Atributo Saldo da Conta
	private String Cpf;
	/// *** Atributo Cpf do usuário da Conta
	private Status status;
	/// *** Atributo Status da Conta
	
	public String getCpf() {
		/// *** Método De Receber Dados do Cpf
		return Cpf;
		/// *** Retorna o Cpf do Usuário da Conta
	}
	public void setCpf(String cpf) {
		/// *** Método de Enviar dados do Cpf
		Cpf = cpf;
		/// *** Cpf do Usuário da Conta Recebe o Valor 
		/// *** No Cpf
	}
	public Status getStatus() {
		/// *** Método de Receber Dados no Status da Conta
		return status;
		/// *** Retorna o Status da Conta do Usuário
	}
	public void setStatus(Status status) {
		/// *** Método De Enviar dados do Status da Conta
		this.status = status;
		/// *** Status da Conta vai receber um valor
	}
	public String getDono() {
		/// *** Método de Receber Dados do Dono da Conta
		return Dono;
		/// *** Retorna o Dono da Conta
	}
	public void setDono(String dono) {
		/// *** Método que vai enviar dados do Dono da Conta
		Dono = dono;
		/// *** Dono da Conta vai receber um valor
	}
	public double getSaldo() {
		/// *** Método Que vai Receber o Saldo da Sua Conta
		return Saldo;
		/// *** Retorna o Saldo da Sua Conta
	}
	public void setSaldo(double saldo) {
		/// *** Método que vai enviar dados do Saldo da sua conta
		Saldo = saldo;
		/// *** Saldo da Conta vai receber um valor
	}
	public int getNumConta() {
		/// *** Método que vai receber dados do Número da Conta
		return numConta;
		/// *** Retorna o Número da Conta
	}
	public void setNumConta(int numConta) {
		/// *** Método que vai enviar dados do Número da Conta
		this.numConta = numConta;
		/// *** Número da Conta Vai Receber um Valor
	}
	public TipoConta getTipoConta() {
		/// *** Método que vai receber dados do Tipo de conta
		return tipoConta;
		/// *** Retorna o Tipo de Conta
	}
	public void setTipoConta(TipoConta tipoConta) {
		/// *** Método que vai Enviar dados do Tipo de Conta
		this.tipoConta = tipoConta;
		/// *** Tipo de Conta vai receber um valor
	}
	
	
}
