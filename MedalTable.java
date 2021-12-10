import java.util.*;

public class MedalTable {
    private class MedalCountry {
        String myName;
        int myGold;
        int mySilver;
        int myBronze;
        MedalCountry(String name){
            myName = name;
        }
        public int getGold () {
            return myGold;
        }
        public int addGold () {
            myGold += 1;
            return myGold;
        }
        public int addSilver () {
            mySilver += 1;
            return mySilver;
        }
        public int addBronze () {
            myBronze += 1;
            return myBronze;
        }
        public int getSilver () {
            return mySilver;
        }
        public int getBronze () {
            return myBronze;
        }
        public String getName(){
            return myName;
        }
        @Override
        public String toString() {
            return String.format("%s %d %d %d",
                    myName,myGold,mySilver,myBronze);
        }
    }

    public String[] generate(String[] results) {

        ArrayList<String> store = new ArrayList<>();
        store.addAll(Arrays.asList(results));

        HashMap<String, MedalCountry> map = new HashMap<>();
        for (String a: results){
            String[] words = a.split(" ");
            for (String b :words) {
                if (!map.containsKey(b)) {
                    map.put(b, new MedalCountry(b));
                    if(words[0] == b){
                        map.get(b).addGold();
                    }
                    else if(words[1] == b){
                        map.get(b).addSilver();
                    }
                    else {
                        map.get(b).addBronze();
                    }
                }
                else {
                    if(words[0] == b){
                        map.get(b).addGold();
                    }
                    else if(words[1] == b){
                        map.get(b).addSilver();
                    }
                    else {
                        map.get(b).addBronze();
                    }
                }
            }
        }
        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        Comparator<MedalCountry> gold = Comparator.comparing(MedalCountry::getGold).reversed();
        Comparator<MedalCountry> silver = Comparator.comparing(MedalCountry::getSilver).reversed();
        Comparator<MedalCountry> bronze = Comparator.comparing(MedalCountry::getBronze).reversed();
        Comparator<MedalCountry> name = Comparator.comparing(MedalCountry::getName);
        Comparator<MedalCountry> comp = gold.thenComparing(silver).thenComparing(bronze).thenComparing(name);

        Collections.sort(list,comp);

        String[] ret = new String[list.size()];
        int count = 0;
        for (MedalCountry g: list){
            ret[count] = g.toString();
            count++;
        }
        return ret;
    }
}