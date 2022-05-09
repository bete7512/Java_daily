
public class Laptop extends Computer
{
    private double displaySize;
    public Laptop(String brand,double price,int warranty,int cpu,int memory,double displaySize){
       super(brand,price,warranty,cpu,memory);
        this.displaySize = displaySize;
    }
 @Override
    public void
         print(){
        System.out.printf("Brand: %s; Price: $%.1f; Warranty: %d monthes\n",getBrand(),getPrice(),getWarranty());
        System.out.printf("Display Size: %.1f\n", displaySize);
    }
}
