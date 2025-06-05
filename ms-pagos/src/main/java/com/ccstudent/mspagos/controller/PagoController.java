package com.ccstudent.mspagos.controller;

import com.ccstudent.mspagos.dto.PagoDto;
import com.ccstudent.mspagos.entity.Pago;
import com.ccstudent.mspagos.entity.TipoPago;
import com.ccstudent.mspagos.service.PagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagos")
@RequiredArgsConstructor
public class PagoController {
    private final PagoService pagoService;

    @PostMapping
    public ResponseEntity<Pago> registrar(@RequestBody PagoDto dto) {
        return ResponseEntity.ok(pagoService.registrarPago(dto));
    }

    @GetMapping
    public ResponseEntity<List<Pago>> listar() {
        return ResponseEntity.ok(pagoService.listarPagos());
    }

    @PostMapping("/tipo")
    public ResponseEntity<TipoPago> registrarTipo(@RequestBody TipoPago tipoPago) {
        return ResponseEntity.ok(pagoService.registrarTipoPago(tipoPago));
    }
}