import java.util.HashMap;
    public class BSTcount {
        private HashMap<Integer, Long> mySavedValues = new HashMap<>();

        public long howMany(int[] values) {
            return helpcount(values.length);
        }

        private long helpcount(int size) {
            long ans = 0;

            if(size <= 1){
                return 1;
            }
            if (mySavedValues.containsKey(size)) {
                return mySavedValues.get(size);
            }
            else {
                for (int i = 0; i < size; i++) {
                    ans += helpcount(i) * helpcount (size - i - 1);
                    mySavedValues.put(size, ans);
                }
            }
            return ans;
        }
    }