package lk.ijse.gdse68.pos_system_backend.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Setter
@Getter

public class ItemDTO {
    private String code;
    private String name;
    private BigDecimal price;
    private int qty;


}
