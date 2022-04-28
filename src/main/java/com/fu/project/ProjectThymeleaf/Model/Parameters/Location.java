/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.project.ProjectThymeleaf.Model.Parameters;

import com.fu.project.ProjectThymeleaf.Model.CommonObject;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "Location")
public class Location extends CommonObject {

    private String city;
    private String address;

    @ManyToOne
    @JoinColumn(name = "countryID")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "stateID")
    private State state;

    public Location() {
    }

    public Location(String city, String address, Country country, State state) {
        this.city = city;
        this.address = address;
        this.country = country;
        this.state = state;
    }

    public Location(String city, String address, Country country, State state, int id, String description, String details) {
        super(id, description, details);
        this.city = city;
        this.address = address;
        this.country = country;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
