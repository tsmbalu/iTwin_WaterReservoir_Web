package com.aston.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
public class WaterReservoirAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private WaterReservoir waterReservoir;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date auditDate;
    private double capacity;
    private int hardness;
    private int phLevel;
}
