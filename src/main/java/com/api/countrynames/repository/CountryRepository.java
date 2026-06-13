package com.api.countrynames.repository;

import com.api.countrynames.model.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryDTO,Integer> {

}
