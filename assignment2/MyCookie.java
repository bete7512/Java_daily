
package assign23;


public class MyCookie {
    private String type;
    private double weight;
    public MyCookie(){
        this.type="chocolate";
        this.weight=2.0;
    }
    public MyCookie(String type){
        this.type=type;
        this.weight=2.0;
    }
    public MyCookie(String type, double weight){
        this.type=type;
        this.weight=weight;
    }
    public void print(){
        System.out.println("This cookie is "+this.type+" cookie and weighs "+this.weight+"g.");
    }
}


