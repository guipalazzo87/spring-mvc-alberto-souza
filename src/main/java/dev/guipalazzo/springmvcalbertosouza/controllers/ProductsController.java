package dev.guipalazzo.springmvcalbertosouza.controllers;

import dev.guipalazzo.springmvcalbertosouza.daos.ProductDAO;
import dev.guipalazzo.springmvcalbertosouza.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;

@Controller
@Transactional
@RequestMapping("/products")
public class ProductsController {

    private final ProductDAO productDAO;

    public ProductsController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(Product product) {
        productDAO.save(product);
        return "redirect:/products";
    }

    @RequestMapping("/form")
    public ModelAndView form(){
        ModelAndView modelAndView = new ModelAndView("products/form");
        modelAndView.addObject("bookType", BookType.values());
        return modelAndView;
    }

    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView list(Model model){
        ModelAndView modelAndView = new ModelAndView("products/list");
        modelAndView.addObject("products", productDAO.list());
        return modelAndView;
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("product", new Product());
        return "products/form";
    }
}
