package DP.StrategyPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {

		String paymentMethod = "BOLETO"; // "CREDIT_CARD" , "BOLETO" , "PIX"
		PaymentMethod.valueOf(paymentMethod).pay(3.0);
	}

}

class PaymentMethods {
	public static void creditCard(double amount){
		System.out.println("Validing credit card...");
		System.out.println("Paid R$ " + amount + " with credit card.");
	}

	public static void boleto(double amount){
		System.out.println("Generating barcode ... ");
		System.out.println("Paid R$ " + amount + " with credit card.");
	}

	public static void pix(double amount){
		System.out.println("Generating QR code...");
		System.out.println("Paid R$ " + amount + " with credit card.");
	}

}

enum PaymentMethod{
	CREDIT_CARD(PaymentMethods::creditCard), BOLETO(PaymentMethods::boleto),
	PIX (PaymentMethods::pix);
	private Consumer<Double> paymentStrategy;
	// consumer = funcao que aceita um valor por ser uma amount e retornar void
	PaymentMethod(Consumer<Double> paymentStrategy){
		this.paymentStrategy = paymentStrategy;
	}
	public void pay(Double amount){
		paymentStrategy.accept(amount);
	}
}



