package lk.ijse.dep11.salepro.tm;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {
    private String code;
    private String description;
    private int qty;
    private BigDecimal unitPrice;

    @Override
    public String toString() {
        return code;
    }
}
