import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Encryption {
    public String encrypt(String message){
        char [] cipher = new char [123];
        Arrays.fill(cipher, '*');
        String ret = "";
        char p = 'a';

        for(char a: message.toCharArray()){
            if (cipher[a] != '*') {
                ret += cipher[a];
            }
            else {
                cipher[a] = p;
                p++;
                ret += cipher[a];
            }
        }
        return ret;
    }
}