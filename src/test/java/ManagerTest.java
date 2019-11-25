import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager1;

    @Before
    public void before(){
        manager1 = new Manager("Bob Ross", "BB123456C", 35000.00, "Production");
    }

    @Test
    public void hasName(){
        assertEquals("Bob Ross", manager1.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("BB123456C", manager1.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Production", manager1.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager1.raiseSalary(2000.00);
        assertEquals(37000.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.00, manager1.payBonus(), 0.01);
    }
}
