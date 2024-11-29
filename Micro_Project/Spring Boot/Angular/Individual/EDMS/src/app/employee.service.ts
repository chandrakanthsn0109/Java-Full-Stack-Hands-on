import { Injectable } from '@angular/core';
import { Employee } from '../model/Employee';
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
    this.http.get<Employee>(this.url + "find-employee/" + eid).subscribe(emp => this.employee = emp);
    // console.log(this.employee);
    return this.employee;
  }
  findAllEmployee() {
    this.http.get<Employee[]>(this.url + "findAll-employee").subscribe(empArr => this.employeeArr = empArr);
    return this.employeeArr;
  }

}
