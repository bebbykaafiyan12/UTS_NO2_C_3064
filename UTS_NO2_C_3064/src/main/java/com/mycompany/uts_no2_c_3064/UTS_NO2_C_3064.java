/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3064;

/**
 *
 * @author YUNITA
 */
public class UTS_NO2_C_3064 {

   public static void main(String[] args) {

        Salaried_Employee S = new Salaried_Employee("Bebby", 21103064, 3000000);
        Commission_Employee C = new Commission_Employee("Taqiyya", 21103064, 3500000, 1000000, 20);
        Project_Planner P = new Project_Planner("Syamsa", 2130223, 4000000, 2000000, 120);
        
        System.out.println("== DATA PEGAWAI PERUSAHAAN ==");
        S.cetakSalariedEmployee();
        System.out.println("");
        C.cetakCommision_Employee();
        System.out.println("");
        P.cetakProjectPlanner();
        System.out.println("");
        
    }
}