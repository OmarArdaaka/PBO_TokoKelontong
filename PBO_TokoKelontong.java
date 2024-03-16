/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_tokokelontong;

/**
 *
 * @author SMK TELKOM 023
 */
public class PBO_TokoKelontong {

    public static void main(String[] args) {
        Barang barang = new Barang();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
        laporan laporan = new laporan();
        
        laporan.laporan(barang);
        laporan.laporan(member);        
        transaksi.prosesTransaksi(member, transaksi, barang);       
        laporan.laporan(transaksi, barang);
       
    }
}
