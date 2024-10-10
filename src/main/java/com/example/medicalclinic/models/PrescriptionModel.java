package com.example.medicalclinic.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "PRESCRIPTIONS")
public class PrescriptionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescription_generator")
    @SequenceGenerator(name = "prescription_generator", sequenceName = "prescription_seq", allocationSize = 1)
    @Column(name = "prescription_id")
    private Long id;

    @Column(name = "date_of_issue")
    private LocalDate dateOfIssue;

    @Column(name = "medicines")
    private String medicines;

    @Column(name = "prescription_code")
    private String prescriptionCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientModel patient;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorModel doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visit_id")
    private VisitModel visit;

    public Long getId() {
        return id;
    }

    public PrescriptionModel setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public PrescriptionModel setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    public String getMedicines() {
        return medicines;
    }

    public PrescriptionModel setMedicines(String medicines) {
        this.medicines = medicines;
        return this;
    }

    public String getPrescriptionCode() {
        return prescriptionCode;
    }

    public PrescriptionModel setPrescriptionCode(String prescriptionCode) {
        this.prescriptionCode = prescriptionCode;
        return this;
    }

    public PatientModel getPatient() {
        return patient;
    }

    public PrescriptionModel setPatient(PatientModel patient) {
        this.patient = patient;
        return this;
    }

    public DoctorModel getDoctor() {
        return doctor;
    }

    public PrescriptionModel setDoctor(DoctorModel doctor) {
        this.doctor = doctor;
        return this;
    }

    public VisitModel getVisit() {
        return visit;
    }

    public PrescriptionModel setVisit(VisitModel visit) {
        this.visit = visit;
        return this;
    }

    @Override
    public String toString() {
        return "PrescriptionModel{" +
                "id=" + id +
                ", dateOfIssue=" + dateOfIssue +
                ", medicines='" + medicines + '\'' +
                ", prescriptionCode='" + prescriptionCode + '\'' +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", visit=" + visit +
                '}';
    }
}
