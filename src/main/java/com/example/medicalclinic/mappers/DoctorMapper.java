package com.example.medicalclinic.mappers;

import com.example.medicalclinic.DTOs.DoctorDTO;
import com.example.medicalclinic.models.DoctorModel;

public class DoctorMapper extends AbstractMapper<DoctorDTO, DoctorModel>{

    @Override
    public DoctorModel toEntity(DoctorDTO doctorDTO) {
        return new DoctorModel()
                .setName(doctorDTO.getName())
                .setSurname(doctorDTO.getSurname())
                .setMedicalSpecialization(doctorDTO.getMedicalSpecialization())
                .setEmail(doctorDTO.getEmail())
                .setPhoneNumber(doctorDTO.getPhoneNumber())
                .setVisits(new VisitMapper().toEntity(doctorDTO.getVisits()));
    }

    @Override
    public DoctorDTO toDTO(DoctorModel doctorModel) {
        return new DoctorDTO()
                .setId(doctorModel.getId())
                .setName(doctorModel.getName())
                .setSurname(doctorModel.getSurname())
                .setMedicalSpecialization(doctorModel.getMedicalSpecialization())
                .setEmail(doctorModel.getEmail())
                .setPhoneNumber(doctorModel.getPhoneNumber())
                .setVisits(new VisitMapper().toDTO(doctorModel.getVisits()));
    }
}
