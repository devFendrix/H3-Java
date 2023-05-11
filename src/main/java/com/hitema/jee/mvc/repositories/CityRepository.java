package com.hitema.jee.mvc.repositories;

import com.hitema.jee.mvc.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
