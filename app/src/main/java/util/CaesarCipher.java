/**
 *  CaesarCipher App/using intent to change activity and call the CaesarCipher class to implement encrypted and decrypted.
 *  @author Jinhong Fan (fan00036@algonquinlive.com)
 */

package util;

import com.fan00036algonquincollege.caesarcipher.Constants;
import static com.fan00036algonquincollege.caesarcipher.Constants.DEBUG;
import static com.fan00036algonquincollege.caesarcipher.Constants.ABOUT_DIALOG_TAG;
import static com.fan00036algonquincollege.caesarcipher.Constants.LOG_TAG;
import static com.fan00036algonquincollege.caesarcipher.Constants.ROT13;
import static com.fan00036algonquincollege.caesarcipher.Constants.ROTATION_MAX;
import static com.fan00036algonquincollege.caesarcipher.Constants.ROTATIONS;
import static com.fan00036algonquincollege.caesarcipher.Constants.THE_MESSAGE;
import static com.fan00036algonquincollege.caesarcipher.Constants.THE_ROTATION;
/**
 * Created by helen on 2015-11-05.
 */
public class CaesarCipher {

    private  static final int MAX_ROTATION;
    static {
        MAX_ROTATION = ROTATIONS.length();
    }

    private CaesarCipher(){

    }
    public static int getRotate(char key)
    {
        return key;
    }

    static  String decrypt(String encryptedMessage){
        return  decrypt(encryptedMessage,ROT13);
    }

    public static String decrypt( String encryptedMessage, int rotation){
        char[] letters = encryptedMessage.toCharArray();
        int i=0;
        for(char aLetter:letters){
            letters[i]=decrypt(aLetter, rotation);
            i++;
        }
        return String.valueOf(letters);
    }

    static String encrypt(String plainMessage){
        return encrypt(plainMessage,ROT13);
    }

    public static String encrypt(String plainMessage, int rotation){
        char[] letters = plainMessage.toCharArray();
        int i=0;
        for(char aLetter:letters){
            letters[i]=encrypt(aLetter,rotation);
            i++;
        }
        return String.valueOf(letters);
    }
    private static char encrypt(char aLetter, int rotation)
    {
        char encryptedLetter;
        int encryptedLetterASCII;
        char key=(Character.isUpperCase(aLetter))?'A':'a';
        encryptedLetterASCII =(Character.isLetter(aLetter))?(((int) aLetter + key + rotation) % 26) + (int) key:aLetter;
        encryptedLetter=(char) encryptedLetterASCII;
        return encryptedLetter;
    }
    private static char decrypt(char aLetter, int rotation)
    {
        char decryptedLetter;
        int decryptedLetterASCII;
        char key=(Character.isUpperCase(aLetter))?'A':'a';
        decryptedLetterASCII =(Character.isLetter(aLetter))?( ((int) aLetter + key + MAX_ROTATION-rotation) % 26) + (int) key:aLetter;
        decryptedLetter=(char) decryptedLetterASCII;
        return decryptedLetter;
    }
//    private static int encrypt(char aLetter, int rotation)
//    {
//        int encryptedLetterASCII;
//        encryptedLetterASCII = ( ((int) aLetter - 'A' + rotation) % 26) + (int) 'A';
//        return encryptedLetterASCII;
//    }
}
