package uz.terasoft.dockertutorial.controller;

/**
 * @author : Inam Kadirov
 * @since : 7/25/2020, Sat
 **/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.terasoft.dockertutorial.entity.Product;
import uz.terasoft.dockertutorial.model.ResponseModel;
import uz.terasoft.dockertutorial.repository.ProductRepository;

@RestController
@RequestMapping("api/main")
public class MainController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseModel getResponseModel() {

        Product product = new Product("testdocker", 34D);
        productRepository.save(product);


        return new ResponseModel("status", product.getId().toString());
    }
}
