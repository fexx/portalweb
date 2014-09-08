package br.com.portalweb.redessociais;

import org.springframework.stereotype.Component;

import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.Usuario;

@Component
public interface RedeSocial<T> {

	public String publicarMural(T redeSocial, String idUsuarioRedeSocial);
	
	public String publicarMural(T redeSocial, String idUsuarioRedeSocial, String nome, String descricao, String urlImagem, StringBuffer urlLink);
	
	public Usuario addUsuarioRedeSocial(Usuario usuario) throws DAOException;
	
	public Usuario updateUsuarioRedeSocial(Usuario usuario) throws DAOException;
	
}
