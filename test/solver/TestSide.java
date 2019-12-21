package solver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestSide {
    
    /*
     * Testing Strategy:
     * Cases marked with an "X" have implemented test cases. Cases marked with an "O" do not
     * 
     * get():
     *      X - correctly returns the color for each square on the side
     *      
     * grid():
     *      X - correctly returns the color grid
     * 
     * toString():
     *      X - shows grid with all colors
     */
    
    @Test
    public void testAssertionsEnabled() {
        assertThrows(AssertionError.class, () -> { assert false; },
                "make sure assertions are enabled with VM argument '-ea'");
    }
    
    private boolean checkGetAndGrid(final Side side, final List<List<Color>> expected) {
        
        // Check rep with Side.get()
        for(int x = 0; x < 3; x++) {
            for(int y = 0; y < 3; y++) {
                
                if(!side.get(x, y).equals(expected.get(x).get(y))) {
                    return false;
                }
                
            }
        }
        
        // Check rep with grid()
        if(!side.grid().equals(expected)) {
            return false;
        }
        
        return true;
    }
    
    // Covers get(): correctly returns the color for each square on the side
    // Covers grid(): correctly returns the color grid
    // Covers toString(): shows grid with all colors
    @Test
    public void testAllColors() {
        List<List<Color>> grid = List.of(
                    List.of(Color.RED, Color.BLUE, Color.GREEN),
                    List.of(Color.ORANGE, Color.WHITE, Color.YELLOW),
                    List.of(Color.WHITE, Color.RED, Color.ORANGE)
                );
        
        Side side = new Side(grid);
        
        assertTrue(checkGetAndGrid(side, grid));
        
        String expectedToString = "RBG\nOWY\nWRO";
        assertEquals(expectedToString, side.toString());
    }
}