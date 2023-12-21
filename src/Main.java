import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        InetAddress google = null;
        try{
            google = InetAddress.getByName("www.google.com");
        } catch (UnknownHostException e){
            System.out.println("error "+e);
        }
        System.out.println("ip-address: "+google);
    }
}