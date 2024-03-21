package com.aston.dao;

import com.aston.model.WaterReservoir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WaterReservoirDao extends JpaRepository<WaterReservoir, Integer> {
    Optional<WaterReservoir> findByName(String waterReservoirName);
}