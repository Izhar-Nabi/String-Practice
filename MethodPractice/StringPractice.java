package MethodPractice;

public class StringPractice {
    public static void main(String []args){
        String Name ="";
        String Email="AnyName88@Gmail.com";
        String ContactNo="0310XXXXXXX";
        System.out.println(Name.length()); // it show the value is the form of integer....
        System.out.println(Name.isEmpty()); // it gives the Result in Boolean Form Boolean.
        if(Name.length()==0){
            System.out.println("Please Fill The Name First");
        }
        else if(Name.length()!=0){
            System.out.println("Valid Name");
        }
        if (Name.isEmpty()==true) {
        System.out.println("Please Fill The Name First ");
        }
        else{
            System.out.println("valid Name...");
        }
        if(Email.length()==0){
            System.out.println("Please Fill The Email");
        }
        else if(Email.length()!=0){
            System.out.println("Valid E-Mail");
        }
        if (Email.isEmpty()==true) {
            System.out.println("Please Fill The Email ");
        }
        else{
            System.out.println("valid E-Mail...");
        }
        if(ContactNo.length()==0){
            System.out.println("Please Fill The Contact Number");
        }
        else if(ContactNo.length()!=0){
            System.out.println("Valid Contact Number");
        }
        if (ContactNo.isEmpty()==true) {
            System.out.println("Please Fill The Contact Number ");
        }
        else{
            System.out.println("valid Phione Number...");
        }
    }
}
