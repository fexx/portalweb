package br.com.portalweb.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.UsuarioDAO;
import br.com.portalweb.exception.DAOException;
import br.com.portalweb.model.Usuario;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("usuarioDAO")
public class JPAUsuario extends JPADAO<Usuario, Long> implements UsuarioDAO{

	@PersistenceContext
	private EntityManager manager;

	protected Class<Usuario> clazz;

	@Override
	protected Class<Usuario> getClazz() {
		return Usuario.class;
	}
	
	@Override
	public Usuario buscaPorEmail(String email) throws DAOException{
		try {
			TypedQuery<Usuario> query = this.em.createQuery("select u from " + Usuario.class.getSimpleName() + " u where u.email = :email", Usuario.class);
			query.setParameter("email", email);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;	
		} catch (Exception e) {
			throw new DAOException(e);
		}
	}
	
}
