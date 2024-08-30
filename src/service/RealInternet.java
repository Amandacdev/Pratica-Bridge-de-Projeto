package service;

public class RealInternet implements InternetInterface{
    
    public void connectTo(String serverhost) throws Exception
    {
        System.out.println("Conectando a "+ serverhost + " ... OK");
    }
   }
   