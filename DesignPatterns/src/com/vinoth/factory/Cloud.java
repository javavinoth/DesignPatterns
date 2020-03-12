package com.vinoth.factory;

public abstract class Cloud {

	public CloudVendors cloudVendors;

	public Cloud(CloudVendors cloudVendors) {
		this.cloudVendors = cloudVendors;
		initialize();
	}

	private void initialize() {

	}
	
	public  abstract Cloud getS3();

	public CloudVendors getCloudVendors() {
		return cloudVendors;
	}

	public void setCloudVendors(CloudVendors cloudVendors) {
		this.cloudVendors = cloudVendors;
	}

}
