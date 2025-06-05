package com.ccstudent.mspagos.service.impl;

import com.ccstudent.mspagos.dto.PagoDto;
import com.ccstudent.mspagos.entity.Pago;
import com.ccstudent.mspagos.entity.TipoPago;
import com.ccstudent.mspagos.repository.PagoRepository;
import com.ccstudent.mspagos.repository.TipoPagoRepository;
import com.ccstudent.mspagos.service.PagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PagoServiceImpl implements PagoService {
    private final PagoRepository pagoRepo;
    private final TipoPagoRepository tipoPagoRepo;

    @Override
    public Pago registrarPago(PagoDto dto) {
        TipoPago tipoPago = tipoPagoRepo.findById(Long.valueOf(dto.getTipoPago())).orElseThrow();
        Pago pago = Pago.builder()
                .monto(dto.getMonto())
                .fecha(dto.getFecha())
                .tipoPago(tipoPago)
                .numeroCuotas(dto.getNumeroCuotas())
                .clienteId(dto.getClienteId())
                .build();
        return pagoRepo.save(pago);
    }

    @Override
    public List<Pago> listarPagos() {
        return pagoRepo.findAll();
    }

    @Override
    public TipoPago registrarTipoPago(TipoPago tipoPago) {
        return tipoPagoRepo.save(tipoPago);
    }
}