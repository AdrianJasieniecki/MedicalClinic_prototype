package com.example.medicalclinic.DTOs;

import com.example.medicalclinic.models.VisitStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class VisitDTO {

    private Long id;
    private LocalDate visitDate;
    private LocalTime visitTime;
    private VisitStatus status;
    private String description;
    private PatientDTO patient;
    private DoctorDTO doctor;
    private Set<PrescriptionDTO> prescriptions;
    private PaymentsDTO payments;

    public Long getId() {
        return id;
    }

    public VisitDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public VisitDTO setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
        return this;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public VisitDTO setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
        return this;
    }

    public VisitStatus getStatus() {
        return status;
    }

    public VisitDTO setStatus(VisitStatus status) {
        this.status = status;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VisitDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public PatientDTO getPatient() {
        return patient;
    }

    public VisitDTO setPatient(PatientDTO patient) {
        this.patient = patient;
        return this;
    }

    public DoctorDTO getDoctor() {
        return doctor;
    }

    public VisitDTO setDoctor(DoctorDTO doctor) {
        this.doctor = doctor;
        return this;
    }

    public Set<PrescriptionDTO> getPrescriptions() {
        return prescriptions;
    }

    public VisitDTO setPrescriptions(Set<PrescriptionDTO> prescriptions) {
        this.prescriptions = prescriptions;
        return this;
    }

    public PaymentsDTO getPayments() {
        return payments;
    }

    public VisitDTO setPayments(PaymentsDTO payments) {
        this.payments = payments;
        return this;
    }
}
