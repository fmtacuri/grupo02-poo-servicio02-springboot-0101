package com.grupo02.SceneryOne.service.impl;

import com.grupo02.SceneryOne.service.VehicleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class VanImpl implements VehicleService {

  @Override
  public float getRegistrationCost() {
    return 20;
  }
}
