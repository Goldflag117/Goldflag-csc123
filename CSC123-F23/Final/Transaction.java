class Transaction {
   private static int transactionIdCounter = 1;
   private int transactionId;
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
       this.transactionId = transactionIdCounter++;
       this.type = type;
       this.amount = amount;
    }

    public String toString() {
        return transactionId + " : " + type + " : " + amount;
   }

    public double getAmount() {
        return amount;
    }
}

