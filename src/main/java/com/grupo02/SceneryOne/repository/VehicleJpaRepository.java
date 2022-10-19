package com.grupo02.SceneryOne.repository;

import com.grupo02.SceneryOne.domain.VehicleJpa;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleJpaRepository extends JpaRepository<VehicleJpa, Long> {

  @Override
  Optional<VehicleJpa> findById(Long id);

  @Query("SELECT vehicle FROM VehicleJpa vehicle")
  Optional<List<VehicleJpa>> findAllVehicles();
}
