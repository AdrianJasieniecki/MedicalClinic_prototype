package com.example.medicalclinic.models;

import jakarta.persistence.*;

@Entity
@Table(name = "CLINICS")
public class ClinicModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clinic_generator")
    @SequenceGenerator(name = "clinic_generator", sequenceName = "clinic_seq", allocationSize = 1)
    @Column(name = "clinic_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Embedded
    private AddressModel address;

    @Column(name = "phone_number")
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public ClinicModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ClinicModel setName(String name) {
        this.name = name;
        return this;
    }

    public AddressModel getAddress() {
        return address;
    }

    public ClinicModel setAddress(AddressModel address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ClinicModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return "ClinicModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
