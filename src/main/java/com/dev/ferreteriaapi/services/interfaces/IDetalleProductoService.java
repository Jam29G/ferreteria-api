package com.dev.ferreteriaapi.services.interfaces;

import com.dev.ferreteriaapi.entities.DetalleProducto;

import java.util.List;

public interface IDetalleProductoService {

    DetalleProducto create(DetalleProducto detalle);

    List<DetalleProducto> getAllDetalle();

    List<DetalleProducto> findDetalle(String filter);
    List<DetalleProducto> getProductosVencidos();

    DetalleProducto update(DetalleProducto detalle, Long id);
    DetalleProducto updateCantidad(DetalleProducto detalle, Long id, Long usuarioId);
    List<DetalleProducto> getDetallesByEmpresa(Long empresaId, Boolean estado);
    DetalleProducto getById(Long id);
    List<DetalleProducto> getByProductoId(Long id, Boolean estado);

    boolean checkPerecederos();

    void changeState(Long id, Boolean estado);
}
