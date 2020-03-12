package com.vinoth.factory;

public class AWSCloud extends Cloud {

	public AWSCloud(CloudVendors cloudVendors) {
		super(cloudVendors);
	}

	@Override
	public Cloud getS3() {
		System.out.println("********** AWSCloud *********");
		return null;
	}

}
