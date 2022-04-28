/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.project.ProjectThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ADMIN
 */
@Controller
public class NewClass {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("layout")
    public String layout() {
        return "_layout";
    }

    @GetMapping("/hr")
    public String hr() {
        return "/hr/index";
    }
    
    @GetMapping("/payroll")
    public String payroll() {
        return "/payroll/index";
    }   
    
    @GetMapping("/account")
    public String account() {
        return "/accounts/index";
    }  
    
    @GetMapping("/fleet")
    public String fleet() {
        return "/fleet/index";
    }    
    
    @GetMapping("/parameter")
    public String parameter() {
        return "/parameter/index";
    }    
}
