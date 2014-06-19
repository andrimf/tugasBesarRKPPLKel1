/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ci.kel1.rkppl.functions;

import org.ci.kel1.rkppl.interfaces.AddAndSubInterface;

/**
 *
 * @author Andri Muhammad Ferdian (113040163)
 */

public class A implements AddAndSubInterface {

    public A() {
        System.out.println("Ctor di kelas A");
    }

    @Override
    public String toString() {
        return "toString di kelas A";
    }

    @Override
    public int add(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1 - n2;
    }
}
