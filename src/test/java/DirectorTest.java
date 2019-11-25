import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director1;

    @Before
    public void before(){
        director1 = new Director(
                "Zoe McPhail",
                "BV345678U",
                40000.00,
                "Production",
                4500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Zoe McPhail", director1.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("BV345678U", director1.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, director1.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Production", director1.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(4500000.00, director1.getBudget(), 0.01);
    }

    @Test
    public void canChangeName(){
        director1.changeName("Zoe Nic Phail");
        assertEquals("Zoe Nic Phail", director1.getName());
    }

    @Test
    public void cannotChangeNameToEmptyString(){
        director1.changeName("");
        assertEquals("Zoe McPhail", director1.getName());
    }

    @Test
    public void cannotChangeNameToNull(){
        director1.changeName(null);
        assertEquals("Zoe McPhail", director1.getName());
    }

    @Test
    public void canRaiseSalary(){
        director1.raiseSalary(2000.00);
        assertEquals(42000.00, director1.getSalary(), 0.01);
    }

    @Test
    public void cannotChangeSalaryIfNegativeIncrement(){
        director1.raiseSalary(-2000.00);
        assertEquals(40000.00, director1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(800, director1.payBonus(), 0.01);
    }

}
