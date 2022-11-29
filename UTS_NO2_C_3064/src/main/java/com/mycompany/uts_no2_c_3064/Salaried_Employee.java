/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3064;

/**
 *
 * @author YUNITA
 */
public class Salaried_Employee extends Employess {
    
int upahMingguan, gaji;
    
    public Salaried_Employee(String nama, int nip, int upahMingguan){
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }
    
    public int hitungGaji(){
        gaji = upahMingguan;
        return gaji;
    }
    
    public void cetakSalariedEmployee(){
        super.cetakEmployee();
        System.out.println("Upah Mingguan      : " + hitungGaji());
    }
    
}
