package uz.terasoft.dockertutorial.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Inam Kadirov
 * @since : 7/25/2020, Sat
 **/

@Data
@NoArgsConstructor
public class ResponseModel {

    private String status;
    private String message;

    public ResponseModel(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
