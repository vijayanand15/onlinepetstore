package com.cloud.dbservice.clientsample;

import com.cloud.dbservice.*;

public class ClientSample {

	public static void main(String[] args) {
		String cc=  DBServiceClient.getInstance();
		System.out.println(cc);
		cc= DBServiceClient.getInstance();
		
		System.out.println(cc);
	}
}
