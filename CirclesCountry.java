import java.lang.Math;
public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {
        int pdistancex;
        int pdistancey;
        int ndistancex;
        int ndistancey;
        int crossing = 0;
        for(int i = 0; i < x.length; i++){
            pdistancex = Math.abs(r[i])+x[i];
            pdistancey = Math.abs(r[i])+y[i];
            ndistancex = x[i]-Math.abs(r[i]);
            ndistancey = y[i]-Math.abs(r[i]);

            boolean point1 = x1 < pdistancex && x1 > ndistancex && y1 < pdistancey && y1 > ndistancey;
            boolean point2 = x2  < pdistancex && x2  > ndistancex && y2 < pdistancex && y2 > ndistancey;
            if (!(point1 && point2)){
                if(point1){
                    crossing ++;
                }
                if(point2){
                    crossing ++;
                }
            }


        }
        return crossing;
    }
}