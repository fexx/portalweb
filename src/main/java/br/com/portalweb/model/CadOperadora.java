package br.com.portalweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.portalweb.dao.generic.BaseEntity;

@Entity
@Table(name = "CAD_OPERADORA")
public class CadOperadora implements BaseEntity<Long>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 372298861917224167L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "REGISTRO_ANS")
	private String registroANS;

	@Column(name = "RAZAO_SOCIAL")
	private String razaoSocial;
	
	@Column(name = "NOME_FANTASIA")
	private String nomeFantasia;
	
	@Column(name = "LOGRADOURO")
	private String logradouro;
	
	@Column(name = "NUMERO")
	private String numeroLogradouro;
	
	@Column(name = "COMPLEMENTO")
	private String complemento;
	
	@Column(name = "BAIRRO")
	private String bairro;	
	
	@Column(name = "CIDADE")
	private String cidade;
			
	@Column(name = "UF")
	private String uf;
	
	@Column(name = "CEP")
	private String cep;
	
	@Column(name = "TEL_DDD")
	private String telDDD;
	
	@Column(name = "TELEFONE")
	private String telefone;
	
	@Column(name = "FAX")
	private String fax;
	
	
	
	@Override
	public Long getId() {
		return null;
	}
	
}
