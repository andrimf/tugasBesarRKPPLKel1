/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ci.kel1.rkppl.test;

import static junit.framework.Assert.assertSame;
import org.ci.kel1.rkppl.functions.B;

/**
 *
 * @author Stare
 */
public class BTest {
    private B b;

    public BTest() {
        b = new B();
    }

    public void addTest() {
        b.mul(3, 3);
        assertSame("Seharusnya 9 : ", 9, b.mul(3, 3));
    }

    public void subTest() {
        b.div(8, 4);
        assertSame("Seharusnya 2 : ", 2, b.div(8, 4));
    }
}
