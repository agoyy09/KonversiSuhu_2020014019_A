/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.praktikum.KonversiSuhu;

/**
 *
 * @author asus
 */
public class ProsesKonversiSuhu {
    public double getCF(double c){ 
        
        double f = (c*9/5)+32; //
        
        return f; 
    }
    
    public double getRF(double r){ 
        
        double f = (r*9/4)+32; //
        
        return f; 
    }
    
    public double getCR(double c){ 
        
        double r = c/1.25; //
        
        return r; 
    }
    
    public double getKF(double k){ 
        
        double f = (k-273.15)*9/5+32; //
        
        return f; 
    }
    public String tampilsemuakonversi(){ 
        double cf = getCF(8);
        double rf = getRF(8);
        double cr = getCR(8);
        double kf = getKF(8);
        
        double tampilkancf = cf;
        String tampilcf = Double.toString(tampilkancf);
        double tampilkanrf = rf;
        String tampilrf = Double.toString(tampilkanrf);
        double tampilkancr = cr;
        String tampilcr = Double.toString(tampilkancr);
        double tampilkankf = kf;
        String tampilkf = Double.toString(tampilkankf);
        
        String tampil;
        tampil = "Hasil konversi dari Celcius ke Fahrenheit = "+ tampilcf + "<br>"
                + "Hasil konversi dari Reamur ke Fahrenheit = " + tampilrf + "<br>"
                + "Hasil konversi dari Celcius ke Reamur = " + tampilcr + "<br>"
                + "Hasil konversi dari Kelvin ke Fahrenheit = " + tampilkf;
        return tampil;
    }

    
}
