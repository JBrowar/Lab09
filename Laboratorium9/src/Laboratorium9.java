public class Laboratorium9 {
    public static void main(String [] args){
        Customer klient = new Customer();
        klient.name = "Jan Nowak";
        klient.address = " ul.Słoneczników, Warszawa,";
        Account money = new Account();
        money.cashBalance = 1000000.0;
        Stock akcje = new Stock();
        akcje.ticker= "PGE'";
        akcje.quantity= 10;
        
        System.out.println(klient.name + klient.address+ " Ma na koncie:" + money.cashBalance + " Ma w portfelu akcje: " + akcje.ticker +" w ilości (szt): "+ akcje.quantity);
        
        
        
        
   
    }
}
