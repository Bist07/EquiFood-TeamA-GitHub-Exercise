package com.equifood;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void No_Modification_Returns_Sorted_List()
    {
        List<Integer> list = Arrays.asList(1,5,2,3,7);
        App.arraySort(list,0);
        List<Integer> sortedlist = Arrays.asList(1,2,3,5,7);
        assertEquals(sortedlist, list);
    }
    @Test
    public void Reverse_Modification_Returns_Reversed_List()
    {
        List<Integer> list = Arrays.asList(1,5,2,3,7);
        App.arraySort(list,1);
        List<Integer> sortedlist = Arrays.asList(7,5,3,2,1);
        assertEquals(sortedlist, list);
    }
    @Test
    public void Prime_Modification_Returns_Sorted_Primes()  //Basic test to check Prim number puller
    {
        List<Integer> list = Arrays.asList(1,5,2,3,7,6,4);
        App.arraySort(list, 4);
        List<Integer> sortedlist = Arrays.asList(1,2,3,0,5,0,7);
        assertEquals(sortedlist, list);

    }
}
