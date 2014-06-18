/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ci.kel1.rkppl.functions;

/**
 *
 * @author Subhan Gustiar Rosada (113040260)
 */

public class C extends Math{
    
    A a = new A();
    B b = new B();

    private double n1;
    private double n2;
    
    public C() {
        System.out.println("Ctor di kelas C");
    }

    /**
     * @return the n1
     */
    public double getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(double n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public double getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public void add(){
        a.add((int)getN1(),(int)getN2());
    }

    public void sub(){
        a.sub((int)getN1(),(int)getN2());
    }

    public void mul(){
        b.mul(getN1(),getN2());
    }

    public void div(){
        b.div(getN1(),getN2());
    }

    @Override
    public String toString() {
       return "toString di kelas C";
    }
}
