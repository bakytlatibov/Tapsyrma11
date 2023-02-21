public class Uch_burch {
    private Double a;
    private Double b;
    private Double c;

    public Uch_burch(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void area(){

        double d=(a+b+c)/2;
        double area=d*((d-a)*(d-b)*(d-c));
        System.out.println(area);
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
