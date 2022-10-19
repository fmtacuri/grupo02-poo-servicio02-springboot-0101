package com.grupo02.SceneryOne.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import com.grupo02.SceneryOne.domain.dto.VehicleDto;
import com.grupo02.SceneryOne.repository.VehiculeRepository;
import com.grupo02.SceneryOne.service.mapper.VehiculeMapper;
import javax.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping("${main.rest.path.value}/vehicle")
public class VehicleController {

  VehiculeRepository vehiculeRepository;
  VehiculeMapper vehiculeMapper;

  @PostMapping()
  ResponseEntity<Object> saveVehicle(@RequestBody @Valid VehicleDto vehicleDto) {
    log.info(vehicleDto);
    return new ResponseEntity<>(
        vehiculeRepository.saveVehicule(vehiculeMapper.toVehicleDto(vehicleDto)), CREATED);
  }

  @GetMapping("/{id}")
  ResponseEntity<Object> getVehicle(@PathVariable long id) {
    return new ResponseEntity<>(
        vehiculeRepository.findVehicleById(id), OK);
  }

  @GetMapping("/find-all")
  ResponseEntity<Object> getAllVehicle() {
    return new ResponseEntity<>(
        vehiculeRepository.findAllVehicles(), OK);
  }
}
