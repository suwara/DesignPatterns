import singleton.BankAccountService;

public class Main {
    public static void main(String[] args) {
        BankAccountService actService = BankAccountService.getInstance();

        actService.createData("Data");
    }
}