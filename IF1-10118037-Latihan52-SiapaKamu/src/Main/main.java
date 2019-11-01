/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program menampilkan siapa kamu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Dosen dosen = new Dosen();
          
          dosen.setNip("41227829930");
          dosen.setMataKuliah("PBO");
          dosen.setUmur(29);
          dosen.setNama("Rizki Adam Kurniawan");
          System.out.println("NIP DOSEN : " + dosen.getNip());
          dosen.siapaKamu();
          dosen.mengajarApa();
          
          System.out.println();
          
          Mahasiswa mahasiswa = new Mahasiswa();
          mahasiswa.setNim("10118037");
          mahasiswa.setKelas("IF-1");
          mahasiswa.setNama("Muhammad Ihsan");
          mahasiswa.setUmur(19);
          System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
          mahasiswa.siapaKamu();
          mahasiswa.kelasApa();
    }
    
}
