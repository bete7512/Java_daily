
public class Electronicmain 
{
    public static void main(String[] args)
    {
        Cellphone phone = new Cellphone("Nokia TS200;",300,18,3.5,true);
       // Cellphone phone1 = new Cellphone("Samsung TS200;",300,18,3.5,true);
        Computer computer = new Computer("Dell D2100;",1000,24,1500,512);
        Laptop laptop = new Laptop("HP NS170;",1500,24,900,256,15);
       Electronic[] array ={phone,computer,laptop};
       for(Electronic displayer : array)
       {
           displayer.print();
       }
    }
}
