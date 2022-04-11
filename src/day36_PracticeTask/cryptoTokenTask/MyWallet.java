package day36_PracticeTask.cryptoTokenTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin =new Bitcoin(40000,2,1000000,19000000,1,true);
        Ethereum ethereum = new Ethereum(3000,10,800000,120328,2,true);
        Cardano cardano = new Cardano(1,1000,200000,2000000,5,false);
        XRP xrp = new XRP(1.2,250,300000,50000000,7,false);
        Doge doge = new Doge(0.001, 500000,180000,10000000,35,false);

        ArrayList<CryptoToken> wallets = new ArrayList<>();
        wallets.addAll(Arrays.asList(bitcoin,ethereum,cardano,xrp,doge));

        double totalAsset= 0;

        for (CryptoToken each : wallets) {
            totalAsset += each.totalPrice();
        }

        System.out.println("Total Asset= $" + totalAsset);







    }
}
