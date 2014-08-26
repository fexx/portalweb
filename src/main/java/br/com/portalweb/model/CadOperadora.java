package br.com.portalweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import br.com.portalweb.dao.generic.BaseEntity;

@Entity
@Table(name = "CAD_OPERADORA")
@JsonIgnoreProperties(ignoreUnknown = true)
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
	
	@Column(name = "EMAIL_RESPONSAVEL")
	private String emailResponsavel;
	
	@Column(name = "SITE")
	private String site;
	
	@Column(name = "CNPJ")
	private String cnpj;
	
	public String getRegistroANS() {
		return registroANS;
	}

	public void setRegistroANS(String registroANS) {
		this.registroANS = registroANS;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelDDD() {
		return telDDD;
	}

	public void setTelDDD(String telDDD) {
		this.telDDD = telDDD;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public String getSite() {
		return site != null ? site.toLowerCase() : null;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}
	
}
