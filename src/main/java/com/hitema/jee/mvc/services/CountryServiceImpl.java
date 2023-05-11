package com.hitema.jee.mvc.services;

import com.hitema.jee.mvc.entities.Country;
import com.hitema.jee.mvc.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    private static final Logger log = LoggerFactory.getLogger(CountryServiceImpl.class);

    private CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Country> readAll() {
        return repository.findAll();
    }

    @Override
    public Country create(Country country) {
        if ( country.getLastUpdate() == null )
            country.setLastUpdate(LocalDateTime.now());
        return repository.save(country);
    }
}
