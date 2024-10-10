package com.example.medicalclinic.DTOs;

import java.time.LocalDate;
import java.util.Set;

public class PatientDTO {

    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String pesel;
    private String phoneNumber;
    private AddressDTO address;
    private Set<VisitDTO> visitDTOS;
    private Set<PaymentsDTO> payments;
    private Set<PrescriptionDTO> prescriptions;

    public Long getId() {
        return id;
    }

    public PatientDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PatientDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public PatientDTO setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public PatientDTO setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getPesel() {
        return pesel;
    }

    public PatientDTO setPesel(String pesel) {
        this.pesel = pesel;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PatientDTO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public PatientDTO setAddress(AddressDTO address) {
        this.address = address;
        return this;
    }

    public Set<VisitDTO> getVisitDTOS() {
        return visitDTOS;
    }

    public PatientDTO setVisitDTOS(Set<VisitDTO> visitDTOS) {
        this.visitDTOS = visitDTOS;
        return this;
    }

    public Set<PaymentsDTO> getPayments() {
        return payments;
    }

    public PatientDTO setPayments(Set<PaymentsDTO> payments) {
        this.payments = payments;
        return this;
    }

    public Set<PrescriptionDTO> getPrescriptions() {
        return prescriptions;
    }

    public PatientDTO setPrescriptions(Set<PrescriptionDTO> prescriptions) {
        this.prescriptions = prescriptions;
        return this;
    }
}
