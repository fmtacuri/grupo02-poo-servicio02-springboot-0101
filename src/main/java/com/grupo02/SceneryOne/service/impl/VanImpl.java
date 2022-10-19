package com.grupo02.SceneryOne.service.impl;

import com.grupo02.SceneryOne.service.VehicleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class VanImpl implements VehicleService {

  @Override
  public float getRegistrationCost(String plaque) {
    log.info("It is VAN: {}", () -> plaque);
    return 139.55F;
  }
}
