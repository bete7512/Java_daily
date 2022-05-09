
public class Cellphone extends Electronic
{
    
    private double batteryLife;
    private boolean webEnabled;
    public Cellphone(String brand,double price,int warranty,double batteryLife,boolean webEnabled){
      super(brand,price,warranty);
       this.webEnabled=webEnabled;
       this.batteryLife=batteryLife;
    }
  @Override
    public void print()
    {
        System.out.printf("Brand: %s; Price: $%.1f; Warranty: %d monthes\n",getBrand(),getPrice(),getWarranty());      
        System.out.printf("Battery life: %.1f; Web enabled %b\n",this.batteryLife,this.webEnabled);
   
        
    }
    
}
