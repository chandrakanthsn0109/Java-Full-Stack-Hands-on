import "./EmpDep.css"
import { Component } from 'react';
import axios from "axios";
import Employee from "../model/Employee";
export default class FindEmpDep extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            flag1: false,
            empId: "",
            eidError: "",
            resultEmp : new Employee(),
            resultDep: [],
            messageDep: "",
            messageEmp: "",
            depNo: "",
            errorDept: ""

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

    validateDepNo(depNo) {
        let reg = /^[0-9]+$/;
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

    changeId = (e) => {
        this.setState({ empId: e.target.value });
        let error = this.validateEid(this.state.empId);
        this.setState({ eidError: error })

    }

    changeDepNo = (e) => {
        this.setState({ depNo: e.target.value });
        let error = this.validateDepNo(this.state.depNo);
        this.setState({ errorDept: error });

    }

    GetResult = (e) => {

        let error = this.validateEid(this.state.empId);
        this.setState({ eidError: error })

        if (!error) {
            this.setState({ flag: true })
            axios.get("http://localhost:1212/find-employee/"+this.state.empId)
                .then((response) => {
                    this.setState({
                        resultEmp: response.data,
                        messageEmp: "Object Fetched Successfully"

                    })
                })
                .catch((error) => {
                    document.getElementById("res").innerHTML = "<b>Error Saving Object</b>" + error;
                });
            e.preventDefault();
        }
    }

    GetResultDep = (e) => {

        let error = this.validateDepNo(this.state.depNo);
        this.setState({ errorDept: error })

        if (!error) {
            this.setState({ flag1: true })
            axios.get("http://localhost:1212/find-department/" + this.state.depNo)
                .then((response) => {
                    this.setState({
                        resultDep: response.data,
                        messageDep: "Object Fetched Successfully"
                    })
                })
                .catch((error) => {
                    document.getElementById("res1").innerHTML = "<b>Error Saving Object</b>" + error;
                });

            e.preventDefault();
        }
    }

    render() {
        return (
            <div id="myForm" class="row mt-6">
                <h1 align="center">Employee and Deparment Mangement System</h1>
                <div class="col-md-6" id="emp">
                    <h1 align="center">Employee System</h1>
                    <form>
                        <div class="form-group">
                            <label for="first" class="fw-bold">Enter Employee Number:</label>
                            <input type='text' value={this.state.empId} onChange={this.changeId} class="form-control border border-info"></input>
                            <font color="red"><b>{this.state.eidError}</b></font>
                        </div>
                        <button onClick={this.GetResult} id="bt" class="btn btn-warning">Find</button>&nbsp;
                        <br></br><br></br>

                    </form>
                    {this.state.flag ?

                        <div id="res">
                            <br></br>Employee Id:{this.state.resultEmp.empId}
                            <br></br>Employee Name:{this.state.resultEmp.empName}
                            <br></br>Employee Salary:{this.state.resultEmp.empSalary}
                            <br></br>Deparment Number:{this.state.resultEmp.dep.depNo}
                            <br></br>{this.state.messageEmp}
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
                        <button onClick={this.GetResultDep} id="bt" class="btn btn-warning">Find</button>&nbsp;
                        <br></br><br></br>

                    </form>
                    {this.state.flag1 ?

                        <div id="res1">
                            <br></br>Deparment Number:{this.state.resultDep.depNo}
                            <br></br>Deparment Name:{this.state.resultDep.depName}
                            <br></br>{this.state.messageDep}
                        </div>
                        : ''
                    }
                </div>
            </div>
        );
    }
}