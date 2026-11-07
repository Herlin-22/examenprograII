package com.umg.finalb.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "articulo")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ARTICULO")
    private Integer idArticulo;

    @Column(name = "ESTADO")
    private Integer estado;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "PRECIO")
    private BigDecimal precio;

    @Column(name = "STOCK")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA")
    private Categoria categoria;

    public Integer getIdArticulo() { return idArticulo; }
    public void setIdArticulo(Integer idArticulo) { this.idArticulo = idArticulo; }
    public Integer getEstado() { return estado; }
    public void setEstado(Integer estado) { this.estado = estado; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }
    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
