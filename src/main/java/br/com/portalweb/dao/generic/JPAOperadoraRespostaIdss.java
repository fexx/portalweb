package br.com.portalweb.dao.generic;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.impl.OperadoraRespostaIdssDAO;
import br.com.portalweb.model.OperadoraRespostaIdss;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("OperadoraRespostaIdssDAO")
public class JPAOperadoraRespostaIdss extends JPADAO<OperadoraRespostaIdss, Long> implements OperadoraRespostaIdssDAO{
	
	@PersistenceContext
	private EntityManager manager;

	protected Class<OperadoraRespostaIdss> clazz;

	@Override
	protected Class<OperadoraRespostaIdss> getClazz() {
		return OperadoraRespostaIdss.class;
	}

}
