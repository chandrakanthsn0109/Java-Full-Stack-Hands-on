import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Employee } from '../model/employee';

@Component({
  selector: 'app-reactiveform',
  templateUrl: './reactiveform.component.html',
  styleUrl: './reactiveform.component.css'
})
export class ReactiveformComponent {
  employeeForm = new FormGroup({
    eid: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
    ename: new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
    esalary: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')])
  });
  emp: Employee;
  flag: boolean;
  constructor() {
    this.emp = new Employee();
    this.flag = false;
  }

  onClickSubmit(data: any) {
    this.emp.eid = data.eid;
    this.emp.ename = data.ename;
    this.emp.esalary = data.esalary;
    this.flag = true;
  }

  get eid(){
    return this.employeeForm.get('eid')
  }
  get ename(){
    return this.employeeForm.get('ename')
  }
  get esalary(){
    return this.employeeForm.get('esalary')
  }
}
