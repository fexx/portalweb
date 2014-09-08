package br.com.portalweb.dao;

import java.io.Serializable;

public interface BaseEntity<PK> extends Serializable {
	public PK getId();
}