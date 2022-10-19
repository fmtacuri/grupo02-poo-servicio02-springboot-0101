package com.grupo02.SceneryOne.repository;

import com.grupo02.SceneryOne.domain.VehicleJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleJpaRepository extends JpaRepository<VehicleJpa, Long> {

}
