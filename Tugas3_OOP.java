package tugas3_oop;
import java.util.Scanner;

public class Tugas3_OOP {
static double SuhuAwal;

public static void main(String[] args) {

    String k ="Program Konversi Suhu [y/n]: ";
    Celcius fromCelcius = new Celcius();
    Fahrenheit fromFahrenheit = new Fahrenheit();
    Kelvin fromKelvin = new Kelvin();
    Reamur fromReamur = new Reamur();
    
    double Fahrenheit,Kelvin,Celcius,Reamur;
    boolean valid = false;
    
    Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PROGRAM KONVERSI SUHU SEDERHANA ");
        System.out.println("--------------------------------------------------");
        System.out.print("\n");
        System.out.print(k);
        
    String ans= input.next();
    while(ans.equals("y"))
    {
        System.out.print("\n");
        System.out.println("Pilih Jenis Suhu Saat Ini Untuk di Konversi");
        System.out.println("[1]. Celcius [2]. Fahrenheit [3]. Kelvin [4]. Reamur");
        int suhu = input.nextInt();
        System.out.print("Masukkan nilai suhu awal : ");
        SuhuAwal=input.nextDouble();
        switch(suhu){
            case 1:
                Reamur = fromCelcius.toReamur();
                Fahrenheit = fromCelcius.toFahrenheit();
                Kelvin = fromCelcius.toKelvin();
                
                System.out.println("Suhu awal ="+SuhuAwal+" Celcius\nHasil:");
                System.out.println("Fahrenheit  : "+Fahrenheit);
                System.out.println("Kelvin      : "+Kelvin);
                System.out.println("Reamur      : "+Reamur);
                valid=true;
                break;
            
            case 2:
                Celcius = fromFahrenheit.toCelcius();
                Reamur = fromFahrenheit.toReamur();
                Kelvin = fromFahrenheit.toKelvin();
                
                System.out.println("Suhu awal ="+SuhuAwal+" Fahrenheit\nHasil:");
                System.out.println("Celcius : "+Celcius);
                System.out.println("Kelvin  : "+Kelvin);
                System.out.println("Reamur  : "+Reamur);
                valid=true;
                break;
            
            case 3:
                Celcius = fromKelvin.toCelcius();
                Reamur = fromKelvin.toReamur();
                Fahrenheit = fromKelvin.toFahrenheit();
                
                System.out.println("Suhu awal ="+SuhuAwal+" Kelvin\nHasil:");
                System.out.println("Celcius     : "+Celcius);
                System.out.println("Fahrenheit  : "+Fahrenheit);
                System.out.println("Reamur      : "+Reamur);
                valid=true;
                break;
            
            case 4:
                Celcius = fromReamur.toCelcius();
                Fahrenheit = fromReamur.toFahrenheit();
                Kelvin = fromReamur.toKelvin();
                
                System.out.println("Suhu awal ="+SuhuAwal+" Reamur\nHasil:");
                System.out.println("Celcius     : "+Celcius);
                System.out.println("Fahrenheit  : "+Fahrenheit);
                System.out.println("Kelvin      : "+Kelvin);
                valid=true;
                break;
            
            default :
                System.out.println("Pilih Jenis Suhu Secara Benar!!!");
                break;
        }
        
        System.out.print("\n");
        System.out.print("Ingin Lanjut? "+k);
        ans = input.next();
    
    } if(ans.equals("n")){
    System.out.println("\n***Program Selesai***");
    
}
}
}