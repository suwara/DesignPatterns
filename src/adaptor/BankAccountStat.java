package adaptor;

public class BankAccountStat {
    private BankServiceAdaptor service;
    public void processData(){
        String data = "data";
        service.saveData(data);
    }
}
