import { Component } from '@angular/core';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-tdf',
  templateUrl: './tdf.component.html',
  styleUrl: './tdf.component.css'
})
export class TdfComponent {
  emp:Employee;
  flag:boolean;
  constructor(){
    this.emp=new Employee();
    this.flag=false;
  }

  onClickSubmit(data:any){
       this.emp.eid=data.eid;
       this.emp.ename=data.ename;
       this.emp.esalary=data.esalary;
       this.flag=true;
  }

}
