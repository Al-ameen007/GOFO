public class eWallet {
    private float balance;

    public eWallet(){
        this.balance = 0;
    }

    public eWallet(int balance){
        this.balance = balance;
    }

    /**
     * @return the balance of the eWallet
     */
    public double checkBalance() {
        return balance;
    }

    /** Assigns the balance of eWallet to balance
     * @param balance is the balance of the eWallet
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

/*
    public void transfer(int amt, int ID){
        Person p = new Person();
        if (amt > this.balance){
            throw new ArithmeticException("Not enough balance");
        }else{
            if(p.getID() == ID){
                p.getWallet().balance += amt;
                this.balance -= amt;
            }else{
                throw new RuntimeException("Not found");
            }
        }

    }
*/
    /** displays the information of the eWallet
     * @Override
     */
    public String toString() {
        return "eWallet{" +
                "balance=" + balance +
                '}';
    }
}
