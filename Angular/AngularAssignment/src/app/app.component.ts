import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AngularAssignment';
  message:String;
  myClass:string="myClass";
  constructor(){
    this.message="I am a Parent Component";
  }
}
