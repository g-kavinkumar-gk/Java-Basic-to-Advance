// basics of working environment of java[JDK >> JRE >> JVM]
// identifiers(name) , variable
// class and object
// datatypes


import java.util.*;

public class Inp{
    public static void main(String a[]){
        Scanner scanObj= new Scanner(System.in);
        System.out.print("Enter Details Below:\nName:");
        String name = scanObj.nextLine();
        System.out.print("Reg_No:");
        int Reg_No =scanObj.nextInt();
        System.out.print("Department:");
        String dep = scanObj.next();
        System.out.print("\n__________________________\nThe given details are :\nName    : "+ name+"\nReg_no : "+Reg_No+"\nDepartment :"+dep);
        scanObj.close();
    }    
}
