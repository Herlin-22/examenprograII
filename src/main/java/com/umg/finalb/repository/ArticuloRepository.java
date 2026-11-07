package com.umg.finalb.repository;

import com.umg.finalb.dto.ArticuloCategoriaDto;
import com.umg.finalb.entity.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {

    // 1. Articulos activos cuyo nombre contenga el texto (sin distinguir mayusculas/minusculas)
    List<Articulo> findByEstadoAndNombreContainingIgnoreCaseOrderByNombre(Integer estado, String nombre);

    // 2. Articulo + categoria con JOIN y DTO, ordenado por categoria y nombre
    @Query("SELECT new com.umg.finalb.dto.ArticuloCategoriaDto(" +
           "a.nombre, a.marca, c.nombre, a.precio, a.stock) " +
           "FROM Articulo a JOIN a.categoria c " +
           "WHERE a.estado = 1 AND c.estado = 1 " +
           "ORDER BY c.nombre, a.nombre")
    List<ArticuloCategoriaDto> reporteArticuloCategoria();
}
