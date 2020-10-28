package com.example.deneme.demo.Business;

import com.example.deneme.demo.DataAccess.ICityDal;
import com.example.deneme.demo.Entities.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Damla
 */
public class CityManager implements ICityService{
    private ICityDal ctiyDal;
    
    @Autowired
    public CityManager(ICityDal ctiyDal) {
        this.ctiyDal = ctiyDal;
    }
    
    @Override
    @Transactional
    public List<City> getAll() {
       return this.ctiyDal.getAll(); 
    }

    @Override
    @Transactional
    public void add(City city) {
        
    }

    @Override
    @Transactional
    public void update(City city) {
        
    }

    @Override
    @Transactional
    public void delete(City city) {
        
    }
    
}
