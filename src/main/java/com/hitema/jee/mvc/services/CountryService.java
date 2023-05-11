package com.hitema.jee.mvc.services;

import com.hitema.jee.mvc.entities.Country;

import java.util.List;

public interface CountryService {
    List<Country> readAll() ;

    Country create(Country country);
}
