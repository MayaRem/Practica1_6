/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individual1;

/**
 *
 * @author Z-V
 */
public class Seller {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void modify (Telephone telephone){
        if (telephone != null){
            String marks = telephone.getMark();
            marks = marks.replace('O', 'A');
            marks = marks.replace('o', 'a');
            if (!(marks.startsWith("n"))&&!(marks.startsWith("N"))){
                marks = marks.toLowerCase();
            }
            telephone.setMark(marks);
        }
    }
    
}
