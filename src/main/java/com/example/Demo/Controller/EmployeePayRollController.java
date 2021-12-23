package com.example.Demo.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.DTO.EmployeePayrollDTO;



@RestController
@RequestMapping("/Employee")

public class EmployeePayRollController {
	
	/**
	 * Adding Employee with Employee Id and Employee Name
	 * @param empPayrollDTO 
	 * @return : Employee Id and Employee Name
	 */
	@PostMapping("/Add")
	public ResponseEntity<String> getEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
		return new ResponseEntity<String>("Created Employee Payroll Data for: "+ empPayrollDTO, HttpStatus.OK);
	}
	
	/**
	 * Finding Employee With Employee Id
	 * @param empId
	 * @return : Employee Id
	 */
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get Call Success for Id: "+ empId, HttpStatus.OK);
	}
	
	
	/**
	 * Editing Employee Name 
	 * @param empPayrollDTO
	 * @return : Updated Employee Details
	 */
	@PutMapping("/Edit")
	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO){
		return new ResponseEntity<String>("Updated Employee Payroll Data for: "+ empPayrollDTO, HttpStatus.OK);
	}
	
	/**
	 * Deleteing Employee with Employee Id
	 * @param empId
	 * @return : Message With Deleted Employee ID
	 */
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Delete call success for id: "+ empId, HttpStatus.OK);
	}
}