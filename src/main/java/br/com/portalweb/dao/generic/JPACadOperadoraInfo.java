package br.com.portalweb.dao.generic;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.portalweb.dao.impl.CadOperadoraInfoDAO;
import br.com.portalweb.model.CadOperadora;
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
	
	public CadOperadoraInfo getCadOperadoraInfoAtivo(CadOperadora cadOperadora) {
		CadOperadoraInfo operadoraInfo = new CadOperadoraInfo();
		
		TypedQuery<CadOperadoraInfo> jpql = this.manager.createQuery(" from " + CadOperadoraInfo.class.getSimpleName()
					+ " where operadora = :cadOperadoraVal and status = :statusParam " , CadOperadoraInfo.class
				);
		jpql.setParameter("cadOperadoraVal", cadOperadora);
		jpql.setParameter("statusParam", "ATIVO");
		
		operadoraInfo = (CadOperadoraInfo)jpql.getSingleResult();
		
		return operadoraInfo;
	}
	
}
