/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.praktikum.KonversiSuhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
public class ProjectController {
    ProsesKonversiSuhu hitung = new ProsesKonversiSuhu(); //Memanggil kelas logicalProces di file logicalProcess.java
    
    @RequestMapping("/konversictof") //Link
    @ResponseBody
    public String tampilctof(){ //Method untuk konversi suhu
        
        double f = hitung.getCF(80); //Masukkan nominal C
        
        String view = "Hasil konversi 80 C ke F = " + f + "F."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
        
    @RequestMapping("/konversirtof") //Link
    @ResponseBody
    public String tampilrtof(){ //Method untuk konversi mata uang
        
        double f = hitung.getRF(80); //Masukkan nominal R
        
        String view = "Hasil konversi 80 R ke F = " + f + "F."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
    
    @RequestMapping("/konversictor") //Link
    @ResponseBody
    public String tampilctor(){ //Method untuk konversi mata uang
        
        double r = hitung.getCR(80); //Masukkan nominal C
        
        String view = "Hasil konversi 80 C ke R = " + r + "R."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
    
    @RequestMapping("/konversiktof") //Link
    @ResponseBody
    public String tampilktof(){ //Method untuk konversi mata uang
        
        double k = hitung.getKF(80); //Masukkan nominal C
        
        String view = "Hasil konversi 80 K ke F = " + k + "F."; //Membuat kalimat
        
        return view; //Menampilkan hasil konversi
    }
    @RequestMapping("/konversisemuasuhu") //Link
    @ResponseBody
    public String konversisemuakurs(){ //Method untuk konversi mata uang
        String tampilkan;
        tampilkan = hitung.tampilsemuakonversi();
        
        return tampilkan;
    }
    
    
}
