package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.controller;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/buscarTodos")
    public List<ProductoEntity> buscarTodos() {
        return this.productoService.buscarTodos();
    }
    
    @PostMapping("/registrarProducto")
    public ProductoEntity create(@RequestBody(required = true) ProductoEntity newProducto) {
        return this.productoService.createProducto(newProducto);
    }
    
    @PutMapping("/actualizarStock/{id}/incrementar/{stock}")
    public ProductoEntity incrementarStock(@PathVariable(required = true) int id, int stock, @RequestBody(required = true) ProductoEntity productoToUpdate) {
        productoToUpdate.setStock(productoToUpdate.getStock()+stock);
        return this.productoService.updateProducto(productoToUpdate);
    }
    
    @PutMapping("/actualizarStock/{id}/decrementar/{stock}")
    public ProductoEntity decrementarStock(@PathVariable(required = true) int id, int stock, @RequestBody(required = true) ProductoEntity productoToUpdate) {
        productoToUpdate.setStock(productoToUpdate.getStock()-stock);
        return this.productoService.updateProducto(productoToUpdate);
    }
    
}
