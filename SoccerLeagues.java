public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] point = new int [matches.length];
        int m = 0;

        for(String a: matches){
            int count = 0;
            char [] ind = a.toCharArray();
            for(char b: ind){
                if(b == 'W'){
                    count += 3;
                }
                else if(b =='D'){
                    count += 1;
                }
            }
            point[m] = count;
            m++;
        }
        return point;
    }
}