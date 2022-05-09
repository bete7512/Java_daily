
public class Electronic {
    private String brand;
    private double price;
    private int warranty;
    public Electronic(String brand,double price,int warranty){
        this.brand=brand;
        this.price = price;
        this.warranty = warranty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getWarranty() {
        return warranty;
    }  
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    
    public void print(){
        System.out.printf("Brand: %s; Price: $%.1f; Warranty: %d monthes\n",this.brand,this.price,this.warranty);
       //System.out.printf("Brand: %s; Price: $%f; Warranty: %d monthes\n",getBrand(),getPrice(),getWarranty());
    }
}
