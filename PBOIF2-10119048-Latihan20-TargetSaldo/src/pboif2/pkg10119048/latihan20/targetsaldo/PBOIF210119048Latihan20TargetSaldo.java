/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan20.targetsaldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author SystemOs
 */
public class PBOIF210119048Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scanner = new Scanner(System.in);

        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        int i = 1;
        float bunga;
        double saldoAwal,saldoTarget,saldo;

        System.out.print("Saldo Awal\t : RP. ");
        saldoAwal = scanner.nextDouble();

        System.out.print("Bunga/Bulan(%)\t :");
        bunga = scanner.nextFloat();

        System.out.print("Saldo Target\t : RP. ");
        saldoTarget = scanner.nextDouble();

        bunga = (float) (bunga/100);

        while(i < saldoTarget){
            saldo = (saldoAwal * 0.08) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldo));
            saldoAwal = saldo;
            if (saldoAwal >= saldoTarget) {
                break;
            }i++;
        }
         System.out.println("==========================================");
         System.out.println("Developed by : Mochammad Faishal");
    }    
}