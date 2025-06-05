package com.ccstudent.mspagos.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class PagoDto {
    private Long id;
    private BigDecimal monto;
    private LocalDate fecha;
    private String tipoPago;
    private Integer numeroCuotas;
    private Long clienteId;
}