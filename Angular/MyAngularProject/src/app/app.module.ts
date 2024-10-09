import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import { Child2Component } from './child2/child2.component';
import { FormsModule } from '@angular/forms';
import { DOMComponent } from './dom/dom.component';
import { AttributeComponent } from './attribute/attribute.component';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    Child2Component,
    DOMComponent,
    AttributeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { 
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
