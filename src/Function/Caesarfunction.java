package Function;

public class Caesarfunction {
    public char[] Mecatar = {'A', 'B', 'C', 'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public char[] Poqratar = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public StringBuilder caesarShift(String str, int amount){
        amount %= 26;
        StringBuilder Newstring = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                
                if(str.charAt(i) == ' '){
                   break;
                }
                else if (str.charAt(i) == Mecatar[j]) {
                    if(j+amount >= 26){                   
                        Newstring.setCharAt(i, Mecatar[j+amount-26]);
                    }
                    else{
                        Newstring.setCharAt(i, Mecatar[j+amount]);
                    }
                    break;
                }
                else if (str.charAt(i) == Poqratar[j]) {
                    if(j+amount >= 26){                   
                        Newstring.setCharAt(i, Poqratar[j+amount-26]);
                    }
                    else{
                        Newstring.setCharAt(i, Poqratar[j+amount]);
                    }
                    break;    
                }
                
            }
        }
        return Newstring;
    }
}
         

