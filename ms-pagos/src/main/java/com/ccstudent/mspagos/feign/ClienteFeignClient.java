package com.ccstudent.mspagos.feign;

import com.ccstudent.mspagos.dto.ClienteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-cliente")
public interface ClienteFeignClient {
    @GetMapping("/clientes/{id}")
    ClienteDto getClienteById(@PathVariable Long id);
}
