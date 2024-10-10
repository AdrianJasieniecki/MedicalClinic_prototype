package com.example.medicalclinic.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AddressModel {

    @Column(name = "street")
    private String street;

    @Column(name = "apartment_number")
    private String apartmentNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "country")
    private String country;

    @Column(name = "zip_code")
    private String zipCode;

    public String getStreet() {
        return street;
    }

    public AddressModel setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public AddressModel setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressModel setCity(String city) {
        this.city = city;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public AddressModel setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressModel setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public AddressModel setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
}
