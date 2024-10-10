package com.example.medicalclinic.DTOs;

public class ClinicDTO {

    private Long id;
    private String name;
    private AddressDTO address;
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public ClinicDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ClinicDTO setName(String name) {
        this.name = name;
        return this;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public ClinicDTO setAddress(AddressDTO address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ClinicDTO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
