package controllers;

import daos.ProductDAO;
import models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

    private final ProductDAO productDAO;

    public ProductsController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @RequestMapping("/products")
    public String save(Product product) {
        productDAO.save(product);
        return "products/ok";
    }

    @RequestMapping("/products/form")
    public String form(){
        return "products/form";
    }


}
