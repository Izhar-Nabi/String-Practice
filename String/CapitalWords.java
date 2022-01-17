package String;
import java.util.Scanner;

public class CapitalWords {
    public static void main(String []args){
        System.out.println("Write the String To Capital it");
        Scanner GivenData = new Scanner(System.in);
        String Data = GivenData.nextLine();
        Data.toUpperCase();
        String data=Data.toUpperCase();
        if (data==Data.toUpperCase()){
            System.out.println("Yes All Worlds are Capital");
            System.out.println(Data.toUpperCase());
        }
        else{
            System.out.println("Sorry String isn't in Capital!!!");
        }
        String str=new String("Hello");
        String str2=new String("Hello");
        String str3="Hello";
        String  str4="Hello";
        System.out.println(str==str2); // here result is false because here is reference comparison or address comparison...because in heap area memory address are different
        System.out.println(str3==str4); // Here String result is true because of address is same.
    }
}
