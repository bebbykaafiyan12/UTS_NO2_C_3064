/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3064;

/**
 *
 * @author YUNITA
 */
public class Employess {
    
protected int nip, gaji;
    protected String nama;
    
    public Employess(String nama, int nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public int hitungGaji(){
        return gaji;
    }
    
    public void cetakEmployee(){
        System.out.println("Nama               : " + nama);
        System.out.println("NIP                : " + nip);
    }
    
}
