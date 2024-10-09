import { Component } from '@angular/core';

@Component({
  selector: 'app-fact',
  templateUrl: './fact.component.html',
  styleUrl: './fact.component.css'
})
export class FactComponent {
  limit: number = 0; 
  factorials: { number: number, factorial: number }[] = [];

  generateFactorialTable(): void {
    this.factorials = [];
    for (let i = 0; i <= this.limit; i++) {
      this.factorials.push({ number: i, factorial: this.factorial(i) });
    }
  }

  private factorial(n: number): number {
    if (n <= 1) return 1;
    return n * this.factorial(n - 1);
  }
}
