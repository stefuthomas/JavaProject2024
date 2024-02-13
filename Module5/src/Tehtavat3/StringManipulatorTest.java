package Tehtavat3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    @Test
    void canConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("concatenate", sm.concatenate("con", "catenate"));
    }
    @Test
    void canFindLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(6, sm.findLength("String"));
    }
    @Test
    void canConvertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("STRING", sm.convertToUpperCase("string"));
    }
    @Test
    void canConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("string", sm.convertToLowerCase("STRING"));
    }
    @Test
    void canFindSubString() {
        StringManipulator sm = new StringManipulator();
        assertEquals(true, sm.containsSubstring("UnitTesting", "Unit"));
    }
}