package com.example.medicalclinic.DTOs;

import com.example.medicalclinic.models.PaymentMethod;
import com.example.medicalclinic.models.PaymentStatus;

import java.time.LocalDate;

public class PaymentsDTO {

    private Long id;
    private LocalDate dateOfPayment;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private PatientDTO patient;
    private VisitDTO visit;

    public Long getId() {
        return id;
    }

    public PaymentsDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public PaymentsDTO setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
        return this;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public PaymentsDTO setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public PaymentsDTO setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public PatientDTO getPatient() {
        return patient;
    }

    public PaymentsDTO setPatient(PatientDTO patient) {
        this.patient = patient;
        return this;
    }

    public VisitDTO getVisit() {
        return visit;
    }

    public PaymentsDTO setVisit(VisitDTO visit) {
        this.visit = visit;
        return this;
    }
}
