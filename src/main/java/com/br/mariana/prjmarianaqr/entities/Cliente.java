package com.br.mariana.prjmarianaqr.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column (name = "ncliente")
	private String ncliente;
	
	@Column (name = "fone")
	private String fone;

	public Long getIdcCliente() {
		return idcCliente;
	}

	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getNcliente() {
		return ncliente;
	}

	public void setNcliente(String ncliente) {
		this.ncliente = ncliente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	

}
