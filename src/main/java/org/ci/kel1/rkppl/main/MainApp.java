/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ci.kel1.rkppl.main;

import java.util.ArrayList;
import java.util.List;
import org.ci.kel1.rkppl.functions.C;
import org.ci.kel1.rkppl.functions.D;
import org.ci.kel1.rkppl.functions.E;

/**
 *
 * @author Guskar (113040245)
 */
public class MainApp {

    public static void main(String[] arr) {
        C c = new C();
        D d = new D();
        E e = new E();

        c.setN1(4);
        c.setN2(2);

        c.add();
        c.sub();
        c.mul();
        c.div();
        System.out.println(c.sqrt(16));
        System.out.println(c.mod(4, 2));

        System.out.println(d.div(4, 2));
        System.out.println(d.mul(4, 2));
        System.out.println(d.pow(4, 3));

        List list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String str = "String" + i;
            list.add(str);
        }
        e.setDataList(list);
        System.out.println(e.contains("String5"));
    }

}
