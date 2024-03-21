package com.aston.dao;

import com.aston.model.WaterReservoir;
import com.aston.model.WaterReservoirAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaterReservoirAuditDao extends JpaRepository<WaterReservoirAudit, Integer>  {
    public List<WaterReservoirAudit> findByWaterReservoir(WaterReservoir waterReservoir);
}
