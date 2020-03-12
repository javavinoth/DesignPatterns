package com.vinoth.factory;

public class GCPCloud extends Cloud{

	public GCPCloud(CloudVendors cloudVendors) {
		super(cloudVendors);
	}

	@Override
	public Cloud getS3() {
		System.out.println("********** GCPCloud **********");
		return null;
	}

}
