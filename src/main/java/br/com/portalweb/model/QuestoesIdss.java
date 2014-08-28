package br.com.portalweb.model;

import java.io.Serializable;

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

import br.com.portalweb.dao.generic.BaseEntity;

@Entity
@Table(name = "AUX_ANS_QUESTOES_IDSS")
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestoesIdss implements BaseEntity<Long>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 468984618268781522L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@ManyToOne(fetch=FetchType.EAGER )
	@JoinColumn(name = "ID_QUESTAO_PAI" , referencedColumnName = "id"  )
	private QuestoesIdss questaoPai;
	
	@Column(name = "QUESTAO")
	private String questao;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "ORDEM")
	private Long ordem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public QuestoesIdss getQuestaoPai() {
		return questaoPai;
	}

	public void setQuestaoPai(QuestoesIdss questaoPai) {
		this.questaoPai = questaoPai;
	}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

	public Long getOrdem() {
		return ordem;
	}

	public void setOrdem(Long ordem) {
		this.ordem = ordem;
	}
	
	
}
