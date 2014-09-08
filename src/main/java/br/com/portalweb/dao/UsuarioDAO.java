package br.com.portalweb.dao;

import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.Usuario;

public interface UsuarioDAO extends DAO<Usuario, Long>{

	public Usuario buscaPorEmail(String email) throws DAOException;
	
}
