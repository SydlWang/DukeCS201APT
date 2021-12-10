public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int max = 1;
        String ret ="";
        for (String s: strands){
            int nc = total(s,nuc);
            if(nc > max || nc == max && s.length() > ret.length()){
                max = nc;
                ret = s;
            }
        }
        return ret;
    }
    public int total(String s, String b){
        int t = 0;
        char [] a = s.toCharArray();
        for(int i = 0; i < a.length; i++){
            if(a[i]== b.charAt(0)){
                t++;
            }
        }
        return t;
    }
}
