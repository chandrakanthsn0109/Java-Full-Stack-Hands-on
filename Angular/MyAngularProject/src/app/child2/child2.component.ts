import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrl: './child2.component.css'
})
export class Child2Component {
  title = 'MyAngularProject';
  fname:string="";
  name : String = "Chandra";
  age : number;
  salary:any;
  imagepath:String;
  width : number=200;
  height : number=200;
  btnTxt:string;
  constructor (){
    this.age=22;
    this.salary=22000;
    this.imagepath="image.png";
    this.btnTxt="Change Name";
  }

  add(a:number,b:number):number{
    return a+b;
  }
  changename():void{
    this.name="Srikanth"
  }
  changeimg():void{
    if(this.imagepath=="bird.png"){
      this.imagepath="image.png"
    }
    else{
    this.imagepath="bird.png"
    }
  }
}
