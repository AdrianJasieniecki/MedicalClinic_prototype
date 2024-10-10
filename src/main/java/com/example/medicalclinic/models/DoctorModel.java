package com.example.medicalclinic.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "DOCTOR")
public class DoctorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_generator")
    @SequenceGenerator(name = "doctor_generator", sequenceName = "doctor_seq", allocationSize = 1)
    @Column(name = "doctor_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "medical_specialization")
    private String medicalSpecialization;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "doctor")
    private Set<VisitModel> visits;

    public Long getId() {
        return id;
    }

    public DoctorModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DoctorModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public DoctorModel setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public DoctorModel setMedicalSpecialization(String medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public DoctorModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public DoctorModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Set<VisitModel> getVisits() {
        return visits;
    }

    public DoctorModel setVisits(Set<VisitModel> visits) {
        this.visits = visits;
        return this;
    }

    @Override
    public String toString() {
        return "DoctorModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", medicalSpecialization='" + medicalSpecialization + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", visits=" + visits +
                '}';
    }
}
