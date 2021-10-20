package org.general.apiGeneral;

import org.json.simple.JSONObject;

public class Aluno {

	private String nome;
	private int idade;
	private Boolean estaBem;
	
	public Aluno(JSONObject json) {
		this.nome =(String) json.get("nome");
		this.idade = (Integer) json.get("idade");
		this.estaBem = (Boolean) json.get("estaBem");
	}
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public boolean isEstaBem() {
		return estaBem;
	}
	public void setEstaBem(boolean estaBem) {
		this.estaBem = estaBem;
	}
	public Aluno(String nome, int idade, Boolean estaBem) {
		this.nome = nome;
		this.idade = idade;
		this.estaBem = estaBem;
	}
	@Override
	public String toString() {
		return "Aluno [" + (nome != null ? "nome=" + nome + ", " : "") + "idade=" + idade + ", "
				+ (estaBem != null ? "estaBem=" + estaBem : "") + "]";
	}
	
	
	
	
}
