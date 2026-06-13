package com.api.countrynames.controller;

import com.api.countrynames.model.CountryDTO;
import com.api.countrynames.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class CountryNamesController {

    private ResponseEntity<?> responseEntity;
    private CountryService countryService;

    public CountryNamesController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CountryDTO>> getAllCountryNames(){
        return new ResponseEntity<>(countryService.getAllCountries(),HttpStatus.OK);
    }

    @PostMapping("/saveCountry")
    public CountryDTO saveCountryName(@RequestBody CountryDTO countryDTO){
        return countryService.saveCountryName(countryDTO);
    }

    @PostMapping("/saveAll")
    public List<CountryDTO> saveCountryName(@RequestBody List<CountryDTO> countryDTOList){
        return countryService.saveAllCountries(countryDTOList);
    }
}
