
package haromszog;

import java.util.Random;

public class SzemelyStatisztika {
    
    public static void main(String[] args) {
        //String nev="jani";
        //int szulev=2004;
        Személy newborn = new Személy(40, "cfffjjfcjcghgjjgvkjhkhhkhkj");
        if(!korell(eletkor(newborn.getKor()))){
            throw new IllegalArgumentException("hibas");
        }
        if(!nevell(newborn.getNev())){
            throw new IllegalArgumentException("hibas");
        }
        bemut(eletkor(newborn.getKor()), newborn.getNev());
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
    static void tanarpelda(String nev){
        tanarpelda(nev, false);
    }
    static void tanarpelda(String nev,boolean keveres){
        String[]koszonesek={"hoi","hali","hallo","szia"};
        int i =0;
        if(keveres){
        i =(int)(Math.random()*koszonesek.length);
            System.out.println(koszonesek[i]);
        }
        System.out.println(koszonesek[i]);
        
    }
    // személy, statisztika
    //személy- név kor(priv) const, gett sett,
    //stat- kosz, nyugi, eletkor
    
}
