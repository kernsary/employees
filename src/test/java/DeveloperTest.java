import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer(
                "Alice Johnstone",
                 "MT987654R",
                27000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Alice Johnstone",
                developer1.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("MT987654R",
                developer1.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(27000.00,
                developer1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer1.raiseSalary(2000.00);
        assertEquals(29000.00,
                developer1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(270.00,
                developer1.payBonus(), 0.01);
    }

}
