package passwordmanagementia;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest; //provides functionality for SHA-1 algorithm
import java.util.Arrays; //create and access arrays
import java.util.Base64; //retrieves encoders and decoders for Base64
import javax.crypto.Cipher; //cryptographic cipher for encryption and decryption
import javax.crypto.spec.SecretKeySpec; //allows for creation of secretKey

public class aes {
    private static SecretKeySpec secretKey;
    private static byte[] key;
    public static void setKey(String myKey){
        MessageDigest sha = null;   
        try{
            key = myKey.getBytes("UTF-8");
            //UCS Transformation Format 8
            //represent all standard Unicode characters with 1-4 one byte units
            sha = MessageDigest.getInstance("SHA-1");//Secure Hash Algorithm 1
            key = sha.digest(key); //use own key
            key = Arrays.copyOf(key, 16); //uses only first 128 bit
            secretKey = new SecretKeySpec(key, "AES"); //creates key
        } catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
    
    public static String encrypt(String strToEncrypt, String secret){
        try{
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            //instantiate cipher object: AES cipher, ECB mode of operation, PKCS5 padding scheme
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
            //cipher.doFinal() returns to state before initialization with UTF-8
            //base64 encodes binary strings utilizing 64 characters
        } catch(Exception e){
            System.out.println("Error while encrypting: "+ e.toString());
        }
        return null;
    }
    
    public static String decrypt(String strToDecrypt, String secret){
        try{
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch(Exception e){
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}
