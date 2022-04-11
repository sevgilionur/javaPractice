package day36_PracticeTask.cryptoTokenTask;

public class CryptoToken {

    public double price, quantity, volume, circulatingSupply;
    public int marketCap;
    public boolean isMineAble;

    public CryptoToken(double price, double quantity, double volume, double circulatingSupply, int marketCap, boolean isMineAble) {
        this.price = price;
        this.quantity = quantity;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.marketCap = marketCap;
        this.isMineAble = isMineAble;
    }

    public double totalPrice(){
        return price * quantity;
    }

    public String toString() {
        return "CryptoToken{" +
                "price= $" + price +
                ", quantity=" + quantity +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", marketCap=" + marketCap +
                ", isMineAble=" + isMineAble +
                ", total Price of the tokens= " + totalPrice() +
                '}';
    }
}
/*
    CryptoToken Task
1. create a class called CryptoToken
        variables:
        price, quantity, marketCap, volume,
        circulatingSupply, isMineable (boolean)
        methods:
        setInfo()
        toString()
        totalPrice(): returns the total price
        of the crypto token ( price * quantity)

        2. create 5 sub classes of CryptoToken:
        Bitcoin
        Ethereum
        Cardano
        XRP
        Doge

        3. create a class named MyWallet
        create one object of each CryptoToken
        calculate the total Asset

 */