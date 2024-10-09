import { Component } from '@angular/core';

@Component({
  selector: 'app-dom',
  templateUrl: './dom.component.html',
  styleUrl: './dom.component.css'
})
export class DOMComponent {
  flag: boolean;
  arr: string[];
  selectedItem: string = "";
  constructor() {
    this.flag = true;
    this.arr = ["MS Dhoni", "VK", "Hitman"]
  }
  changeFlag(): void {
    this.flag = !this.flag;
  }

  setSelectedItem(item: string) {
    this.selectedItem = item;
  }

}
