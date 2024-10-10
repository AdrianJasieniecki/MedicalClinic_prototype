package com.example.medicalclinic.DTOs;

import java.util.Set;

public class DoctorDTO {

    private Long id;
    private String name;
    private String surname;
    private String medicalSpecialization;
    private String email;
    private String phoneNumber;
    private Set<VisitDTO> visits;

    public Long getId() {
        return id;
    }

    public DoctorDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DoctorDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public DoctorDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public DoctorDTO setMedicalSpecialization(String medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public DoctorDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public DoctorDTO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Set<VisitDTO> getVisits() {
        return visits;
    }

    public DoctorDTO setVisits(Set<VisitDTO> visits) {
        this.visits = visits;
        return this;
    }
}
