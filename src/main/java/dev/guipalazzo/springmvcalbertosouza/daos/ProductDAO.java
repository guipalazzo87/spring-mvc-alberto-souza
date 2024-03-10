package dev.guipalazzo.springmvcalbertosouza.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import dev.guipalazzo.springmvcalbertosouza.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {
    @PersistenceContext
    private EntityManager manager;

    public void save(Product product) {
        manager.persist(product);
    }

    public List<Product> list() {
        return manager.createQuery("select distinct(p) from Product p join fetch p.prices",Product.class).getResultList();
    }
}