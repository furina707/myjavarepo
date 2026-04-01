//圆的面积和周长计算器
class Circle{
    int radius;
    public Circle(int radius) {
        this.radius=radius;
    }

    void area() {
        System.out.println(Math.PI * radius * radius);
    }

    void peri() {
        System.out.println(2 * Math.PI * radius);
    }
}

public class Circle0{
    public static void main(String[] args){
        Circle c=new Circle(5);
        c.area();
        c.peri();
        
        Circle c1=new Circle(16);
        c1.area();
        c1.peri();
        
    }
}
