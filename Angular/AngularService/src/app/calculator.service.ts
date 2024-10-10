import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {

  constructor() { }

  getAddition(a:number,b:number):number{
    let Sum=a+b;
    return Sum;
  }
  getSubtraction(a:number,b:number):number{
    let Sub=a-b;
    return Sub;
  }
}
