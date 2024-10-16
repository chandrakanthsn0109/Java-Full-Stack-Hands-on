import { Injectable } from '@angular/core';
import { Crop } from './model/Crop';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CropService {
  url:string;
  crop:Crop;
  cropArr:Crop[]=[];
  constructor(private http:HttpClient) { 
    this.url="http://localhost:3004/crops/";
    this.crop=new Crop();
  }

  insertCrop(crop:Crop){
     this.http.post(this.url,crop).subscribe();
     return "Crop Object Saved Successfully!"
  }
  updateCrop(crop:Crop){
     this.http.put(this.url+crop.id,crop).subscribe();
     return "Crop Object updated Successfully!"
  }
  deleteCrop(cid:number){
     this.http.delete(this.url+cid).subscribe();
     return "Crop Object deleted Successfully!"
  }
  findCrop(cid:number){
     this.http.get<Crop>(this.url+cid).subscribe(crp=>this.crop=crp);
     return this.crop;
  }
  findAllCrops(){

     this.http.get<Crop[]>(this.url).subscribe(crpArr=>this.cropArr=crpArr);
     return this.cropArr;
  }
}
