package haromszog;

import java.nio.file.Files;
import java.nio.file.Path;

public class Haromszog {

    public static void main(String[] args) {
        int oldala=3;
        int oldalb=4;
        int oldalc=5;
        
        if(!pozszam(oldalc, oldalb, oldalc)){
            throw new IllegalArgumentException("hibas");
        }
        
        int k = ker(oldalc, oldalb, oldalc);
        double t= ter(oldala, oldalb, oldalc);
        String adat="A %d,%d,%d oldalú háromszög".formatted(oldala,oldalb,oldalc);
        adat+="\tkerülete:%d, területe:%.3f".formatted(k,t);
        megjelen(adat);
        
    }
    public static int ker(int a,int b,int c){
        return a+b+c;
    }
    public static double ter(int a, int b,int c){
        int s = (a+b+c)/2;
        double terulet= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return terulet;
    }
    public static double ter(double mag, int oldal){
        double s = mag*oldal/2;
        return s;
    }
    public static void kiir(String szov,double b){
        System.out.println(szov+" ");
        System.out.print(b);
    }
    public static void megjelen(String adat){
        try {
            Files.write(Path.of("kimenet.txt"), adat.getBytes());
        } catch (Exception ex) {
            System.err.println("nem sikerült a fileba íras");
            System.err.println("hiba oka"+ex.getMessage());
        }
    }
    static boolean pozszam(int a, int b, int c){
        return a>0&&b>0&&c>0;
    }
    static boolean pozegyszam(double szam){
        return szam>0;
    }
    static boolean letezo(int a, int b, int c){
        return a+b>c||a+c>b||c+b>a;
    }
    
}
