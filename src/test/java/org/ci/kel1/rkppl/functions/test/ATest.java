/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ci.kel1.rkppl.functions.test;

import static junit.framework.Assert.assertSame;
import org.ci.kel1.rkppl.functions.A;

/**
 *
 * @author Stare
 */
public class ATest {
    private A a;

    public ATest() {
        a = new A();
    }

    public void addTest() {
        a.add(3, 2);
        assertSame("Seharusnya 5 : ", 5, a.add(3, 2));
    }

    public void subTest() {
        a.sub(8, 7);
        assertSame("Seharusnya 1 : ", 1, a.sub(8, 7));
    }

   
}
