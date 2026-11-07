package com.umg.finalb.service;

import com.umg.finalb.dto.ArticuloCategoriaDto;
import com.umg.finalb.entity.Articulo;
import com.umg.finalb.repository.ArticuloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {

    private static final Integer ACTIVO = 1;

    private final ArticuloRepository articuloRepository;

    public ArticuloService(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    public List<Articulo> mostrarActivosFiltro(String nombre) {
        String filtro = nombre == null ? "" : nombre.trim();
        return articuloRepository.findByEstadoAndNombreContainingIgnoreCaseOrderByNombre(ACTIVO, filtro);
    }

    public List<ArticuloCategoriaDto> reporteArticuloCategoria() {
        return articuloRepository.reporteArticuloCategoria();
    }
}
