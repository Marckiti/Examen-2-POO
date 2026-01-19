package com.example.Examen2.service;

import com.example.Examen2.model.Producto;
import java.util.List;

public interface IProductoService {
    List<Producto> listarProductos();
    Producto buscarPorId(Long id);
    Producto guardar(Producto producto);
    void eliminar(Long id);
}
