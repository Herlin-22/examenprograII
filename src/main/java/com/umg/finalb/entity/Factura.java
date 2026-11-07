package com.umg.finalb.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FACTURA")
    private Integer idFactura;

    @Column(name = "ESTADO")
    private Integer estado;

    @Column(name = "FECHA_FACTURA")
    private LocalDate fechaFactura;

    @Column(name = "ESTADO_FACTURA")
    private String estadoFactura;

    @Column(name = "TOTAL")
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    public Integer getIdFactura() { return idFactura; }
    public void setIdFactura(Integer idFactura) { this.idFactura = idFactura; }
    public Integer getEstado() { return estado; }
    public void setEstado(Integer estado) { this.estado = estado; }
    public LocalDate getFechaFactura() { return fechaFactura; }
    public void setFechaFactura(LocalDate fechaFactura) { this.fechaFactura = fechaFactura; }
    public String getEstadoFactura() { return estadoFactura; }
    public void setEstadoFactura(String estadoFactura) { this.estadoFactura = estadoFactura; }
    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
