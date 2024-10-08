package com.example.medicalclinic.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "VISITS")
public class VisitModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visits_generator")
    @SequenceGenerator(name = "visits_generator", sequenceName = "visits_seq", allocationSize = 1)
    @Column(name = "visit_id")
    private Long id;

    @Column(name = "visit_date")
    private LocalDate visitDate;

    @Column(name = "visit_time")
    private LocalTime visitTime;

    @Column(name = "visit_status")
    @Enumerated(EnumType.STRING)
    private VisitStatus status;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientModel patient;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorModel doctor;

    public Long getId() {
        return id;
    }

    public VisitModel setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public VisitModel setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
        return this;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public VisitModel setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
        return this;
    }

    public VisitStatus getStatus() {
        return status;
    }

    public VisitModel setStatus(VisitStatus status) {
        this.status = status;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public VisitModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public PatientModel getPatient() {
        return patient;
    }

    public VisitModel setPatient(PatientModel patient) {
        this.patient = patient;
        return this;
    }

    public DoctorModel getDoctor() {
        return doctor;
    }

    public VisitModel setDoctor(DoctorModel doctor) {
        this.doctor = doctor;
        return this;
    }
}
