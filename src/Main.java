public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //קבוצה א - הגשה

        Number n = 3.3;
        //המרות
        byte b = n.byteValue();
        float v = n.floatValue();
        short i1 = n.shortValue();
          n.intValue();


        Integer i=9;
        System.out.println(i.compareTo(n.intValue()));

        Double d= 5.6;
        System.out.println(d.toString());
        Float.compare(3456f,5555f);



        //תרגיל
       //ממשי המרה - השתמשי ב- 3 סוגי המרות
        //השתמשי בפונקציה COMPARE TO כדי לבדוק האם INT מסויים שווה ל-FLOAT
        //המירי מספר מסוג DOUBLE ל- STRING
    }
}