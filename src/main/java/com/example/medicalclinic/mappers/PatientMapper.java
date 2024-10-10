package com.example.medicalclinic.mappers;

import com.example.medicalclinic.DTOs.PatientDTO;
import com.example.medicalclinic.models.PatientModel;

public class PatientMapper extends AbstractMapper<PatientDTO, PatientModel>{

    @Override
    public PatientModel toEntity(PatientDTO patientDTO) {
        return new PatientModel()
                .setName(patientDTO.getName())
                .setSurname(patientDTO.getSurname())
                .setDateOfBirth(patientDTO.getDateOfBirth())
                .setPesel(patientDTO.getPesel())
                .setPhoneNumber(patientDTO.getPhoneNumber())
                .setAddress(new AddressMapper().toEntity(patientDTO.getAddress()))
                .setVisitModel(new VisitMapper().toEntity(patientDTO.getVisitDTOS()))
                .setPrescriptions(new PrescriptionsMapper().toEntity(patientDTO.getPrescriptions()))
                .setPayments(new PaymentsMapper().toEntity(patientDTO.getPayments()));
    }

    @Override
    public PatientDTO toDTO(PatientModel patientModel) {
        return new PatientDTO()
                .setId(patientModel.getId())
                .setName(patientModel.getName())
                .setSurname(patientModel.getSurname())
                .setDateOfBirth(patientModel.getDateOfBirth())
                .setPesel(patientModel.getPesel())
                .setPhoneNumber(patientModel.getPhoneNumber())
                .setAddress(new AddressMapper().toDTO(patientModel.getAddress()))
                .setVisitDTOS(new VisitMapper().toDTO(patientModel.getVisitModel()))
                .setPrescriptions(new PrescriptionsMapper().toDTO(patientModel.getPrescriptions()))
                .setPayments(new PaymentsMapper().toDTO(patientModel.getPayments()));
    }
}
