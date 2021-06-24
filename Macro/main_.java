package Macro;

public class main_ {
    public static void main(String args[]){
        CSV_lib csv = new CSV_lib("test", null);
        
        int x =0;
        while (x < 100){
            System.out.println(csv.countDouble(x, 0.0));
            x = x + 1;
        }
        csv.close();

    }

}
