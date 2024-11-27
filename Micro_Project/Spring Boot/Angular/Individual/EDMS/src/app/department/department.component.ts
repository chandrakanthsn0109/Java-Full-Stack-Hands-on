import { Component } from '@angular/core';
import { Department } from '../../model/Department';
import { DepartmentService } from '../department.service';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrl: './department.component.css'
})
export class DepartmentComponent {
  department:Department;
  result:string=""
  departmentArr:Department[]=[];
  flag:boolean=false;
  constructor(private depService:DepartmentService){
    this.department=new Department();
  }
  insertDepartment(data:any){
   this.department.depNo=data.depNo;
   this.department.depName=data.depName;
   this.result=this.depService.insertDepartment(this.department);
  }
  updateDepartment(data:any){
   this.department.depNo=data.depNo;
   this.department.depName=data.depName;
   this.result=this.depService.updateDepartment(this.department);
  }

  deleteDepartment(data:any){
    this.result=this.depService.deleteDepartment(data.depNo);
  }
  findDepartment(data:any){
    let department:Department= this.depService.findDepartment(data.depNo);
    this.result="Department Number:"+department.depNo+"    Department Name:"+department.depName;
  }
  findAllDepartment(){
    this.departmentArr=this.depService.findAllDepartment();
    this.flag=true;
  }
}
