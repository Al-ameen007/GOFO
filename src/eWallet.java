/**
 * This class is the eWallet that the player and Owner use to Transfer money and check balance
 *
 * @author Mohammad Alameen
 * @version 1.0
 * @since 6 June 2021
 */

public class eWallet {
    private int balance;

    /**
     * default constructor of the eWallet class
     */
    public eWallet() {
        this.balance = 0;
    }

    /**
     * parametrized constructor of the eWallet class
     * @param balance is the balance that will be added
     */
    public eWallet(int balance) {
        this.balance = balance;
    }

    /**
     * @return the balance of the eWallet
     */
    public int checkBalance() {
        return balance;
    }

    /**
     * Assigns the balance of eWallet to balance
     *
     * @param balance is the balance of the eWallet
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * This function amt to the eWallet of the Owner whose ID matches ID
     *
     * @param amt is the amount to be transferred
     * @param ID  is the ID of the owner of the eWallet
     */
    public void transfer(int amt, String ID) {
        Person p = new Person();
        if (amt > this.balance) {
            throw new ArithmeticException("Not enough balance");
        } else {
            if (p.getID().equalsIgnoreCase(ID)) {
                p.getWallet().balance += amt;
                this.balance -= amt;
            } else {
                throw new RuntimeException("Not found");
            }
        }

    }

    /**
     * displays the information of the eWallet
     *
     */
    public String toString() {
        return "eWallet{" +
                "balance=" + balance +
                '}';
    }
}
