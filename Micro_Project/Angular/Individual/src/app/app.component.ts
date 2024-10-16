import { Component } from '@angular/core';
import { Crop } from './model/Crop';
import { CropService } from './crop.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  myhead: {};
  bod: string;
  lab: string;
  crop: Crop;
  result: string = "";
  cropArr: Crop[] = [];
  flag: boolean = false;
  constructor(private crpService: CropService) {
    this.myhead = { "color": "blue", "text-align": "center" };
    this.bod = "bod";
    this.lab = "lab";
    this.crop = new Crop();
  }
  insertCrop(data: any) {
    this.crop.id = data.id;
    this.crop.crpName = data.crpName;
    this.crop.cultPer = data.cultPer;
    this.crop.harCap = data.harCap;

    this.result = this.crpService.insertCrop(this.crop)
  }
  updateCrop(data: any) {
    this.crop.id = data.id;
    this.crop.crpName = data.crpName;
    this.crop.cultPer = data.cultPer;
    this.crop.harCap = data.harCap;

    this.result = this.crpService.updateCrop(this.crop);
  }

  deleteCrop(data: any) {
    this.result = this.crpService.deleteCrop(data.id)
  }
  findCrop(data: any) {
    let crop: Crop = this.crpService.findCrop(data.id);
    this.result="Crop Id: "+crop.id+" Crop Name: "+crop.crpName+" Cultivation Period in months: "+crop.cultPer+" Harvesting Capacity in Kg: "+crop.harCap;

  }
  findAllCrops() {
    this.cropArr = this.crpService.findAllCrops();
    this.flag = true;
  }
}
