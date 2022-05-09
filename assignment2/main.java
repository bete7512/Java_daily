/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assign23;

public class main{
    public static void main(String[] args)
    {
        String cookie = "Almond";
        double weigh=2.0;
        MyCookie cookie1 = new MyCookie();
        MyCookie cookie2 = new MyCookie(cookie);
        MyCookie cookie3 = new MyCookie(cookie,weigh);
        cookie1.print();
        cookie2.print();
        cookie3.print();
    }
}