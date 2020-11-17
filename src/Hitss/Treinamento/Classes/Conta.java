package Hitss.Treinamento.Classes;

import Hitss.Treinamento.Enum.*;

public class Conta {
	/// *** Declara��o da Classe Conta
	private int numConta;
	/// *** Atributo N�mero da Conta
	private TipoConta tipoConta;
	/// *** Atributo Tipo da Conta
	private String Dono;
	/// *** Atributo Dono da Conta
	private double Saldo;
	/// *** Atributo Saldo da Conta
	private String Cpf;
	/// *** Atributo Cpf do usu�rio da Conta
	private Status status;
	/// *** Atributo Status da Conta
	
	public String getCpf() {
		/// *** M�todo De Receber Dados do Cpf
		return Cpf;
		/// *** Retorna o Cpf do Usu�rio da Conta
	}
	public void setCpf(String cpf) {
		/// *** M�todo de Enviar dados do Cpf
		Cpf = cpf;
		/// *** Cpf do Usu�rio da Conta Recebe o Valor 
		/// *** No Cpf
	}
	public Status getStatus() {
		/// *** M�todo de Receber Dados no Status da Conta
		return status;
		/// *** Retorna o Status da Conta do Usu�rio
	}
	public void setStatus(Status status) {
		/// *** M�todo De Enviar dados do Status da Conta
		this.status = status;
		/// *** Status da Conta vai receber um valor
	}
	public String getDono() {
		/// *** M�todo de Receber Dados do Dono da Conta
		return Dono;
		/// *** Retorna o Dono da Conta
	}
	public void setDono(String dono) {
		/// *** M�todo que vai enviar dados do Dono da Conta
		Dono = dono;
		/// *** Dono da Conta vai receber um valor
	}
	public double getSaldo() {
		/// *** M�todo Que vai Receber o Saldo da Sua Conta
		return Saldo;
		/// *** Retorna o Saldo da Sua Conta
	}
	public void setSaldo(double saldo) {
		/// *** M�todo que vai enviar dados do Saldo da sua conta
		Saldo = saldo;
		/// *** Saldo da Conta vai receber um valor
	}
	public int getNumConta() {
		/// *** M�todo que vai receber dados do N�mero da Conta
		return numConta;
		/// *** Retorna o N�mero da Conta
	}
	public void setNumConta(int numConta) {
		/// *** M�todo que vai enviar dados do N�mero da Conta
		this.numConta = numConta;
		/// *** N�mero da Conta Vai Receber um Valor
	}
	public TipoConta getTipoConta() {
		/// *** M�todo que vai receber dados do Tipo de conta
		return tipoConta;
		/// *** Retorna o Tipo de Conta
	}
	public void setTipoConta(TipoConta tipoConta) {
		/// *** M�todo que vai Enviar dados do Tipo de Conta
		this.tipoConta = tipoConta;
		/// *** Tipo de Conta vai receber um valor
	}
	
	
}
