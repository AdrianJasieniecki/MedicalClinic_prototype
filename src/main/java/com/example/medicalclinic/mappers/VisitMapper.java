package com.example.medicalclinic.mappers;

import com.example.medicalclinic.DTOs.VisitDTO;
import com.example.medicalclinic.models.VisitModel;

public class VisitMapper extends AbstractMapper<VisitDTO, VisitModel>{

    @Override
    public VisitModel toEntity(VisitDTO visitDTO) {
        return new VisitModel()
                .setVisitDate(visitDTO.getVisitDate())
                .setVisitTime(visitDTO.getVisitTime())
                .setStatus(visitDTO.getStatus())
                .setDescription(visitDTO.getDescription())
                .setPatient(new PatientMapper().toEntity(visitDTO.getPatient()))
                .setDoctor(new DoctorMapper().toEntity(visitDTO.getDoctor()))
                .setPrescriptions(new PrescriptionsMapper().toEntity(visitDTO.getPrescriptions()))
                .setPayments(new PaymentsMapper().toEntity(visitDTO.getPayments()));
    }

    @Override
    public VisitDTO toDTO(VisitModel visitModel) {
        return new VisitDTO()
                .setId(visitModel.getId())
                .setVisitDate(visitModel.getVisitDate())
                .setVisitTime(visitModel.getVisitTime())
                .setStatus(visitModel.getStatus())
                .setDescription(visitModel.getDescription())
                .setPatient(new PatientMapper().toDTO(visitModel.getPatient()))
                .setDoctor(new DoctorMapper().toDTO(visitModel.getDoctor()))
                .setPrescriptions(new PrescriptionsMapper().toDTO(visitModel.getPrescriptions()))
                .setPayments(new PaymentsMapper().toDTO(visitModel.getPayments()));
    }
}
