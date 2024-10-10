package com.example.medicalclinic.DTOs;

public class AddressDTO {

    private String street;
    private String apartmentNumber;
    private String city;
    private String province;
    private String country;
    private String zipCode;

    public String getStreet() {
        return street;
    }

    public AddressDTO setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public AddressDTO setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AddressDTO setCity(String city) {
        this.city = city;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public AddressDTO setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AddressDTO setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public AddressDTO setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
}
