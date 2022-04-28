/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.project.ProjectThymeleaf.Repository.Parameters;

import com.fu.project.ProjectThymeleaf.Model.Parameters.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ADMIN
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{
    
}
