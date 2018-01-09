package com.test.rest.RestApiProject;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

public class RestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String methodName="getEmployee";
       System.out.println(methodName);
      //  webTarget.register(Employee.class);
		WebTarget webTarget=getWebTarget(methodName);
		List<Employee> employeeList=  webTarget.request().get(new GenericType<List<Employee>>(){});
     
		for(Employee emp:employeeList){
			System.out.println(emp.getEmpNo()+" "+emp.getEmpName());
		}
      
	}
	
	
	private static WebTarget getWebTarget(String methodName){
		
		Client client=ClientBuilder.newClient();
	        WebTarget webTarget=client.target("http://localhost:8181/RestApiProject/webapi/employee/")
	                      .path(methodName);
	        System.out.println("This is for testing");
	        return webTarget;
	}

}
