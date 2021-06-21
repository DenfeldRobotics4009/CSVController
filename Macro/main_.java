package Macro;

public class main_ {
    public static void main(String args[]){
        CSV_lib csv = new CSV_lib("test", null);
        
        int x =0;
        while (x < 100){
            try{
                System.out.println(csv.countDouble(x));
            }catch(Error e){e.printStackTrace();}
            x = x + 1;
        }
        csv.close();

    }

}
