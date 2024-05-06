package Add;

public class Add {

    public double add1(double a, double b) {
        return a + b;
    }

    public double add2(double a, double b) {
        return a * b;
    }

    public double add3(double a, double b) {
        if(a > b)
            return a + b;
        else
            return 0;
    }

    public double add4(double a, double b) {
        if(a < b)
            return a + b;
        else
            return 0;
    }
}
