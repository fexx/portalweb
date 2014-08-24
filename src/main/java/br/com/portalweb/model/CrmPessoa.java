package br.com.portalweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.portalweb.dao.generic.BaseEntity;
import br.com.portalweb.enumeration.TipoPessoa;

@Entity
@Table(name = "CRM_PESSOA")
public class CrmPessoa implements BaseEntity<Long>, Serializable {

	private static final long serialVersionUID = 6516667207339545557L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "TIPO_PESSOA")
	private int tipoPessoa;

	@Column(name = "ID_OWNER")
	private Long owner;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CADASTRO")
	private Date dataCadastro;

	@Override
	public Long getId() {
		return id;
	}

	public TipoPessoa getTipoPessoa() {
		return TipoPessoa.get(tipoPessoa);
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa.getCodigo();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getOwner() {
		return owner;
	}

	public void setOwner(Long owner) {
		this.owner = owner;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTipoPessoa(int tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
}
