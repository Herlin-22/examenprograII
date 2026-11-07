package com.umg.finalb.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ClienteFacturaDto {

    private String nombre;
    private String apellido;
    private String nit;
    private LocalDate fechaFactura;
    private BigDecimal total;

    public ClienteFacturaDto(String nombre, String apellido, String nit,
                             LocalDate fechaFactura, BigDecimal total) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.fechaFactura = fechaFactura;
        this.total = total;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getNit() { return nit; }
    public LocalDate getFechaFactura() { return fechaFactura; }
    public BigDecimal getTotal() { return total; }
}
