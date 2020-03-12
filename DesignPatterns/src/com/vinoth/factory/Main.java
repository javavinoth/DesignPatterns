package com.vinoth.factory;

public class Main {

	public static void main(String[] args) {
		Cloud aws = CloudFactory.getCloudInstance(CloudVendors.AWS);
		aws.getS3();
	}

}
