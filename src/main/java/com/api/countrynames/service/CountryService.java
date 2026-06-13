package com.api.countrynames.service;

import com.api.countrynames.model.CountryDTO;
import com.api.countrynames.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryDTO> getAllCountries(){
        return countryRepository.findAll();
    }

    public CountryDTO saveCountryName(CountryDTO countryDTO){
       return countryRepository.save(countryDTO);
    }

    public List<CountryDTO> saveAllCountries(List<CountryDTO> countryDTOList){
       return countryRepository.saveAll(countryDTOList);
    }
}
