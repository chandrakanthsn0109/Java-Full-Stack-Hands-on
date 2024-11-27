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
   this.employee.empId=data.empId;
   this.employee.empName=data.empName;
   this.employee.empSalary=data.empSalary;

   this.result=this.empService.insertEmployee(this.employee)
  }
  updateEmployee(data:any){
   this.employee.empId=data.empId;
   this.employee.empName=data.empName;
   this.employee.empSalary=data.empSalary;

   this.result=this.empService.updateEmployee(this.employee)
  }

  deleteEmployee(data:any){
    this.result=this.empService.deleteEmployee(data.empId)
  }
  findEmployee(data:any){
    let employee:Employee= this.empService.findEmployee(data.empId);
    this.result="Employee Id:"+employee.empId+"    Employee Name:"+employee.empName+"    Employee Salary:"+employee.empSalary;
  }
  findAllEmployee(){
    this.employeeArr=this.empService.findAllEmployee();
    this.flag=true;
  }

  findEmployeeByName(data:any){
    this.employeeArr= this.empService.findEmployeeByName(data.empName);
    this.flag=true;
  }
  deleteEmployeeByName(data:any){
    this.result=this.empService.deleteEmployeeByName(data.empName);
  }
  findEmployeeBySalary(data:any){
    this.employeeArr= this.empService.findEmployeeBySalary(data.empSalary);
    this.flag=true;
  }
  deleteEmployeeBySalary(data:any){
    this.result=this.empService.deleteEmployeeBySalary(data.empSalary);
  }
}
