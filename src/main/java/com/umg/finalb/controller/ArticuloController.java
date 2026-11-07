package com.umg.finalb.controller;

import com.umg.finalb.dto.ArticuloCategoriaDto;
import com.umg.finalb.entity.Articulo;
import com.umg.finalb.service.ArticuloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulos")
@CrossOrigin(origins = "http://localhost:5173")
public class ArticuloController {

    private final ArticuloService articuloService;

    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping("/mostrarActivosFiltro")
    public List<Articulo> mostrarActivosFiltro(@RequestParam(defaultValue = "") String nombre) {
        return articuloService.mostrarActivosFiltro(nombre);
    }

    @GetMapping("/reporteArticuloCategoria")
    public List<ArticuloCategoriaDto> reporteArticuloCategoria() {
        return articuloService.reporteArticuloCategoria();
    }
}
