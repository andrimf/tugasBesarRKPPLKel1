package org.ci.kel1.rkppl.functions.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.ci.kel1.rkppl.functions.C;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Subhan Gustiar Rosada (113040260)
 */
public class CTest {
    C c;
    public CTest() {
       this.c = new C();
    }
    
    @Test
    public void modTest1(){
        Assert.assertEquals("Harusnya Benar",0, c.mod(4, 2));
    }

    @Test
    public void modTest2(){
        Assert.assertNotEquals("Harusnya Salah",0, c.mod(3, 2));
    }

    @Test
    public void sqrtTest1(){
        Assert.assertEquals("Harusnya Benar", 4, (int)c.sqrt(16));
    }
    
    @Test
    public void sqrtTest2(){
        Assert.assertNotEquals("Harusnya Salah",3, (int)c.sqrt(25));
    }
}
