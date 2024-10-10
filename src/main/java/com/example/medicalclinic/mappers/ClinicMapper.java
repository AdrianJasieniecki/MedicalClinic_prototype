package com.example.medicalclinic.mappers;

import com.example.medicalclinic.DTOs.ClinicDTO;
import com.example.medicalclinic.models.ClinicModel;

public class ClinicMapper extends AbstractMapper<ClinicDTO, ClinicModel> {

    @Override
    public ClinicModel toEntity(ClinicDTO clinicDTO) {
        return new ClinicModel()
                .setName(clinicDTO.getName())
                .setAddress(new AddressMapper().toEntity(clinicDTO.getAddress()))
                .setPhoneNumber(clinicDTO.getPhoneNumber());

    }

    @Override
    public ClinicDTO toDTO(ClinicModel clinicModel) {
        return new ClinicDTO()
                .setId(clinicModel.getId())
                .setName(clinicModel.getName())
                .setAddress(new AddressMapper().toDTO(clinicModel.getAddress()))
                .setPhoneNumber(clinicModel.getPhoneNumber());
    }
}
