import com.company.lollyShopSystem.Employer;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployerTest {

    @Test

    public void setDiscountTest(){
        Employer employer = new Employer();
        employer.setHourlyWorked(21.0);
        employer.setDiscount();
        assertEquals(10,employer.getDiscount());

    }

}
