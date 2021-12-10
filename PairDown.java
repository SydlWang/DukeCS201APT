public class PairDown {
    public int[] fold(int[] list) {
        int[] ret = new int[list.length/2 + list.length % 2];
        int count = 0;
        for(int k=0; k < list.length; k += 2){
            if(k != list.length - 1) {
                ret[count] = list[k] + list[k + 1];
            }
            count ++;
        }
        if(list.length%2 != 0) {
            ret[ret.length -1] = list[list.length -1];
        }
        return ret;
    }
}