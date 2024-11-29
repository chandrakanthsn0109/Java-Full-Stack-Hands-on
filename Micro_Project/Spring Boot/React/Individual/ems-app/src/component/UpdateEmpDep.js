import { Component } from 'react';
import axios from "axios";
import "./EmpDep.css";
import Employee from '../model/Employee';
import Department from '../model/Department';
export default class UpdateEmpDep extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empId: "",
            empName: "",
            empSalary: "",
            employee: "",
            eidError: "",
            enameError: "",
            esalaryError: "",
            depNo: "",
            errorDept: "",
            depName: "",
            dnameError: ""
        }

    }

    validateEid = (empId) => {
        let reg = /^[0-9]+$/
        if (empId === "") {
            return "Employee Id is Required"
        }
        else if (!reg.test(empId)) {
            return "Invalid Employee Id"
        }
        else
            return null
    }

    validateEname = (empName) => {
        let reg = /^[a-zA-Z ]+$/
        if (empName === "") {
            return "Employee Name is Required"
        }
        else if (!reg.test(empName)) {
            return "Invalid Employee Name"
        }
        else
            return null

    }
    validateEsalary = (empSalary) => {
        let reg = /^[0-9]+$/
        if (empSalary === "") {
            return "Employee Salary is Required"
        }
        else if (!reg.test(empSalary)) {
            return "Invalid Employee Salary"
        }
        else
            return null

    }

    validateDepNo(depNo) {
        let reg = /^[0-9\b]+$/;
        if (depNo === '') {
            return "Dept ID is required"
        }
        else if (!reg.test(depNo)) {
            return "Dept ID is invalid"
        }
        else {
            return null
        }
    }

    validateDepName = (depName) => {
        let reg = /^[a-zA-Z ]+$/
        if (depName === "") {
            return "Department Name is Required"
        }
        else if (!reg.test(depName)) {
            return "Invalid Department Name"
        }
        else
            return null

    }

    changeId = (e) => {
        this.setState({ empId: e.target.value });
        let error = this.validateEid(this.state.empId);
        this.setState({ eidError: error })

    }
    changeName = (e) => {
        this.setState({ empName: e.target.value });
        let error = this.validateEname(this.state.empName);
        this.setState({ enameError: error })
    }
    changeSalary = (e) => {
        this.setState({ empSalary: e.target.value });
        let error = this.validateEsalary(this.state.empSalary);
        this.setState({ esalaryError: error })
    }


    changeDepNo = (e) => {
        this.setState({ depNo: e.target.value })
        let error = this.validateDepNo(this.state.depNo)
        this.setState({ errorDept: error })

    }

    changeDepName = (e) => {
        this.setState({ depName: e.target.value });
        let error = this.validateDepName(this.state.depName);
        this.setState({ dnameError: error })
    }
    GetResult = (e) => {
        let error = this.validateEid(this.state.empId);
        this.setState({ eidError: error })

        let error1 = this.validateEname(this.state.empName);
        this.setState({ enameError: error1 })

        let error2 = this.validateEsalary(this.state.empSalary);
        this.setState({ esalaryError: error2 })

        if (!error && !error1 && !error2) {
            this.setState({ flag: true })

            let employee = new Employee();
            let dep = new Department();
            dep.setDepNo(this.state.depNo);
            employee.setEmpId(this.state.empId);
            employee.setEmpName(this.state.empName);
            employee.setEmpSalary(this.state.empSalary);
            employee.setDep(dep);

            axios.put("http://localhost:1212/update-employee", employee)
                .then(() => {
                    document.getElementById("res").innerHTML = "<b>Object Updated Successfully</b>";
                })

            e.preventDefault();


        }
    }

    GetResultDep = (e) => {
        let error = this.validateDepNo(this.state.depNo);
        this.setState({ errorDept: error })

        let error1 = this.validateDepName(this.state.depName);
        this.setState({ dnameError: error1 })

        if (!error && !error1) {
            this.setState({ flag: true })

            let dep = new Department();
            dep.setDepNo(this.state.depNo);
            dep.setDepName(this.state.depName);
            axios.put("http://localhost:1212/update-department", dep)
                .then(() => {
                    document.getElementById("res1").innerHTML = "<b>Object Updated Successfully</b>";
                })

            e.preventDefault();


        }
    }
    render() {
        return (
            <div id="myForm" class="row mt-6">
                <h1 align="center">Employee and Deparment Mangement System</h1>
                <div class="col-md-6" id="emp">
                    <h1 align="center">Employee System</h1>
                    <form class="">
                        <div class="form-group">
                            <label for="first" class="fw-bold">Enter Employee Id:</label>
                            <input type='text' value={this.state.empId} onChange={this.changeId} class="form-control border border-info"></input>
                            <font color="red"><b>{this.state.eidError}</b></font>
                        </div>
                        <div class="form-group">
                            <label for="second" class="fw-bold">Enter Employee Name:</label>
                            <input type='text' value={this.state.empName} onChange={this.changeName} class="form-control border border-info"></input>
                            <font color="red" id="in"><b>{this.state.enameError}</b></font>
                        </div>
                        <div class="form-group">
                            <label for="third" class="fw-bold">Enter Employee Salary:</label>
                            <input type='text' value={this.state.empSalary} onChange={this.changeSalary} id="in" class="form-control border border-info"></input>
                            <font color="red" id="in"><b>{this.state.esalaryError}</b></font>
                        </div>
                        <div>
                            <div class='form-group'>
                                <label class='fw-bold'>Department ID</label>
                                <input type="text" name="depNo" class='form-control' value={this.state.depNo} onChange={this.changeDepNo} /></div>
                            <font color='red'><b>{this.state.errorDept}</b></font>

                        </div>
                        <button onClick={this.GetResult} id="bt" class="btn btn-success">Update</button>&nbsp;
                        <br></br><br></br>

                    </form>

                    {this.state.flag ?

                        <div id="res">

                        </div>
                        : ''
                    }
                </div>
                <div class="col-md-4" id="dep">
                    <h1 align="center">Deparment System</h1>
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="first" class="fw-bold">Enter Department Number:</label>
                            <input type='text' value={this.state.depNo} onChange={this.changeDepNo} class="form-control border border-info"></input>
                            <font color="red"><b>{this.state.errorDept}</b></font>
                        </div>
                        <div class="form-group">
                            <label for="second" class="fw-bold">Enter Deparment Name:</label>
                            <input type='text' value={this.state.depName} onChange={this.changeDepName} class="form-control border border-info"></input>
                            <font color="red" id="in"><b>{this.state.dnameError}</b></font>
                        </div>
                        <button onClick={this.GetResultDep} id="bt" class="btn btn-success">Update</button>&nbsp;
                        <br></br><br></br>

                    </form>

                    {this.state.flag ?

                        <div id="res1">

                        </div>
                        : ''
                    }
                </div>
            </div>
        );
    }
}
