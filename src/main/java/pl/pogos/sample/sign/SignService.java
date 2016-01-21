package pl.pogos.sample.sign;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.*;
import java.util.Base64;

/**
 * Created by spogorzelski on 2016-01-20.
 */
@Service
public class SignService {

    public KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");

        keyGen.initialize(256, random);

        return keyGen.generateKeyPair();
    }

    public String getKeyAsString(Key key) {
        return Base64.getEncoder().encodeToString(key.getEncoded());
    }

//    public static void main(String[] args) throws Exception {
//        /*
//         * Generate an ECDSA signature
//         */
//
//        /*
//         * Generate a key pair
//         */
//
//        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
//        SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
//
//        keyGen.initialize(256, random);
//
//        KeyPair pair = keyGen.generateKeyPair();
//        PrivateKey priv = pair.getPrivate();
//        PublicKey pub = pair.getPublic();
//
//        /*
//         * Create a Signature object and initialize it with the private key
//         */
//
//        Signature dsa = Signature.getInstance("SHA1withECDSA");
//
//        dsa.initSign(priv);
//
//        String str = "This is string to sign";
//        byte[] strByte = str.getBytes("UTF-8");
//        dsa.update(strByte);
//
//        /*
//         * Now that all the data to be signed has been read in, generate a
//         * signature for it
//         */
//
//        byte[] realSig = dsa.sign();
//        System.out.println("Signature: " + new BigInteger(1, realSig).toString(16));
//        System.out.println("Signature: " + new BigInteger(1, realSig));
//        System.out.println("Signature: " + realSig);
//
//    }
}