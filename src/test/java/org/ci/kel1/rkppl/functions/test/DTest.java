/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ci.kel1.rkppl.functions.test;

import static junit.framework.Assert.assertSame;
import org.ci.kel1.rkppl.functions.D;

/**
 *
 * @author Jayanudin (113040030)
 */
public class DTest {

    private D d;

    public DTest() {
        d = new D();
    }

    public void mulTest() {
        d.mul(2, 2);
        assertSame("Seharusnya 4 : ", 4, d.mul(2, 2));
    }

    public void divTest() {
        d.div(4, 2);
        assertSame("Seharusnya 2 : ", 2, d.div(4, 2));
    }

    public void powTest() {
        d.pow(2, 3);
        assertSame("Seharusnya 8 : ", 8, d.pow(2, 3));
    }

}
