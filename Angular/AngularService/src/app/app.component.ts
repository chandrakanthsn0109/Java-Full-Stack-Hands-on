import { Component } from '@angular/core';
import { CalculatorService } from './calculator.service';
import { FactorialService } from './factorial.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'AngularService';
  sum: number;
  sub:number;
  factorials:number[]=[];
  input:number=0;
  constructor(private calc: CalculatorService,private fac:FactorialService) {//Dependency Injection
    this.sum = calc.getAddition(10, 7);
    this.sub = calc.getSubtraction(10, 7);
   
    
  }
  getFact(){
    this.factorials=this.fac.getFactorialvalues(this.input);
  }
}
