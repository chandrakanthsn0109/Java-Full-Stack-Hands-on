import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee:Employee;
  result:string=""
  employeeArr:Employee[]=[];
  flag:boolean=false;
  constructor(private empService:EmployeeService){
    this.employee=new Employee();
  }
  insertEmployee(data:any){
   this.employee.id=data.id;
   this.employee.empName=data.empName;
   this.employee.empSalary=data.empSalary;

   this.result=this.empService.insertEmployee(this.employee)
  }
  updateEmployee(data:any){
   this.employee.id=data.id;
   this.employee.empName=data.empName;
   this.employee.empSalary=data.empSalary;

   this.result=this.empService.updateEmployee(this.employee)
  }

  deleteEmployee(data:any){
    this.result=this.empService.deleteEmployee(data.id)
  }
  findEmployee(data:any){
    let employee:Employee= this.empService.findEmployee(data.id);
    this.result="Employee Id: "+employee.id+"Employee Name: "+employee.empName+"Employee Salary: "+employee.empSalary
  }
  findAllEmployee(){
    this.employeeArr=this.empService.findAllEmployee();
    this.flag=true;
  }
}
