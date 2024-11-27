import { Injectable } from '@angular/core';
import { Department } from '../model/Department';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DepartmentService {

  url: string;
  department: Department;
  departmentArr: Department[] = [];
  constructor(private http: HttpClient) {
    this.url = "http://localhost:1212/";
    this.department = new Department();
  }

  insertDepartment(department: Department) {
    this.http.post(this.url + "create-department", department).subscribe();
    return "Department details saved Successfully!"
  }
  updateDepartment(department: Department) {
    this.http.put(this.url + "update-department", department).subscribe();
    return "Department details updated Successfully!"
  }
  deleteDepartment(eid: number) {
    this.http.delete(this.url + "delete-department/" + eid).subscribe();
    return "Department details deleted Successfully!"
  }
  findDepartment(eid: number) {
    this.http.get<Department>(this.url + "read-department/" + eid).subscribe(dep => this.department = dep);
    return this.department;
  }
  findAllDepartment() {
    this.http.get<Department[]>(this.url + "readAll-department").subscribe(depArr => this.departmentArr = depArr);
    return this.departmentArr;
  }

}
