import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    Visitor visitor;
    Park park;

    @Before
    public void before(){
        visitor = new Visitor("Dave", "Accountant");
        park = new Park(100);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", visitor.getName());
    }

    @Test
    public void canGetJobTitle(){
        assertEquals("Accountant", visitor.getJobTitle());
    }
}
