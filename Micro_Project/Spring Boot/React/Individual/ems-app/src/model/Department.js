class Department {
    depNo;
    depName;
    constructor() {
       this.depNo=0;
       this.depName="";
    }

    setDepNo(depNo){
       this.depNo=depNo;
    }
    setDepName(depName){
       this.depName=depName;
    }
}
export default Department;