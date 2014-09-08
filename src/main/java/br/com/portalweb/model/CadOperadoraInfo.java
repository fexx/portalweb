package br.com.portalweb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import br.com.portalweb.dao.BaseEntity;

@Entity
@Table(name = "CAD_OPERADORA_INFO")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CadOperadoraInfo implements BaseEntity<Long>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6834937110492525357L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_OPERADORA")
	private CadOperadora operadora;
	
	@Column(name = "SEGMENTACAO")
	private String segmentacao;
	
	@Column(name = "TOTAL_BENEFICIARIOS")
	private Long totalBeneficiarios;
	
	@Column(name = "COMPETENCIA")
	private String competencia;
	
	@Column(name = "STATUS_ANS")
	private String statusANS;
	
	@Column(name = "DT_CADASTRO")
	private Date dtCadastro;

	@Column(name = "STATUS_INFO")
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CadOperadora getOperadora() {
		return operadora;
	}

	public void setOperadora(CadOperadora operadora) {
		this.operadora = operadora;
	}

	public String getSegmentacao() {
		return segmentacao;
	}

	public void setSegmentacao(String segmentacao) {
		this.segmentacao = segmentacao;
	}

	public Long getTotalBeneficiarios() {
		return totalBeneficiarios;
	}

	public void setTotalBeneficiarios(Long totalBeneficiarios) {
		this.totalBeneficiarios = totalBeneficiarios;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public String getStatusANS() {
		return statusANS;
	}

	public void setStatusANS(String statusANS) {
		this.statusANS = statusANS;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
