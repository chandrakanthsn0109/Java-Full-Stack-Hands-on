import { Component } from 'react';
import "./Employee.css";
import axios from "axios";
export default class DeleteBySalary extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empSalary: "",
            esalError:""
        }

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
  
    changeSalary = (e) => {
        this.setState({ empSalary: e.target.value });
        let error = this.validateEsalary(this.state.empSalary);
        this.setState({esalError:error})

    }
    GetResult = (e) => {
        e.preventDefault();
        let error = this.validateEsalary(this.state.empSalary);
        this.setState({esalError:error})

        if(!error){
            this.setState({ flag: true })
            axios.delete("http://localhost:1212/delete-employee-salary/"+this.state.empSalary)
                .then(() => {
                    document.getElementById("res").innerHTML = "<b>Object Deleted Successfully</b>";
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
                    <label for="first" class="fw-bold">Enter Employee Salary:</label>
                    <input type='text' value={this.state.empSalary} onChange={this.changeSalary} class="form-control border border-info"></input>
                    <font color="red"><b>{this.state.esalError}</b></font>
                    </div>
                    <button onClick={this.GetResult} id="bt" class="btn btn-Warning">DeleteBySalary</button>&nbsp;
                    <br></br><br></br>

                </form>
                {
                this.state.flag ?
                
                    <div id="res">
                        <br></br>Employee Id:{this.state.empId}
                        <br></br>Employee Name:{this.state.empName}
                        <br></br>Employee Salary:{this.state.empSalary}
                    </div>
                    : ''
                }
                </div>
            </div>
        );
    }
}