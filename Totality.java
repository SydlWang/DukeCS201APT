public class Totality {
    public int sum(int[] a, String stype) {
        int total = 0;
        for(int i = 0; i < a.length; i++) {
            if(stype.equals("all")){
                total+= a[i];
            }
            else if (stype.equals("even")){
                total+= a[i];
                i += 1;
            }
            else if (stype.equals("odd")){
                if(i==0){
                    i=1;
                }
                total+= a[i];
                i+=1;
            }
        }
        return total;
    }
}
