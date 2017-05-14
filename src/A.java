import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by user on 15.09.2016.
 */
public class A {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(getServerName());
    }
    public static String getServerName(){
        String serverName;
            serverName = "DESKTOP-NSJKBEP.fdf.dfdf";
            if(serverName.contains("."))
                return serverName.substring(0, serverName.indexOf("."));
        return serverName;
    }
}
