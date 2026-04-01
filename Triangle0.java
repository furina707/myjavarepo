//计算三角形的面积和周长
class Triangle{
    int a,b,c;

    public Triangle(int a,int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void area(){
        int p=(a+b+c)/2;
        double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("三角形的面积是"+area);
    }
    void peri(){
        int sum=a+b+c;
        System.out.println("三角形的周长是"+sum);
    }
}


public class Triangle0{
    public static void main(String[] args){
        Triangle t=new Triangle(3,4,5);
        t.area();
        t.peri();
        Triangle t1=new Triangle(10,10,10);
        t1.area();
        t1.peri();
    }
}