package lk.ijse.gdse68.pos_system_backend.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Customer {
    private String id;
    private String name;
    private  String address;
    private Double salary;
}
