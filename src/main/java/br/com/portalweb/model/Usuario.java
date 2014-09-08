package br.com.portalweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.portalweb.dao.BaseEntity;

@Entity
@Table(name = "PW_USUARIO")
public class Usuario implements BaseEntity<Long> {

	private static final long serialVersionUID = 480946814675120684L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@Column(name = "SENHA")
	private String senha;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "STATUS")
	private boolean status;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}

}
