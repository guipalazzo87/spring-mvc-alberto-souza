package daos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import models.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
    @PersistenceContext
    private EntityManager manager;

    public void save(Product product) {
        manager.persist(product);
    }

}
