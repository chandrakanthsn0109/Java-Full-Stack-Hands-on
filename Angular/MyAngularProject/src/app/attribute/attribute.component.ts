import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute',
  templateUrl: './attribute.component.html',
  styleUrl: './attribute.component.css'
})
export class AttributeComponent {
  myStyle = {};
  myClass:string="myClass";
  constructor() {
    this.myStyle = { "color": "green", "font-weight": "bold" }
  }
  changeStyle(): void {
    this.myStyle = { "color": "red", "font-weight": "bold" }
  }
  changeClass():void{
    this.myClass="myClass1"
  }
}
