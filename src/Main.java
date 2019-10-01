import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RSA Alice = new RSA();
        RSA Bob = new RSA();

        String poslaniye = "Idi kod' na Prolog'e, blet!";
        System.out.println("Боб взял ОК Алисы: " + Arrays.toString(Alice.getOK()));
        System.out.println("Теперь он шифрует сообщение.");
        System.out.println();

        BigInteger[] Crypted = Bob.encrypt(Alice.getOK(), poslaniye);
        StringBuilder Kek = new StringBuilder();

        for (BigInteger a : Crypted) {
            Kek.append(a);
        }
        String EncryptedMessage = Kek.toString();
        System.out.println("Боб говорит: " + EncryptedMessage);

        System.out.println();

        System.out.println("Теперь Алиса расшифровывает эту дичь:");

        String Decryption = Alice.decrypt(Crypted);

        System.out.println("Алиса прочитала послание: " + Decryption);

    }
}
