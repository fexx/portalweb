package br.com.portalweb.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import br.com.portalweb.dao.BaseEntity;

@Entity
@Table(name = "CAD_OPER_IDSS_RESPOSTA")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperadoraRespostaIdss implements BaseEntity<Long>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8844377956691127458L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_OPER_IDSS")	
	private CadOperadoraIdss operadoraIdss;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_QUESTAO")
	private QuestoesIdss questaoIdss;
	
	@Column(name = "NOTA")
	private BigDecimal notaIdss;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CadOperadoraIdss getOperadoraIdss() {
		return operadoraIdss;
	}

	public void setOperadoraIdss(CadOperadoraIdss operadoraIdss) {
		this.operadoraIdss = operadoraIdss;
	}

	public QuestoesIdss getQuestaoIdss() {
		return questaoIdss;
	}

	public void setQuestaoIdss(QuestoesIdss questaoIdss) {
		this.questaoIdss = questaoIdss;
	}

	public BigDecimal getNotaIdss() {
		return notaIdss;
	}

	public void setNotaIdss(BigDecimal notaIdss) {
		this.notaIdss = notaIdss;
	}
	
	
	
}
