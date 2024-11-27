import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
   providedIn: 'root'
})
export class EmployeeService {
   url: string;
   employee: Employee;
   employeeArr: Employee[] = [];
   constructor(private http: HttpClient) {
      this.url = "http://localhost:1212/";
      this.employee = new Employee();
   }

   insertEmployee(employee: Employee) {
      this.http.post(this.url + "create-employee", employee).subscribe();
      return "Employee details saved Successfully!"
   }
   updateEmployee(employee: Employee) {
      this.http.put(this.url + "update-employee", employee).subscribe();
      return "Employee details updated Successfully!"
   }
   deleteEmployee(eid: number) {
      this.http.delete(this.url + "delete-employee/" + eid).subscribe();
      return "Employee details deleted Successfully!"
   }
   findEmployee(eid: number) {
      this.http.get<Employee>(this.url + "read-employee/" + eid).subscribe(emp => this.employee = emp);
      return this.employee;
   }
   findAllEmployee() {
      this.http.get<Employee[]>(this.url + "readAll-employee").subscribe(empArr => this.employeeArr = empArr);
      return this.employeeArr;
   }
   findEmployeeByName(ename: String) {
      this.http.get<Employee[]>(this.url + "find-employee-name/" + ename).subscribe(empArr => this.employeeArr = empArr);
      return this.employeeArr;
   }
   deleteEmployeeByName(ename: String) {
      this.http.delete(this.url + "delete-employee-name/" + ename).subscribe();
      return "Employee details deleted Successfully!"
   }
   findEmployeeBySalary(esalary: number) {
      this.http.get<Employee[]>(this.url + "find-employee-salary/" + esalary).subscribe(empArr => this.employeeArr = empArr);
      return this.employeeArr;
   }
   deleteEmployeeBySalary(esalary: number) {
      this.http.delete(this.url + "delete-employee-salary/" + esalary).subscribe();
      return "Employee details deleted Successfully!"
   }
}
