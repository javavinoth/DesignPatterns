package com.vinoth.builder;

/**
 * 
 * @author Vinoth TO create a immutable object
 */
public abstract class PaymentResponseReciever {

	private String producer;
	private String consumer;
	private float transactionAmount;
	private TransactionStates transactionStatus;
	private String currency;
	private String remarks;

	public PaymentResponseReciever(String producer, String consumer, float transactionAmount,
			TransactionStates transactionStatus) {
		this.producer = producer;
		this.consumer = consumer;
		this.transactionAmount = transactionAmount;
		this.transactionStatus = transactionStatus;
	}

	public PaymentResponseReciever(String producer, String consumer, float transactionAmount,
			TransactionStates transactionStatus, String currency, String remarks) {
		this.producer = producer;
		this.consumer = consumer;
		this.transactionAmount = transactionAmount;
		this.transactionStatus = transactionStatus;
		this.currency = currency;
		this.remarks = remarks;
	}

	
	public PaymentResponseReciever(String producer, String consumer, float transactionAmount) {
		this.producer = producer;
		this.consumer = consumer;
		this.transactionAmount = transactionAmount;
	}

	public PaymentResponseReciever getPaymentResponseReciever()
	{
		return this;
	}
	public PaymentResponseReciever() {

	}

	public String getCurrency() {
		return currency;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getProducer() {
		return producer;
	}

	public String getConsumer() {
		return consumer;
	}

	public float getTransactionAmount() {
		return transactionAmount;
	}

	public TransactionStates getTransactionStatus() {
		return transactionStatus;
	}

}
