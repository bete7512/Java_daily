
package assignment;
import java.util.regex.*;
import java.util.Scanner;
public class assignment2 {
     public static boolean isEmail(String str)
    {
        boolean get=false;
       Pattern pattern = Pattern.compile( "[a-zA-Z0-9]{5}@[a-zA-Z0-9]{4}[.]com");
       Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
       get = true;
   }
        return get;
    }
    public static boolean isPhone(String str)
    {
        boolean get=false;
        Pattern pattern = Pattern.compile(
    "\\+2519\\d{8}|09\\d{8}");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
       get = true;
   }
        
        
        return get;
    }
    public static boolean isname(String str) {
        boolean get =false;
        get=Character.isUpperCase(str.charAt(0));
        return (get);
         }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean get;
        System.out.println("Enter Your first name");
        String fname = in.next();
        String phone;
        String email;
        get = isname(fname);
        while (get == false)
        {
            
            System.out.println("you Entered the fname niether first letter is in small nor out of letter");
            fname=in.next();
            get = isname(fname);
        }
        System.out.println("Enter your last name");
        String lname = in.next();
        get = isname(lname);
        while (get == false)
        {
          
            System.out.println("you Entered the lname niether first letter is in small nor out of letter");
            lname=in.next();
              get = isname(lname);
        }
        System.out.println("Enter your phone number here");
        phone=in.next();
        get=isPhone(phone);
        while(get==false)
        {
            System.out.println("Enter phone number using this format +2519xxxxxxxx or 09xxxxxxxx");
            phone=in.next();
            get = isPhone(phone);
        }
        System.out.println("Enter your Email here");
        email=in.next();
        get=isEmail(email);
        while (get==false)
        {
            System.out.println("Enter phone number using this format  xxxxx@xxxx.com");
            email=in.next();
            get = isEmail(email);
        }
        System.out.println("Your Fully validated information is printed below");
        System.out.printf("Your Full name is %s %s\n",fname,lname);
        System.out.printf("Your phone number is %s\n",phone);
        System.out.printf("Your Email %s\n",email);
        System.out.println("Well done");
  
              
    }
}
