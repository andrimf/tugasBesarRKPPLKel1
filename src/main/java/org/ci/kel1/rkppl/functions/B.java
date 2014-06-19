/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ci.kel1.rkppl.functions;

import org.ci.kel1.rkppl.interfaces.MulAndDivInterface;

/**
 *
 * @author Andri Muhammad Ferdian (113040163)
 */

public class B implements MulAndDivInterface {

    public B() {
        System.out.println("Ctor di kelas B");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "toString di kelas B";
    }

    @Override
    public double mul(double n1, double n2) {
        // TODO Auto-generated method stub
        return n1 * n2;
    }

    @Override
    public double div(double n1, double n2) {
        // TODO Auto-generated method stub
        if (n2 != 0) {
            return n1 / n2;
        } else {
            return 0;
        }
    }
}
