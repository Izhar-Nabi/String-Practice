package MethodPractice;

public class Cases {
    public static void main(String []args){
        String Latter1="aba";
        String latter2="abc";
        String message = "Welcome to Java".substring(0,11) + "HTML"; // return the string's substring that begins at the specified.subString(indexStart,indexEnd)..
        String concatenation= Latter1+latter2;
        System.out.println(Latter1.compareTo(latter2));
        System.out.println(concatenation);
        System.out.println(Latter1 + latter2.substring(3));
        System.out.println(Latter1 + latter2.substring(1,3));
        System.out.println(message);    // Here if  Begin index is Greater than end index then program show the Error.
        System.out.println(Latter1.replace('a','A')); // String replace the latter old to new latter....
        System.out.println(latter2.trim());// Here Blank will Remove from the both side....
        System.out.println(Latter1.replaceFirst("A","a")); // Here all the String will Replace with New String if String Will Match..
        System.out.println(Latter1.replaceAll("aba","Any Name")); // Here Replace all Replace Matching String to Any New String...
        String []Token = "Java#HTML#Print".split("#",0);
        for (String s : Token) // Here We Used enhanced for loop for Better Approach...
        {
            System.out.print(s + " ");
        }
        System.out.println("\n"+Latter1.matches("aba"));
        String []Token2= "Welcome#to$Java".split("[.,:;?]");
        for (String ss : Token2)
        System.out.println(ss);
    }
}
