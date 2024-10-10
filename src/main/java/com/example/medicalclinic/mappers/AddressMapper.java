package com.example.medicalclinic.mappers;

import com.example.medicalclinic.DTOs.AddressDTO;
import com.example.medicalclinic.models.AddressModel;

public class AddressMapper extends AbstractMapper<AddressDTO, AddressModel>{

    @Override
    public AddressModel toEntity(AddressDTO addressDTO) {
        return new AddressModel()
                .setStreet(addressDTO.getStreet())
                .setApartmentNumber(addressDTO.getApartmentNumber())
                .setCity(addressDTO.getCity())
                .setProvince(addressDTO.getProvince())
                .setCountry(addressDTO.getCountry())
                .setZipCode(addressDTO.getZipCode());
    }

    @Override
    public AddressDTO toDTO(AddressModel addressModel) {
        return new AddressDTO()
                .setStreet(addressModel.getStreet())
                .setApartmentNumber(addressModel.getApartmentNumber())
                .setCity(addressModel.getCity())
                .setProvince(addressModel.getProvince())
                .setCountry(addressModel.getCountry())
                .setZipCode(addressModel.getZipCode());
    }
}
