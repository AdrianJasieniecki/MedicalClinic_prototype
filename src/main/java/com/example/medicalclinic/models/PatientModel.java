package com.example.medicalclinic.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "PATIENT")
public class PatientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_generator")
    @SequenceGenerator(name = "patient_generator", sequenceName = "patient_seq", allocationSize = 1)
    @Column(name = "patient_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "pesel")
    private String pesel;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "patient")
    private Set<VisitModel> visitModel;

    @OneToMany(mappedBy = "patient")
    private Set<PaymentsModel> payments;

    @OneToMany(mappedBy = "patient")
    private Set<PrescriptionModel> prescriptions;

    @Embedded
    private AddressModel address;

    public Long getId() {
        return id;
    }

    public PatientModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PatientModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public PatientModel setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public PatientModel setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getPesel() {
        return pesel;
    }

    public PatientModel setPesel(String pesel) {
        this.pesel = pesel;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PatientModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AddressModel getAddress() {
        return address;
    }

    public PatientModel setAddress(AddressModel address) {
        this.address = address;
        return this;
    }

    public Set<VisitModel> getVisitModel() {
        return visitModel;
    }

    public PatientModel setVisitModel(Set<VisitModel> visitModel) {
        this.visitModel = visitModel;
        return this;
    }

    public Set<PaymentsModel> getPayments() {
        return payments;
    }

    public PatientModel setPayments(Set<PaymentsModel> payments) {
        this.payments = payments;
        return this;
    }

    public Set<PrescriptionModel> getPrescriptions() {
        return prescriptions;
    }

    public PatientModel setPrescriptions(Set<PrescriptionModel> prescriptions) {
        this.prescriptions = prescriptions;
        return this;
    }
}
