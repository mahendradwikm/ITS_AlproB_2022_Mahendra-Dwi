import java.util.Scanner;

import javax.swing.InputMap;
public class JavaLibs5026211102 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Halo ges, Aku mahen, namamu sapa nih?");
        String nama = input.nextLine();

        System.out.println("Halo "+nama+" salam kenal yaaaa");
        
        System.out.println("OH iya, kuliah dimana nich?");
        String kuliah = input.nextLine();

        if (kuliah.equalsIgnoreCase("ITS")){
            System.out.println("MaNTap Sama nichhh");
        } else {
            System.out.println("ais jauhnya kuliahmu");    
        }

        System.out.println("Angkatan berapa emangnya? (misal 2021 atau 2019");
        String angkatan = input.nextLine();

        if (angkatan.equalsIgnoreCase("2021")){
            System.out.println("wahhh sama lagi nichhh, jangan jangan.....");
        } 
        else {
            System.out.println("yahhh sayang banget kita beda tahun");    
        }

        System.out.println("kepo lagi nih, kelahiran tahun berapa sih kamu?");
        int lahir = input.nextInt();
        int umur = 2022-lahir;

        System.out.println("Kutebak, umur kamu pasti "+umur+" tahun kannnnn");
        
        System.out.println("NEXT, banyak tanya emang :(");

        System.out.println("Tinggi badanmu berapa dah? (dalam meter yaaa)");
        double tinggi = input.nextDouble();

        System.out.println("11 12 lah ya sama akuuu, btw aku 1.68 meter");

        System.out.println("Trus kalo berat badanmu berapa? (dalam kilogram yaawww)");
        double berat = input.nextDouble();

        System.out.println("kalo misal berat badan dan tinggi badan mu dikalikan hasilnya berapa ya????");
        double kali = tinggi*berat;

        System.out.println("Ketik kepo untuk melanjutkan");
        String kepo = input.next();

        System.out.println("Ternyata totalnya jadi "+kali+" lhooooo");
        System.out.println("Aku pengen kenal kamu lebih dalam deh");

        input.nextLine();
        System.out.println("Sampe lupa nanya kamu cewe apa cowo");
        String kelamin = input.nextLine();

        if (kelamin.equalsIgnoreCase("cowo")){
            System.out.println("umm skip dlu");
        } 
        else {
            System.out.println("hai syantik");    
        }

        System.out.println("Sekarang HOBI deh hobi, apa nih hobimu");
        String hoby = input.nextLine();

        System.out.println("Kalo makanan favoritmu?");
        String makanan = input.nextLine();

        System.out.println("Karena keadaan masih kea gini gini mulu banyakin deh makan terutama makan "+makanan+"");
        System.out.println("biar imun mu kuat, selain itu lakuin deh tu hobi mu yang suka "+hoby+" biar hatimu senang selalu");
        System.out.println("dan yang pasti jangan sampe skip minum air putih yaaaa, OK SEE YAAAA");

    }
}
