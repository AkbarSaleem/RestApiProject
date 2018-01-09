package com.test.rest.RestApiProject;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("employee")
public class EmployeeController {
	
	static   List<Employee> employeeList=new ArrayList<Employee>();
	  static{
		for(int i=1;i<10;i++){
			Employee emp=new Employee();
			emp.setEmpNo(i);
			emp.setEmpName("empName"+i);
			employeeList.add(emp);
		}
	  }
		
	
	
	@GET
	@Path("/getEmployee")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployeeList(){
		
		/*Employee emp=new Employee();
		emp.setEmpName("Employee Name");
		emp.setEmpNo(10);*/
		return employeeList;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("id") int id){
		
		/*Employee emp=new Employee();
		emp.setEmpName("Employee Name");
		emp.setEmpNo(10);*/
		return employeeList.get(id);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteEmployee(@PathParam("id") int id){
		
		/*Employee emp=new Employee();
		emp.setEmpName("Employee Name");
		emp.setEmpNo(10);*/
		 employeeList.remove(id);
		 
	//	 return "Success";
	}

}
