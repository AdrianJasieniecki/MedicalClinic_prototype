package com.example.medicalclinic.mappers;

import com.example.medicalclinic.DTOs.PaymentsDTO;
import com.example.medicalclinic.models.PaymentsModel;

public class PaymentsMapper extends AbstractMapper<PaymentsDTO, PaymentsModel>{

    @Override
    public PaymentsModel toEntity(PaymentsDTO paymentsDTO) {
        return new PaymentsModel()
                .setDateOfPayment(paymentsDTO.getDateOfPayment())
                .setPaymentMethod(paymentsDTO.getPaymentMethod())
                .setPaymentStatus(paymentsDTO.getPaymentStatus())
                .setPatient(new PatientMapper().toEntity(paymentsDTO.getPatient()))
                .setVisit(new VisitMapper().toEntity(paymentsDTO.getVisit()));
    }

    @Override
    public PaymentsDTO toDTO(PaymentsModel paymentsModel) {
        return new PaymentsDTO()
                .setId(paymentsModel.getId())
                .setDateOfPayment(paymentsModel.getDateOfPayment())
                .setPaymentMethod(paymentsModel.getPaymentMethod())
                .setPaymentStatus(paymentsModel.getPaymentStatus())
                .setPatient(new PatientMapper().toDTO(paymentsModel.getPatient()))
                .setVisit(new VisitMapper().toDTO(paymentsModel.getVisit()));
    }
}
