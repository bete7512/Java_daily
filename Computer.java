
public class Computer extends Electronic{
    private int cpu;
    private int memory;
   
    public Computer(String brand,double price,int warranty,int cpu,int memory){
         super(brand,price,warranty);
        this.cpu = cpu;
        this.memory = memory;
        
    }
 @Override
    public void print(){
        System.out.printf("Brand: %s; Price: $%.1f; Warranty: %d monthes\n",getBrand(),getPrice(),getWarranty());
         System.out.printf("CPU speed: %dMHZ; Memory size: %dMB\n",cpu,memory);
        
    }
}
