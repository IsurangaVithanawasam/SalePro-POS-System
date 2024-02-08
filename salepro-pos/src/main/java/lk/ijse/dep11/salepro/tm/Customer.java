package lk.ijse.dep11.salepro.tm;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
    private String id;
    private String name;
    private String address;

    @Override
    public String toString() {
        return id;
    }
}
