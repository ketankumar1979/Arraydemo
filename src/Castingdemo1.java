public class Castingdemo1 {
    public static void main (String[]args){
        double d = 150.99; // variable to variable conversion
        int i = (int) d;
        //System.out.println(i);

        int a= 1255;
        byte b = (byte) a; // down casting
        //System.out.println(b);

        byte c = 125;
        int e = (int) c;
       // System.out.println(e);

        Integer obj = new Integer(400); // object to variable conversion
        int k = obj.intValue();
        //System.out.println(k);

        String s = "400";                     // variable to object conversion
        int obj1 = Integer.valueOf(s);
        System.out.println(obj1);             // all are explicit casting.




    }
}
