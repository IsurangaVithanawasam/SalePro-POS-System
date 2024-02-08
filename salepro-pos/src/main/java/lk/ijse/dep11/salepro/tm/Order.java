package lk.ijse.dep11.salepro.tm;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private String orderId;
    private String orderDate;
    private String customerId;
    private String customerName;
    private BigDecimal orderTotal;
}
