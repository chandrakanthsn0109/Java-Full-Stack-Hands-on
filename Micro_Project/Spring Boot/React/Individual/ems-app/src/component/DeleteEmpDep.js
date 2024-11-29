import { Component } from 'react';
import axios from "axios";
import "./EmpDep.css"
export default class DeleteEmpDep extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empId: "",
            employee: "",
            eidError: "",
            depNo: "",
            errorDept: "",
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
        this.setState({ eidError: error });

    }

    changeDepNo = (e) => {
        this.setState({ depNo: e.target.value });
        let error = this.validateDepNo(this.state.depNo);
        this.setState({ errorDept: error });

    }

    GetResult = (e) => {
        e.preventDefault();
        let error = this.validateEid(this.state.empId);
        this.setState({ eidError: error })

        if (!error) {
            this.setState({ flag: true })
            axios.delete("http://localhost:1212/delete-employee/" + this.state.empId)
                .then(() => {
                    document.getElementById("res").innerHTML = "<b>Object Deleted Successfully</b>";
                })
            e.preventDefault();
        }
    }

    GetResultDep = (e) => {
        e.preventDefault();
        let error = this.validateDepNo(this.state.depNo);
        this.setState({ errorDept: error })

        if (!error) {
            this.setState({ flag: true })
            axios.delete("http://localhost:1212/delete-department/"+this.state.depNo)
                .then(() => {
                    document.getElementById("res1").innerHTML = "<b>Object Deleted Successfully</b>";
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
                        <button onClick={this.GetResult} id="bt" class="btn btn-danger">Delete</button>&nbsp;
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
                        <button onClick={this.GetResultDep} id="bt" class="btn btn-danger">Delete</button>&nbsp;
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
