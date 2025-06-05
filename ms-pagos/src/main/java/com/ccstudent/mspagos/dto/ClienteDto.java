package com.ccstudent.mspagos.dto;

import lombok.Data;

@Data
public class ClienteDto {
    private Long id;
    private String dniOrRuc;
    private String razonSocialONombre;
    private String direccion;
    private String telefono;
}