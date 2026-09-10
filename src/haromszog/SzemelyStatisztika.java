
package haromszog;

import java.util.Random;

public class SzemelyStatisztika {
    static Random rnd;
    public static void main(String[] args) {
        String nev="jani";
        int szulev=2004;
        if(!korell(eletkor(szulev))){
            throw new IllegalArgumentException("hibas");
        }
        if(!nevell(nev)){
            throw new IllegalArgumentException("hibas");
        }
        bemut(eletkor(szulev), nev);
    }
    //túlterhelés köszönéssel
    static String kosz(String nev){
        return "hali"+nev;
    }
    static String kosz(String nev,int kor){
        return "hali"+nev+" milyen érzés "+kor+" évesnek lenni?";
    }
    static String kosz(int kor){
        return "hali, bocs tudom hogy "+kor+" éves vagy de nem tudom a neved";
    }
    static int eletkor(int ev){
        return 2026-ev;
    }
    static int nyugi(int szam){
        return 65-szam;
    }
    static String bemut(int kor,String nev){
        return "Szepnapot %s, látom maga %d -éves".formatted(nev,kor);
    }
    static boolean korell(int kor){
    return kor>0&&kor<110;
    }
    static boolean nevell(String nevf){
       return nevf.length()>2&& !nevf.contains("#");
    }
    static void tanarpelda(String nev,boolean keveres){
        String[]koszonesek={"hali","hallo","szia"};
        if(keveres){
        int i =(int)(Math.random()*koszonesek.length);
            System.out.println("i = "+i);
        }else{
            System.out.println("szia "+nev+"!");
        }
        
    }
    static void rndkosz(String nev, int kor){
        int r=rnd.nextInt(3);
        if(r>0){
            kosz(nev,kor);
        }else if(r==2){
            kosz(kor);
        }else{
            kosz(nev);
        }
    }
}
