package com.vinoth.builder;

public class Main {

	public static void main(String[] args) {
		PaymentResponseReciever paymentResponse = new PaymentResponseBuilder("vinoth","kumar",100.0f,TransactionStates.SUCESS,"INR","Savings").build();
		
		System.out.println(paymentResponse.getProducer());
	}

}
