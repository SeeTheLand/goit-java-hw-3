public class ATM {
    public int countBanknotes(int sum) {
        int numberOfBanknotes = 0;
        while (sum > 0) {
            numberOfBanknotes = sum/500;
            sum = sum - sum/500 * 500;
            numberOfBanknotes += sum/200;
            sum = sum - sum/200 * 200;
            numberOfBanknotes += sum/100;
            sum = sum - sum/100 * 100;
            numberOfBanknotes += sum/50;
            sum = sum - sum/50 * 50;
            numberOfBanknotes += sum/20;
            sum = sum - sum/20 * 20;
            numberOfBanknotes += sum/10;
            sum = sum - sum/10 * 10;
            numberOfBanknotes += sum/5;
            sum = sum - sum/5 * 5;
            numberOfBanknotes += sum/2;
            sum = sum - sum/2 * 2;
            numberOfBanknotes += sum;
            sum = 0;
        }

        return numberOfBanknotes;
    }

    public static void main(String[] args) {
        ATM bank = new ATM();
        System.out.println(bank.countBanknotes(1982));
    }
}
