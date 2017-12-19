/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain;




import static brain.BalanceGetter.Balancer;
import static brain.Sha256KryptoGrafisi.getSha256;
import static brain.TransactionGetter.Transer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.bitcoinj.core.Address;
import org.bitcoinj.core.Base58;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.Sha256Hash;
import org.bitcoinj.params.MainNetParams;

public class PrivateKeyGetter {
     public static String AddressSt;
    
    

    public static String PrivateKeyGetter(String rest) throws IOException {
        NetworkParameters mainNet = MainNetParams.get();
        rest = getSha256(rest);
        BigInteger big = new BigInteger(rest, 16);
        ECKey key = ECKey.fromPrivate(big, false);  // uncompressed
        byte[] priv = key.getPrivKeyBytes();
        byte[] bytes = new byte[1 + 32 + 4];
        bytes[0] = (byte) 0x80;
        System.arraycopy(priv, 0, bytes, 1, 32);
        byte[] checksum = Sha256Hash.hashTwice(bytes, 0, 33);
        System.arraycopy(checksum, 0, bytes, 33, 4);
        String wif3 = Base58.encode(bytes);
        Address s = key.toAddress(mainNet);
        String Stringed = s.toString();
        
       
        return wif3;
    }
      
}
