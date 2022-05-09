package question2;
public class Box {
    private int length;
    private int width;
    private int height;
//    public Box(int length,int width,int height)
//    {
//        this.length=length;
//        this.height=height;
//        this.width=width;
//    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int volume()
    {
        return length * width * height;
    }
    public int sArea(){
        return 2*length*width + 2*width*height + 2*length*height;
    }
    public void display(){
       int volume=volume();
       
        System.out.printf("The length of the box is %d,\nThe height of the box is %d,\nThe width of box %d,\n",length,height,width);
        System.out.printf("The Volume of the box is %d, \n", volume); 
        System.out.printf("Thw surface area of the box is %d \n",sArea());
        System.out.println("");  
    }
}
