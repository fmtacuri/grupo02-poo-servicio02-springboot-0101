package com.grupo02.SceneryOne;

import static com.grupo02.SceneryOne.domain.enums.FuelType.DIESEL;
import static com.grupo02.SceneryOne.domain.enums.FuelType.GASOLINE;

import com.grupo02.SceneryOne.factory.VehicleFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class SceneryOneApplication {

  public static void main(String[] args) {
    SpringApplication.run(SceneryOneApplication.class, args);
    log.info(VehicleFactory.getRegistrationCost(DIESEL.getFuelType(), 300).getRegistrationCost("A"));
    log.info(VehicleFactory.getRegistrationCost(GASOLINE.getFuelType(), 300).getRegistrationCost("B"));
    log.info(VehicleFactory.getRegistrationCost(GASOLINE.getFuelType(), 5000).getRegistrationCost("C"));
  }

}
