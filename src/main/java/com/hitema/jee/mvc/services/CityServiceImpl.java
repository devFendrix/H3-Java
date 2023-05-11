package com.hitema.jee.mvc.services;

import com.hitema.jee.mvc.entities.City;
import com.hitema.jee.mvc.entities.Country;
import com.hitema.jee.mvc.repositories.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    private static final Logger log = LoggerFactory.getLogger(CityServiceImpl.class);

    private CityRepository repository;

    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<City> readAll() {
        return repository.findAll();
    }
}
