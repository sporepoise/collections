package com.cooksys.ftd.assignments.collections;

import com.cooksys.ftd.assignments.collections.model.Employee;
import com.cooksys.ftd.assignments.collections.model.Manager;
import com.cooksys.ftd.assignments.collections.model.OrgChart;
import com.cooksys.ftd.assignments.collections.model.Worker;

import java.util.*;

public class Main {

    /**
     * TODO [OPTIONAL]: Students may use this main method to manually test their code. They can instantiate Employees
     *  and an OrgChart here and test that the various methods they've implemented work as expected. This class and
     *  method are purely for scratch work, and will not be graded.
     */
    public static void main(String[] args) {
    	
    	
    	List<Manager> test = new LinkedList();
    	
    	
        Manager m1 = new Manager("Chris");
        Manager m2 = new Manager("Tom",m1);
        Manager m3 = new Manager("Steve",m2);
        Manager m4 = new Manager("Jen", m3);
        
        //Jens subordinates
    	Worker w1 = new Worker("bobby",m4);
    	Worker w2 = new Worker("theo",m4);
    	Worker w3 = new Worker("tom",m4);
    	Worker w4 = new Worker("shane",m4);
    	
    	OrgChart oc = new OrgChart();
    	oc.addEmployee(m1);
    	oc.addEmployee(m2);
    	oc.addEmployee(m3);
    	oc.addEmployee(m4);
    	oc.addEmployee(w1);
    	oc.addEmployee(w2);
    	oc.addEmployee(w3);
    	oc.addEmployee(w4);
       
    	Set<Employee> subordinates = oc.getDirectSubordinates(m4);
    	for(Employee e : subordinates) {
    		System.out.println(e.getName());
    	}
    	System.out.println("\n");
    	
        List<Manager> managers = w1.getChainOfCommand();
        
        for(Manager manager:managers) {
        	System.out.println(manager);
        }
        
        
        System.out.println(oc.addEmployee(null));
        //boolean flag = oc.addEmployee(null);
    }

   
    
    
    
}
