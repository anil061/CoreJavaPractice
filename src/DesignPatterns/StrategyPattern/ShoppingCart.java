package DesignPatterns.StrategyPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
         this.paymentStrategy = paymentStrategy;
    }
    public void check(double amount){
        paymentStrategy.processPayment(amount);
    }
}
