package solver;

import java.util.List;

// Idea 1: cube map of coordinates (side, x, y) to color
//      - transformations defined as map of coordinate -> coordinate for pieces that move
//      - 

/*
 * Immutable type representing a 3x3 rubik's cube
 */
public class Cube {

    public static Cube parseFromFile() {
        throw new RuntimeException("not yet implemented");
    }
    
    Cube(List<Side> sides) {
        throw new RuntimeException("not yet implemented");
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
