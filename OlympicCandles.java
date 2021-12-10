import java.util.*;

public class OlympicCandles{
    public int numberOfNights(int[] candles){
        ArrayList<Integer> candle = new ArrayList<>();
        for(int a: candles){
            candle.add(a);
        }
        Collections.sort(candle, Collections.reverseOrder());
        int night = 1;
        while(true){
            for(int i = 0; i < night; i++){
                candle.set(i, candle.get(i)-1);
            }
            Collections.sort(candle, Collections.reverseOrder());
            if ((night == candle.size()) || (candle.get(night) == 0)) {
                return night;
            }
            night += 1;
        }
    }
}