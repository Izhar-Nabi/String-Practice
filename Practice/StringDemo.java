package Practice;

public class StringDemo {
    public static void main(String args[]){
        char []ch={'J', 'A', 'V', 'A',' ', 'T', ' ', 'P', 'O', 'I' ,'N', 'T'};
        String newString= new String(ch);   // literal mean Sequence of Character.... and here the sequence in the form of Arrays...
        System.out.println(ch);

        String java="java";
        java="New Java";
        System.out.println(java); // here is immutable String.....


        String s1= "Welcome To Java";           // here all variables or String object having same Content.....
        String s2 = new String("Welcome To Java");
        String s3 ="Welcome To Java";
        System.out.println("s1==s2 \n"+ (s1==s2)); // Here is s1 and s2 String object is different....
        System.out.println("s1==s3 \n"+ (s1==s3)); //Here is s1 and s3 String object is same..... and here two equal sign Work as Compare of Two String...

    }
}
