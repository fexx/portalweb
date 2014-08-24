package br.com.portalweb.enumeration;

public enum TipoPessoa {
	
	FISICA(1, "Pessoa fisica"),
	JURDICA(2, "pessoa juridica");
	
	private int codigo;
	private String valor;
	private TipoPessoa(int codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getValor() {
		return valor;
	}

	public static TipoPessoa get(int codigo) {
		for (TipoPessoa status : TipoPessoa.values()) {
			if (status.codigo == codigo) {
				return status;
			}
		}
		throw new IllegalArgumentException("código [" + codigo + "] inválido para " + TipoPessoa.class.getSimpleName());
	}
}
