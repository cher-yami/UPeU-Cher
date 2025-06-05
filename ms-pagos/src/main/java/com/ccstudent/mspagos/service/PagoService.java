package com.ccstudent.mspagos.service;

import com.ccstudent.mspagos.dto.PagoDto;
import com.ccstudent.mspagos.entity.Pago;
import com.ccstudent.mspagos.entity.TipoPago;

import java.util.List;

public interface PagoService {
    Pago registrarPago(PagoDto dto);
    List<Pago> listarPagos();
    TipoPago registrarTipoPago(TipoPago tipoPago);
}
