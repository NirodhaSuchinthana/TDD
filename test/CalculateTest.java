/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math.*;

/**
 *
 * @author Nirodha
 */
public class CalculateTest {
    
    public CalculateTest() {
        
    }
    @Test
    public void testGetRadius(){
        Calculate cal = new Calculate(2.5);
        double correct_radius = 2.5;
        double result_radius = cal.getRadius();
        assertEquals(correct_radius,result_radius,0.0001);
    }
    
    @Test
    public void testPerimetre() {
        Calculate cal = new Calculate(2);
        double correct_value = 2*Math.PI*2;
        double result_value = cal.perimetre();
        assertEquals(correct_value,result_value,0.0001);
    }
    
    @Test
    public void testArea() {
        Calculate cal = new Calculate(3);
        double correct_value = Math.PI*3*3;
        double result_value = cal.area();
        assertEquals(correct_value,result_value,0.0001);
    }
    
    @Test
    public void testVolume() {
        Calculate cal = new Calculate(2);
        double correct_value = 4*Math.PI*2*2*2/3;
        double result_value = cal.volume();
        assertEquals(correct_value,result_value,0.0001);
    }
    
    
}
