package gt.edu.umg.ingenieria.sistemas.parcial2.factura.dao;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.DetalleFacturaEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturaRepository extends CrudRepository<DetalleFacturaEntity, Long> {
    
    public List findByHeader(Long header);
    
}
