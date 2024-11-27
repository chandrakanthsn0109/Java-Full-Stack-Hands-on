import { Component } from 'react';
import "./Employee.css";
import Employee from '../model/Employee';
import axios from "axios";
export default class UpdateEmployee extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empId: "",
            empName: "",
            empSalary: "",
            employee: "",
            eidError:"",
            enameError:"",
            esalaryError:""
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
        let reg = /^[a-zA-Z]+$/
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

    changeId = (e) => {
        this.setState({ empId: e.target.value });
        let error = this.validateEid(this.state.empId);
        this.setState({eidError:error})

    }
    changeName = (e) => {
        this.setState({ empName: e.target.value });
        let error = this.validateEname(this.state.empName);
        this.setState({enameError:error})
    }
    changeSalary = (e) => {
        this.setState({ empSalary: e.target.value });
        let error = this.validateEsalary(this.state.empSalary);
        this.setState({esalaryError:error})
    }
    GetResult = (e) => {
        
        let error = this.validateEid(this.state.empId);
        this.setState({eidError:error})

        let error1 = this.validateEname(this.state.empName);
        this.setState({enameError:error1})

        let error2 = this.validateEsalary(this.state.empSalary);
        this.setState({esalaryError:error2})

        if(!error&&!error1&&!error2){
            this.setState({ flag: true });
            let employee = new Employee();
            employee.setId(this.state.empId);
            employee.setName(this.state.empName);
            employee.setSalary(this.state.empSalary);

            axios.put("http://localhost:1212/update-employee", employee)
                .then(() => {
                    document.getElementById("res").innerHTML = "<b>Object Updated Successfully</b>";
                })
            e.preventDefault();
        }
    }
    render() {
        return (
            <div  id="myForm">
                <div class="container" >
                <h1 align="center">Employee Mangement System</h1>
                <form class="form-horizontal">
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
                    <button onClick={this.GetResult} id="bt" class="btn btn-success">Update</button>&nbsp;
                    <br></br><br></br>
                </form>
                {this.state.flag ?
                
                    <div id="res">
                        
                    </div>
                    : ''
                }
                </div>
            </div>
        );
    }
}
