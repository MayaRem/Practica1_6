/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individual1;

/**
 *
 * @author Z-V
 */
public class Telephone {
    private String mark;
    private int number;

    public Telephone(String mark, int number) {
        this.mark = mark;
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString(){
        return "Telephone = { Telmark = " + mark +
                " Telnumber = " + number + "}";
    }
}
