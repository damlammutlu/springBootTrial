package com.example.deneme.demo.DataAccess;

import com.example.deneme.demo.Entities.City;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Damla
 */
public class HibernateCityDal implements ICityDal {
    private EntityManager entityManager;
    
    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    
    @Override
    @Transactional
    public List<City> getAll() {
       Session session= entityManager.unwrap(Session.class);
       List<City> cities =session.createQuery("from City",City.class).getResultList();
       return cities;
    }

    @Override
    public void add(City city) {
        
    }

    @Override
    public void update(City city) {
        
    }

    @Override
    public void delete(City city) {
        
    }
    
}
