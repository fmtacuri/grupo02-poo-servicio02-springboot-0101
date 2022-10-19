package com.grupo02.SceneryOne.service.mapper;

import com.grupo02.SceneryOne.domain.VehicleJpa;
import com.grupo02.SceneryOne.domain.dto.VehicleDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehiculeMapper {

  VehicleDto toVehicleDto(VehicleDto vehicleDto);

  @Mapping(target = "id", ignore = true)
  VehicleJpa toVehicleJpa(VehicleDto vehicleDto, float registrationCost);
}
