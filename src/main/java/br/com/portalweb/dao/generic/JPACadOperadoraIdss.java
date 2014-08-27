package br.com.portalweb.dao.generic;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.impl.CadOperadoraIdssDAO;
import br.com.portalweb.model.CadOperadoraIdss;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("cadOperadoraIdssDAO")
public class JPACadOperadoraIdss extends JPADAO<CadOperadoraIdss, Long> implements CadOperadoraIdssDAO{
	
	@PersistenceContext
	private EntityManager manager;

	protected Class<CadOperadoraIdss> clazz;

	@Override
	protected Class<CadOperadoraIdss> getClazz() {
		return CadOperadoraIdss.class;
	}

}
