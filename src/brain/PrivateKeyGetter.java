
package brain;



import static brain.Sha256KryptoGrafisi.getSha256;
import java.io.IOException;
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
