/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ci.kel1.rkppl.functions.test;

import java.util.ArrayList;
import java.util.List;
import org.ci.kel1.rkppl.functions.E;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Subhan Gustiar Rosada (113040260)
 */
public class ETest {
    
    E e;
    public ETest() {
        this.e = new E();
        List dataList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            dataList.add("String"+i);
        }
        e.setDataList(dataList);
    }
   
    @Test
    public void containsTest1(){
        assertTrue(e.contains("String1"));
    }
    
    @Test
    public void containsTest2(){
        assertFalse(e.contains("String10"));
    }
}
