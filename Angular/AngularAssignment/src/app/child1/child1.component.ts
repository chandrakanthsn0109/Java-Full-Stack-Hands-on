import { Component } from '@angular/core';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrl: './child1.component.css'
})
export class Child1Component {
  message:String;
  myClass:string="myClass";
  constructor(){
    this.message="I am a Child of  Parent Component";
  }
}
