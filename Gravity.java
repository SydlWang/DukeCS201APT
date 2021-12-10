public class Gravity {
    public double falling(double time, double velo){
        double d;
        double a = 9.8;
        d = velo*time+0.5*a*time*time;
        return d;
    }
}
