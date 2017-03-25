package br.edu.unicesumar.recibo;

public class Servico {
	private Double valor;

	private String valorDescritivo;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getValorDescritivo() {
		return valorDescritivo;
	}

	public void setValorDescritivo(String valorDescritivo) {
		this.valorDescritivo = valorDescritivo;
	}

}
