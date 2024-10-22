export default class Crop {
    id;
    name;
    culper;
    harcap;
    constructor() {
       this.id=0;
       this.name="";
       this.culper=0;
       this.harcap=0;
    }

    setId(id){
       this.id=id;
    }
    setName(name){
       this.name=name;
    }
    setCult(culper){
       this.culper=culper;
    }
    setHarv(harcap){
        this.harcap=harcap;
    }
}
