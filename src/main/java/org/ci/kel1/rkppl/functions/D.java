/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ci.kel1.rkppl.functions;

import org.ci.kel1.rkppl.interfaces.PowInterfaces;

/**
 *
 * @author jayanudin
 */
public class D implements PowInterfaces{

    public D() {
        System.out.println("Ctor di kelas D");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "toString di kelas D";
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
    
    @Override
    public double pow(double n1, double n2) {
        // TODO Auto-generated method stub
        return java.lang.Math.pow(n1, n2);
    }
}
