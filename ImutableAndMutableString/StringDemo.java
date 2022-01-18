package ImutableAndMutableString;

public class StringDemo{
    // The Syntax of String is public static final class String extend object implement serializable,comparable and CharSequence...
    public static void main(String [] args) {
        String Name = "Johan"; // here is immutable string..
        String Name2 = new String(Name); // converting the immutable string to mutable string...
        // Here Immutable String is convert into mutable String....
        System.out.println(Name2);
        System.out.println(Name2.length());
        String Name3 = "Welcome to java Learning";
        char[] latter = {'J','O','H','A','N'};
        // or char[] latter = new char[] {'J','O','H','A','N'};
        char[] latter2 = new char[] {'J','O','H','A','N'};
        System.out.println("Store in array "+latter2); // here Result is Different because array are use for password...
        System.out.println(latter);
        System.out.println(Name3);
        System.out.println(Name3.length());
        StringDemo Str= new StringDemo();
        String Constructor = new String();
        System.out.println("Empty constructor -> '"+Constructor.length()+"' Length");
        byte[] array1={97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123};
       // System.out.println(array); if we direct print it then result will different..
        for (int a=0; a<26; a++){
            String immutable= new String(array1);
        System.out.println(array1+" ");}
    }
}
