package lk.ijse.dep11.salepro.tm;

import com.jfoenix.controls.JFXButton;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable {
    private String code;
    private String description;
    private int qty;
    private BigDecimal unitPrice;
    private transient JFXButton btnDelete;

    public BigDecimal getTotal() {
        return unitPrice.multiply(new BigDecimal(qty)).setScale(2);
    }
}
