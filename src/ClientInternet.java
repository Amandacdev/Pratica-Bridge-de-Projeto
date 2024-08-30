import service.ProxyInternet;
import service.InternetInterface;

public class ClientInternet {
    public static void main (String[] args)
    {
        InternetInterface internet = new ProxyInternet();
    try
    {
        internet.connectTo("www.ifpb.edu.br");
        internet.connectTo("www.youtube.com");
        internet.connectTo("www.twitter.com");
        internet.connectTo("www.instragram.com");
    }
    catch (Exception e)
    {
        System.out.println(e.getMessage());
    }
    }
} 