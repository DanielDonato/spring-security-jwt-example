package com.danieldonato.application.model.enuns;

public enum PerfilEnum {
	
	USER(1, "ROLE_USER"),
	ADMIN(2, "ROLE_ADMIN");
	
	private Integer cod;
	private String descricao;

	private PerfilEnum(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static PerfilEnum toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (PerfilEnum x : PerfilEnum.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Status invalida" + cod);
	}
}
