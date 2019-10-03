package br.com.techsow.sherlock.model.entities;

public class Curso {

	private String nome, descricao;
	private long duracao;
	private int id_curso;
	
	
	
	public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getDuracao() {
		return duracao;
	}
	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}
	public Curso(int id, String nome, String descricao, long duracao) {
		this.id_curso = id;
		this.nome = nome;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	
	
}
