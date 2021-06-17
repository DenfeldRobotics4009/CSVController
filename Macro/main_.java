package Macro;

public class main_ {
    public static void main(String args[]){
        writeCSV csv = new writeCSV("testcsv", null);
        Object[] objA = {"0",1.0111,"abc"};
        csv.writeSet(objA);

        csv.close();
    }

}
