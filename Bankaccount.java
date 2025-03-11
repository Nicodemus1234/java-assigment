Class Bankaccount{
  private double balance;
  Public double get balance();{
    return balance;
  }
  public void double deposit(double amount){
    if (amount>0) balance =balance+amount;
    }
    else {
      System.out.println("error");
    }
    Public void double Withdraw(double amount) {
      if(amount>100 ) balance=balance-amount;
    }
    else {
      System.out.println("no enough money to withraw");
    }
    return balance;