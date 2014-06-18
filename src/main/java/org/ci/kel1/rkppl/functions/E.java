/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ci.kel1.rkppl.functions;

import java.util.List;

/**
 *
 * @author Subhan Gustiar Rosada (113040260)
 */
public class E {
    private List<String> dataList;

    public E(){
        System.out.println("Ctor di kelas E");
    }

    public boolean contains(String n){
        boolean status = false;
        int i = 0;
        while(i < getDataList().size()){
            if(n.equalsIgnoreCase(getDataList().get(i))){
                status = true;
                break;
            }
            i++;
        }
        return status;
    }

    /**
     * @return the dataList
     */
    public List<String> getDataList() {
        return dataList;
    }

    /**
     * @param dataList the dataList to set
     */
    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }
    
    
    @Override
    public String toString(){
        return "toString di kelas E";
    }
}
