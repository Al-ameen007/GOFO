public class eWallet {
    private float balance;

    public eWallet(){
        this.balance = 0;
    }

    public eWallet(int balnce){
        this.balance = balnce;
    }

    /**
     * @return the balnce of the eWallet
     */
    public double getBalance() {
        return balance;
    }

    /** Assigns the balance of eWallet to balance
     * @param balance is the balance of the eWallet
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }


    public void transfer(int amt, int ID){
        Person p = new Person();
        if(p.getID() == ID){
            p.getWallet().balance += amt;
        }
    }

    /** displays the information of the eWallet
     * @Override
     */
    public String toString() {
        return "eWallet{" +
                "balance=" + balance +
                '}';
    }
}
