package com.api.countrynames.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CountryDTO {

    @Id
    private int id;
    private String countryname;

    public CountryDTO() {
    }

    public CountryDTO(int id, String countryname) {
        this.id = id;
        this.countryname = countryname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
