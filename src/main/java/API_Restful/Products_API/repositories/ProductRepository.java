package API_Restful.Products_API.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import API_Restful.Products_API.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{
    
    
}
