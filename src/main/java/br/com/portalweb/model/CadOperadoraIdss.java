package br.com.portalweb.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import br.com.portalweb.dao.generic.BaseEntity;

@Entity
@Table(name = "CAD_OPERADORA_IDSS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CadOperadoraIdss implements BaseEntity<Long>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2607133744243938840L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_OPERADORA")
	private CadOperadora operadora;
	
	@Column(name = "DT_INCLUSAO")
	private Date dtInclusao;
	
	@Column(name = "ANO_BASE")
	private Long anoBase;
	
	@Column(name = "ANO_COMPETENCIA")
	private Long anoCompetencia;
	
	@Column(name = "NOTA_GERAL")
	private BigDecimal notaGeral;

	@Column(name = "STATUS")
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

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public Long getAnoBase() {
		return anoBase;
	}

	public void setAnoBase(Long anoBase) {
		this.anoBase = anoBase;
	}

	public Long getAnoCompetencia() {
		return anoCompetencia;
	}

	public void setAnoCompetencia(Long anoCompetencia) {
		this.anoCompetencia = anoCompetencia;
	}

	public BigDecimal getNotaGeral() {
		return notaGeral;
	}

	public void setNotaGeral(BigDecimal notaGeral) {
		this.notaGeral = notaGeral;
	}
	
	
}
