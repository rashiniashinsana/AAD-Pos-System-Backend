package lk.ijse.gdse68.pos_system_backend.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Setter
@Getter

public class ItemDTO {
    private String code;
    private String name;
    private Double price;
    private int qty;


}
