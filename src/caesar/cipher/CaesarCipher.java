package caesar.cipher;
import Function.Caesarfunction;


public class CaesarCipher {

    public static void main(String[] args) {
      Caesarfunction a = new Caesarfunction();
      System.out.println(a.caesarShift("Hello World", 21));
    }
}
