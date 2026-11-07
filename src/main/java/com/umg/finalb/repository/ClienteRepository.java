package com.umg.finalb.repository;

import com.umg.finalb.dto.ClienteFacturaDto;
import com.umg.finalb.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    // 3. Cliente + factura activa con JOIN y DTO, ordenado por fecha
    @Query("SELECT new com.umg.finalb.dto.ClienteFacturaDto(" +
           "c.nombre, c.apellido, c.nit, f.fechaFactura, f.total) " +
           "FROM Factura f JOIN f.cliente c " +
           "WHERE f.estado = 1 AND c.estado = 1 " +
           "ORDER BY f.fechaFactura")
    List<ClienteFacturaDto> reporteClienteFactura();
}
