package service;

import java.util.ArrayList;
import java.util.List;

//Lista de sites bloqueados - acesso limitado
public class ProxyInternet implements InternetInterface {
    private InternetInterface realInternetService = new RealInternet(); 
    private static List<String> blockedSites = new ArrayList<String>();

    static {
        blockedSites.add("www.twitter.com");
        blockedSites.add("www.instragram.com");
    }
    @Override
    public void connectTo(String serverhost) throws Exception {
        if(blockedSites.contains(serverhost)){
            System.out.println("Acesso negado ao site: " + serverhost);
        }
        else{
            realInternetService.connectTo(serverhost);
        }

    }

}