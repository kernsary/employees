import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dbadmin1;

    @Before
    public void before(){
        dbadmin1 = new DatabaseAdmin(
                "Susan White",
                "CF246813J",
                25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Susan White", dbadmin1.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("CF246813J", dbadmin1.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00,
                dbadmin1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        dbadmin1.raiseSalary(2000.00);
        assertEquals(27000.00,
                dbadmin1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250.00,
                dbadmin1.payBonus(), 0.01);
    }
}
