package com.umg.finalb.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FACTURA_DETALLE")
    private Integer idFacturaDetalle;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "PRECIO_UNITARIO")
    private BigDecimal precioUnitario;

    @Column(name = "SUBTOTAL")
    private BigDecimal subtotal;

    @ManyToOne
    @JoinColumn(name = "ID_FACTURA")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "ID_ARTICULO")
    private Articulo articulo;

    public Integer getIdFacturaDetalle() { return idFacturaDetalle; }
    public void setIdFacturaDetalle(Integer idFacturaDetalle) { this.idFacturaDetalle = idFacturaDetalle; }
    public Integer getCantidad() { return cantidad; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public BigDecimal getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(BigDecimal precioUnitario) { this.precioUnitario = precioUnitario; }
    public BigDecimal getSubtotal() { return subtotal; }
    public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }
    public Factura getFactura() { return factura; }
    public void setFactura(Factura factura) { this.factura = factura; }
    public Articulo getArticulo() { return articulo; }
    public void setArticulo(Articulo articulo) { this.articulo = articulo; }
}
