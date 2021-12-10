import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class TxMsg {
    public String getMessage(String original) {
        String []data = original.split(" ");
        String []ret = new String[data.length];

        for(int i =0; i < data.length; i++){
            ret[i] = convert(data[i]);

        }
        return String.join(" ",ret);
    }
    public String convert(String d){
        String [] split = d.split("");
        List<String> list = Arrays.asList(split);
        List<String> listn = new ArrayList<String>();
        if(split.length == 1){
            return split[0];
        }
        else if (!list.contains("a") && !list.contains("e") && !list.contains("i") && !list.contains("o")
                && !list.contains("u")){
            return split[0];
        }
        else if (!split[0].equals("a") && !split[0].equals("e") && !split[0].equals("i") && !split[0].equals("o")
                && !split[0].equals("u")){
            listn.add(split[0]);
        }


        for(int i=0; i<split.length-1; i++){
            if (split[i].equals("a") || split[i].equals("e") || split[i].equals("i") || split[i].equals("o")
            ||split[i].equals("u")){
                if (!split[i+1].equals("a") && !split[i+1].equals("e") && !split[i+1].equals("i") && !split[i+1].equals("o")
                        && !split[i+1].equals("u")){
                    listn.add(split[i+1]);
                }
            }
        }
        boolean ok = false;
        for(int j=0; j<split.length; j++){
            if (!split[j].equals("a") && !split[j].equals("e") && !split[j].equals("i") && !split[j].equals("o")
                    && !split[j].equals("u")){
                ok = true;
            }
        }
        if(!ok){
            listn=list;
        }


        String[] itemsArray = new String[listn.size()];
        itemsArray = listn.toArray(itemsArray);
         return String.join("", itemsArray);
    }
}