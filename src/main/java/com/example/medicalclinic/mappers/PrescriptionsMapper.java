package com.example.medicalclinic.mappers;

import com.example.medicalclinic.DTOs.PrescriptionDTO;
import com.example.medicalclinic.models.PrescriptionModel;

public class PrescriptionsMapper extends AbstractMapper<PrescriptionDTO, PrescriptionModel>{

    @Override
    public PrescriptionModel toEntity(PrescriptionDTO prescriptionDTO) {
        return new PrescriptionModel()
                .setDateOfIssue(prescriptionDTO.getDateOfIssue())
                .setMedicines(prescriptionDTO.getMedicines())
                .setPrescriptionCode(prescriptionDTO.getPrescriptionCode())
                .setPatient(new PatientMapper().toEntity(prescriptionDTO.getPatient()))
                .setDoctor(new DoctorMapper().toEntity(prescriptionDTO.getDoctor()))
                .setVisit(new VisitMapper().toEntity(prescriptionDTO.getVisit()));
    }

    @Override
    public PrescriptionDTO toDTO(PrescriptionModel prescriptionModel) {
        return new PrescriptionDTO()
                .setId(prescriptionModel.getId())
                .setDateOfIssue(prescriptionModel.getDateOfIssue())
                .setMedicines(prescriptionModel.getMedicines())
                .setPrescriptionCode(prescriptionModel.getPrescriptionCode())
                .setPatient(new PatientMapper().toDTO(prescriptionModel.getPatient()))
                .setDoctor(new DoctorMapper().toDTO(prescriptionModel.getDoctor()))
                .setVisit(new VisitMapper().toDTO(prescriptionModel.getVisit()));
    }
}
