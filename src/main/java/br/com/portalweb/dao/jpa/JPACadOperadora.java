package br.com.portalweb.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.CadOperadoraDAO;
import br.com.portalweb.model.CadOperadora;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("cadOperadoraDAO")
public class JPACadOperadora extends JPADAO<CadOperadora, Long> implements CadOperadoraDAO{

	@PersistenceContext
	private EntityManager manager;

	protected Class<CadOperadora> clazz;

	@Override
	protected Class<CadOperadora> getClazz() {
		return CadOperadora.class;
	}
	
}
