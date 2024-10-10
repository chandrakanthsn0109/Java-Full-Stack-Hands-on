import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {

  constructor() { }
  getFactorialvalues(m: number) : number[]{
    let res: number[] = [];
    for (let k = 1; k <= m; k++) {
      let fact:number=1;
      for(let j=1;j<=k;j++){
        fact=fact*j;
      }
      res[k-1]=fact;
    }
    return res;
  }
}
