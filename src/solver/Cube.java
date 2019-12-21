package solver;

import java.util.List;

/*
 * Immutable type representing a 3x3 rubik's cube
 */
public class Cube {

    private final List<Side> sides;
    
    /*
        Abstraction function:
    
            AF(sides) = a 3x3 rubik's cube where:
                        sides.get(0) is the front side,
                        sides.get(1) is the top side,
                        sides.get(2) is the back side,
                        sides.get(3) is the bottom side,
                        sides.get(4) is the left side,
                        sides.get(5) is the right side,
    
        Rep invariant:
            - sides.size() == 6
    
        Safety from rep exposure
            - All fields are private and final
            - TODO
     */
    
    public static Cube parseFromFile() {
        throw new RuntimeException("not yet implemented");
    }
    
    Cube(List<Side> sides) {
        throw new RuntimeException("not yet implemented");
    }
    
    private void checkRep() {
    }
    
    public Cube transform(Plane plane, int rotations) {
        throw new RuntimeException("not yet implemented");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("not yet implemented");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("not yet implemented");
    }
    
}
