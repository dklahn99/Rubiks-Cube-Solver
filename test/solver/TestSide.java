package solver;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TestSide {
    
    /*
     * Testing Strategy:
     * Cases marked with an "X" have implemented test cases. Cases marked with an "O" do not
     * 
     * parseFromFile():
     */
    
    @Test
    public void testAssertionsEnabled() {
        assertThrows(AssertionError.class, () -> { assert false; },
                "make sure assertions are enabled with VM argument '-ea'");
    }
}