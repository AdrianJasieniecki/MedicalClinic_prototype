package com.example.medicalclinic.DTOs;

import java.time.LocalDate;

public class PrescriptionDTO {

    private Long id;
    private LocalDate dateOfIssue;
    private String medicines;
    private String prescriptionCode;
    private PatientDTO patient;
    private DoctorDTO doctor;
    private VisitDTO visit;

    public Long getId() {
        return id;
    }

    public PrescriptionDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public PrescriptionDTO setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    public String getMedicines() {
        return medicines;
    }

    public PrescriptionDTO setMedicines(String medicines) {
        this.medicines = medicines;
        return this;
    }

    public String getPrescriptionCode() {
        return prescriptionCode;
    }

    public PrescriptionDTO setPrescriptionCode(String prescriptionCode) {
        this.prescriptionCode = prescriptionCode;
        return this;
    }

    public PatientDTO getPatient() {
        return patient;
    }

    public PrescriptionDTO setPatient(PatientDTO patient) {
        this.patient = patient;
        return this;
    }

    public DoctorDTO getDoctor() {
        return doctor;
    }

    public PrescriptionDTO setDoctor(DoctorDTO doctor) {
        this.doctor = doctor;
        return this;
    }

    public VisitDTO getVisit() {
        return visit;
    }

    public PrescriptionDTO setVisit(VisitDTO visit) {
        this.visit = visit;
        return this;
    }
}
