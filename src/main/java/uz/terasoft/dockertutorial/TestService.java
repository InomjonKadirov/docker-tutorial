package uz.terasoft.dockertutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.terasoft.dockertutorial.entity.Product;
import uz.terasoft.dockertutorial.repository.ProductRepository;

/**
 * @author : Inam Kadirov
 * @since : 7/25/2020, Sat
 **/

@Component
public class TestService implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {


        Product product = new Product("testdocker2", 34D);
        productRepository.save(product);
    }
}
