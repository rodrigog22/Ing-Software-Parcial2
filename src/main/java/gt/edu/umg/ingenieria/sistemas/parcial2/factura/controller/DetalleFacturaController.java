package gt.edu.umg.ingenieria.sistemas.parcial2.factura.controller;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.CabeceraFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.DetalleFacturaEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.factura.service.FacturaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalleFactura")
public class DetalleFacturaController {
 
    private FacturaService detalleFacturaService;
    
    @PostMapping("/crearDetalleFactura/{header}")
    public DetalleFacturaEntity create(@RequestBody(required = true) DetalleFacturaEntity newDetalleFactura) {
        
        return this.detalleFacturaService.createDetalleFactura(newDetalleFactura);
    }
    
}
