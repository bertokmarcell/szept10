
package haromszog;

public class SzemelyStatisztika {
    public static void main(String[] args) {
        String nev="jani";
        int szulev=2004;
        if(!korell(eletkor(szulev))){
            throw new IllegalArgumentException("hibas");
        }
        if(!nevell(nev)){
            throw new IllegalArgumentException("hibas");
        }
    }
    
    static String kosz(String nev){
        return "hali"+nev;
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
}
