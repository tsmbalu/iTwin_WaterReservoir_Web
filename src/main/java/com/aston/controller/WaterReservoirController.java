package com.aston.controller;

import com.aston.dao.WaterReservoirAuditDao;
import com.aston.dao.WaterReservoirDao;
import com.aston.model.WaterReservoir;
import com.aston.model.WaterReservoirAudit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class WaterReservoirController {

    @Autowired
    WaterReservoirDao waterReservoirDao;

    @Autowired
    WaterReservoirAuditDao waterReservoirAuditDao;

    @PostMapping("/reservoir")
    public ResponseEntity<String> addWaterReservoirData(@RequestBody WaterReservoir waterReservoir){
        WaterReservoir output = waterReservoirDao.saveAndFlush(waterReservoir);
        ResponseEntity<String> responseStr = new ResponseEntity<String>("{\"message\": \"success\"}", HttpStatus.OK);
        return responseStr;
    }

    @GetMapping("/all")
    public List<WaterReservoir> getAllWaterReservoir(){
        List<WaterReservoir> waterReservoirs = waterReservoirDao.findAll();
        return waterReservoirs;
    }

    @GetMapping("reservoirAudit")
    public List<WaterReservoirAudit> getAuditDataByName(@RequestParam("name") String waterReservoirName){
        List<WaterReservoirAudit> waterReservoirAudits = null;
        Optional<WaterReservoir> waterReservoir = waterReservoirDao.findByName(waterReservoirName);
        if(waterReservoir.isPresent()){
            waterReservoirAudits =  waterReservoirAuditDao.findByWaterReservoir(waterReservoir.get());
        }

        return waterReservoirAudits;
    }
    @GetMapping("reservoirAudit/{id}")
    public List<WaterReservoirAudit> getAuditDataByID(@PathVariable("id") Integer waterReservoirId){
        List<WaterReservoirAudit> waterReservoirAudits = null;
        Optional<WaterReservoir> waterReservoir = waterReservoirDao.findById(waterReservoirId);
        if(waterReservoir.isPresent()){
            waterReservoirAudits =  waterReservoirAuditDao.findByWaterReservoir(waterReservoir.get());
        }

        return waterReservoirAudits;
    }
}
