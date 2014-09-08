package br.com.portalweb.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.QuestoesIdssDAO;
import br.com.portalweb.model.QuestoesIdss;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("QuestoesIdssDAO")
public class JPAQuestoesIdss extends JPADAO<QuestoesIdss, Long> implements QuestoesIdssDAO{

	@PersistenceContext
	private EntityManager manager;

	protected Class<QuestoesIdss> clazz;

	@Override
	protected Class<QuestoesIdss> getClazz() {
		return QuestoesIdss.class;
	}
	
}
