package br.com.portalweb.dao.generic;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.impl.CadOperadoraInfoDAO;
import br.com.portalweb.model.CadOperadoraInfo;

@Transactional(propagation = Propagation.REQUIRED)
@Repository("cadOperadoraInfoDAO")
public class JPACadOperadoraInfo extends JPADAO<CadOperadoraInfo, Long> implements CadOperadoraInfoDAO{
	
	@PersistenceContext
	private EntityManager manager;

	protected Class<CadOperadoraInfo> clazz;

	@Override
	protected Class<CadOperadoraInfo> getClazz() {
		return CadOperadoraInfo.class;
	}
	
}
