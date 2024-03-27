/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.cdan08.calculatrice.Calculatrice;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ndimb
 */
public class NewEmptyJUnitTest {
   
    
     @Test
    public void testAddition() {
        assertEquals(3, Calculatrice.addition(1, 2),3);
    }
    @Test
    public void testsoustraction() {
        assertEquals(5, Calculatrice.soustraction(10, 5),5);
    }
    @Test
    public void testmultiplication() {
        assertEquals(12, Calculatrice.multiplication(3, 4),12);
    }
    @Test
    public void testdivision() {
        assertEquals(5, Calculatrice.division(25, 5),5);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
