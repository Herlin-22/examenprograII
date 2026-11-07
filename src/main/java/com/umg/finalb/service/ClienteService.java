package com.umg.finalb.service;

import com.umg.finalb.dto.ClienteFacturaDto;
import com.umg.finalb.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteFacturaDto> reporteClienteFactura() {
        return clienteRepository.reporteClienteFactura();
    }
}
