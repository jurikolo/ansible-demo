package dao;

import model.Months;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class MonthsDao {
    @PersistenceContext(unitName = "servlet")
    private EntityManager em;

    public List<String> findAllMonths() {
        return em.createNamedQuery("findAllMonths", String.class).getResultList();
    }
}
