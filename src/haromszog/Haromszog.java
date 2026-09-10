package haromszog;

public class Haromszog {

    public static void main(String[] args) {
        int oldala=3;
        int oldalb=4;
        int oldalc=5;
        int k = ker(oldalc, oldalb, oldalc);
        double t= ter(oldala, oldalb, oldalc);
        String adat="A %d,%d,%d oldalú háromszög".formatted(oldala,oldalb,oldalc);
        adat+="\tkerülete:%d, területe:%.3f".formatted(k,t);
        
    }
    public static int ker(int a,int b,int c){
        return a+b+c;
    }
    public static double ter(int a, int b,int c){
        int s = (a+b+c)/2;
        double terulet= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return terulet;
    }
    public static void kiir(String szov,double b){
        System.out.println(szov+" ");
        System.out.print(b);
    }
    public static void megjelen(){
    //-Dstout.encoding
    }
    
}
