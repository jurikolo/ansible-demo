package dao;

import javax.persistence.EntityManager;

public abstract class DaoSupport<ENTITY> {

    public ENTITY save(ENTITY e) {
        return em().merge(e);
    }

    public void delete(ENTITY e) {
        em().remove(e);
    }

    public abstract EntityManager em();
}
