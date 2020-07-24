package uz.terasoft.dockertutorial.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author : Inam Kadirov
 * @since : 7/25/2020, Sat
 **/

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;


    public Product(String testdocker, double v) {
        this.name = testdocker;
        this.price = v;
    }
}
