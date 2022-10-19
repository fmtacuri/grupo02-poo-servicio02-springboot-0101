package com.grupo02.SceneryOne.repository.impl;

import com.grupo02.SceneryOne.domain.VehicleJpa;
import com.grupo02.SceneryOne.domain.dto.VehicleDto;
import com.grupo02.SceneryOne.domain.enums.FuelType;
import com.grupo02.SceneryOne.exception.InternalErrorException;
import com.grupo02.SceneryOne.exception.NotFoundException;
import com.grupo02.SceneryOne.factory.VehicleFactory;
import com.grupo02.SceneryOne.repository.VehicleJpaRepository;
import com.grupo02.SceneryOne.repository.VehiculeRepository;
import com.grupo02.SceneryOne.service.mapper.VehiculeMapper;
import java.util.Objects;
import javax.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class VehiculeRepositoryImpl implements VehiculeRepository {

  VehicleJpaRepository vehicleJpaRepository;
  VehiculeMapper vehiculeMapper;

  @Override
  @Transactional
  public long saveVehicule(VehicleDto vehicleDto) {
    if (!validateFuelType(vehicleDto.getFuelType())) {
      throw new NotFoundException("Fuel Type Not Found");
    }

    try {
      VehicleJpa vehicleJpa = vehiculeMapper.toVehicleJpa(vehicleDto,
          VehicleFactory.getRegistrationCost(vehicleDto.getFuelType(), vehicleDto.getCapacity())
              .getRegistrationCost(vehicleDto.getPlaque()));

      return vehicleJpaRepository.save(vehicleJpa).getId();
    } catch (Exception exception) {
      log.info("Error Save vehicule: {}", vehicleDto::getPlaque);
      throw new InternalErrorException();
    }
  }

  @Override
  public boolean validateFuelType(String fuelType) {
    return !Objects.isNull(FuelType.findType(fuelType));
  }
}
