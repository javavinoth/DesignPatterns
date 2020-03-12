package com.vinoth.builder;

public class PaymentResponseBuilder extends PaymentResponseReciever{
	
	private String producer;
	private String consumer;
	private float transactionAmount;
	private TransactionStates transactionStatus;
	private String currency;
	private String remarks;

	public PaymentResponseReciever build()
	{
//		super(this.producer, this.consumer, this.transactionAmount, this.transactionStatus, this.currency, this.remarks);
		return getPaymentResponseReciever();
	}
	
	
	
	public PaymentResponseBuilder(String producer, String consumer, float transactionAmount) {
		super(producer, consumer, transactionAmount);
		this.producer = producer;
		this.consumer = consumer;
		this.transactionAmount = transactionAmount;
	}



	public PaymentResponseBuilder() {
		super();
	}

	public PaymentResponseBuilder(String producer, String consumer, float transactionAmount,
			TransactionStates transactionStatus, String currency, String remarks) {
		super(producer, consumer, transactionAmount, transactionStatus, currency, remarks);
		this.producer = producer;
		this.consumer = consumer;
		this.transactionAmount = transactionAmount;
		this.transactionStatus = transactionStatus;
		this.currency = currency;
		this.remarks = remarks;
	}

	public PaymentResponseBuilder(String producer, String consumer, float transactionAmount,
			TransactionStates transactionStatus) {
		super(producer, consumer, transactionAmount, transactionStatus);
		this.producer = producer;
		this.consumer = consumer;
		this.transactionAmount = transactionAmount;
		this.transactionStatus = transactionStatus;
	}

	
	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public TransactionStates getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStates transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

	
}
