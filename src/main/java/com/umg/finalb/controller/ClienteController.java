package com.umg.finalb.controller;

import com.umg.finalb.dto.ClienteFacturaDto;
import com.umg.finalb.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:5173")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/reporteClienteFactura")
    public List<ClienteFacturaDto> reporteClienteFactura() {
        return clienteService.reporteClienteFactura();
    }
}
