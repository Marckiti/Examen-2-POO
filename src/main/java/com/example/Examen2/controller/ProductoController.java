package com.example.Examen2.controller;

import com.example.Examen2.model.Producto;
import com.example.Examen2.service.IProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(productoService.listarProductos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(productoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Producto> crear(@Valid @RequestBody Producto producto) {
        Producto crear = productoService.guardar(producto);
        return new ResponseEntity<>(crear,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizar(@Valid @RequestBody Producto producto, @PathVariable Long id) {
        Producto productoActual = productoService.buscarPorId(id);
        productoActual.setNombre(producto.getNombre());
        productoActual.setPrecio(producto.getPrecio());
        productoActual.setStock(producto.getStock());
        return ResponseEntity.ok(productoService.guardar(productoActual));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        productoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
