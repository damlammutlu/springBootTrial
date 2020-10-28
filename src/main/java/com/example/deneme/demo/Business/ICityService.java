package com.example.deneme.demo.Business;

import com.example.deneme.demo.Entities.City;
import java.util.List;

/**
 *
 * @author Damla
 */
public interface ICityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
