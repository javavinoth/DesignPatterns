package com.vinoth.factory;

public class CloudFactory {

	public static Cloud getCloudInstance(CloudVendors vendors) {
		Cloud cloud = null;
		switch (vendors) {
		case AWS:
			cloud = new AWSCloud(vendors);
			break;
		case GOOGLE_CLOUD_PLATFORM:
			cloud = new GCPCloud(vendors);
			break;
		default:
			break;
		}

		return cloud;

	}
}
