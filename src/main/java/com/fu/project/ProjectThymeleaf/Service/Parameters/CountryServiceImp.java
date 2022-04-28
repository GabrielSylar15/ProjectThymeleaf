/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.project.ProjectThymeleaf.Service.Parameters;

import com.fu.project.ProjectThymeleaf.Model.Parameters.Country;
import com.fu.project.ProjectThymeleaf.Repository.Parameters.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class CountryServiceImp implements CountryService{
    
    @Autowired
    CountryRepository countryRepository;
    
    @Override
    public List<Country> getListCountries() {
        return countryRepository.findAll();
    }
    
}
