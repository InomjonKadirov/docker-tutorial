package uz.terasoft.dockertutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.terasoft.dockertutorial.entity.Product;

/**
 * @author : Inam Kadirov
 * @since : 7/25/2020, Sat
 **/

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
