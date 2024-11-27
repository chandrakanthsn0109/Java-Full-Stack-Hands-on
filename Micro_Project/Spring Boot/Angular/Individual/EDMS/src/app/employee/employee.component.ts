import { Component } from '@angular/core';
import { Employee } from '../../model/Employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {
    employee:Employee;
    result:string=""
    employeeArr:Employee[]=[];
    flag:boolean=false;
    constructor(private empService:EmployeeService){
      this.employee=new Employee();
    }
    insertEmployee(data:any){
     this.employee.empId=data.empId;
     this.employee.empName=data.empName;
     this.employee.empSalary=data.empSalary;
     this.employee.dep.depNo=data.depNo;
     this.result=this.empService.insertEmployee(this.employee)
    }
    updateEmployee(data:any){
     this.employee.empId=data.empId;
     this.employee.empName=data.empName;
     this.employee.empSalary=data.empSalary;
     this.employee.dep.depNo=data.depNo;
     this.result=this.empService.updateEmployee(this.employee)
    }
  
    deleteEmployee(data:any){
      this.result=this.empService.deleteEmployee(data.empId)
    }
    findEmployee(data:any){
      let employee:Employee = this.empService.findEmployee(data.empId);
      this.result="Employee Id:"+employee.empId+"    Employee Name:"+employee.empName+"    Employee Salary:"+employee.empSalary+"    Department Number:"+employee.dep.depNo;
    }
    findAllEmployee(){
      this.employeeArr=this.empService.findAllEmployee();
      this.flag=true;
    }
  }
  

