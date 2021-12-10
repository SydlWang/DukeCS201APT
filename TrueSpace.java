import java.lang.Math;
public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        int [] m = new int[sizes.length];
        double k = clusterSize;
        for (int i = 0; i < sizes.length; i++){
            int b = (int)Math.ceil(sizes[i]/k);
            m[i]=b;
        }
        long total = 0;
        for (int d: m){
            total+=d;
        }

        return total * clusterSize;
    }
}