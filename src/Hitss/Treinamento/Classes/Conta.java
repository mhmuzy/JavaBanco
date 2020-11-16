package Hitss.Treinamento.Classes;

import Hitss.Treinamento.Enum.*;

public class Conta {
	
	private int numConta;
	private TipoConta tipoConta;
	private String Dono;
	private double Saldo;
	private String Cpf;
	private Status status;
	
	
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDono() {
		return Dono;
	}
	public void setDono(String dono) {
		Dono = dono;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public TipoConta getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	
}
