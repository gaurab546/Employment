import com.company.lollyShopSystem.Supplier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupplierTest {

    @Test
    public void setDiscountTest(){
        Supplier supplier = new Supplier();
        supplier.supplierStatus = "Active";
        supplier.setDiscount();
        assertEquals(15, supplier.getDiscount());


    }
}
