import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  url:string;
  employee:Employee;
  employeeArr:Employee[]=[];
  constructor(private http:HttpClient) { 
    this.url="http://localhost:3004/employees/";
    this.employee=new Employee();
  }

  insertEmployee(employee:Employee){
     this.http.post(this.url,employee).subscribe();
     return "Employee details saved Successfully!"
  }
  updateEmployee(employee:Employee){
     this.http.put(this.url+employee.id,employee).subscribe();
     return "Employee details updated Successfully!"
  }
  deleteEmployee(eid:number){
     this.http.delete(this.url+eid).subscribe();
     return "Employee details deleted Successfully!"
  }
  findEmployee(eid:number){

     this.http.get<Employee>(this.url+eid).subscribe(emp=>this.employee=emp);
     return this.employee;
  }
  findAllEmployee(){

     this.http.get<Employee[]>(this.url).subscribe(empArr=>this.employeeArr=empArr);
     return this.employeeArr;
  }
}
