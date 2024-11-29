import Department from "./Department";

class Employee {
   empId;
   empName;
   empSalary;
   dep;
   constructor() {
      this.empId=0;
      this.empName="";
      this.empSalary=0;
      this.dep = new Department();

   }

    setEmpId(empId){
       this.empId=empId;
    }
    setEmpName(empName){
       this.empName=empName;
    }
    setEmpSalary(empSalary){
       this.empSalary=empSalary;
    }

    setDep(dep){
      this.dep=dep;
    }
}
export default Employee;
