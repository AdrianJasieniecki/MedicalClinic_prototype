package com.example.medicalclinic.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PAYMENTS")
public class PaymentsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payments_generator")
    @SequenceGenerator(name = "payments_generator", sequenceName = "payments_seq", allocationSize = 1)
    @Column(name = "payments_id")
    private Long id;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "date_of_payment")
    private LocalDate dateOfPayment;

    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Column(name = "payment_status")
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private PatientModel patient;

    @OneToOne
    @JoinColumn(name = "payments_id", referencedColumnName = "visits_id")
    private VisitModel visit;

    public Long getId() {
        return id;
    }

    public PaymentsModel setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public PaymentsModel setSum(BigDecimal sum) {
        this.sum = sum;
        return this;
    }

    public LocalDate getDateOfPayment() {
        return dateOfPayment;
    }

    public PaymentsModel setDateOfPayment(LocalDate dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
        return this;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public PaymentsModel setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public PaymentsModel setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public PatientModel getPatient() {
        return patient;
    }

    public PaymentsModel setPatient(PatientModel patient) {
        this.patient = patient;
        return this;
    }

    public VisitModel getVisit() {
        return visit;
    }

    public PaymentsModel setVisit(VisitModel visit) {
        this.visit = visit;
        return this;
    }
}
