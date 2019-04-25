package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.dao;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Long>{
        
}
