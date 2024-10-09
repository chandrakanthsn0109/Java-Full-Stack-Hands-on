import { Component } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrl: './child2.component.css'
})
export class Child2Component {
  message:String;
  myClass:{};
  constructor(){
    this.message="I am a Child of Child Component";
    this.myClass={"text-align": "center",
      "width": "300px",
      "height": "150px",
      "background-color": "yellow",
      "color":"blue",
      "border": "5px solid blue",
      "font-size": "25px",
      "margin-left": "120px",
      "margin-top": "40px"
    }
  }
}
