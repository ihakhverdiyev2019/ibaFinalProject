package iba.Final.Project.ibaFinalProject.Controller;


import iba.Final.Project.ibaFinalProject.Domain.Product;
import iba.Final.Project.ibaFinalProject.Repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
public class ProductController {
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/get/product/{id}")
    public Product getList(@PathVariable("id") String id){

        return productRepository.findById(Integer.parseInt(id)).get();

    }




}
