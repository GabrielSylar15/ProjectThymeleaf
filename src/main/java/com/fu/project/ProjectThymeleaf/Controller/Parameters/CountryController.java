/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.project.ProjectThymeleaf.Controller.Parameters;

import com.fu.project.ProjectThymeleaf.Service.Parameters.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ADMIN
 */
@Controller
public class CountryController {
    @Autowired
    CountryService countryService;
    
    @GetMapping("/countries")
    public String listCountries(Model model){
        model.addAttribute("listCountries", countryService.getListCountries());
        return "/parameter/countryList";
    }
}
