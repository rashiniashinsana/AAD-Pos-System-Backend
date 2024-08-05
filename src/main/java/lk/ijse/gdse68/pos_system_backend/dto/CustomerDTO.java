package lk.ijse.gdse68.pos_system_backend.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Setter
@Getter
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private Double salary;
}
