import { Component } from 'react';
import "./Employee.css";
import axios from "axios";
export default class DeleteEmployeeByName extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empName: "",
            enameError:""
        }

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
  
    changeName = (e) => {
        this.setState({ empName: e.target.value });
        let error = this.validateEname(this.state.empName);
        this.setState({enameError:error})

    }
    GetResult = (e) => {
        e.preventDefault();
        let error = this.validateEname(this.state.empName);
        this.setState({enameError:error})

        if(!error){
            this.setState({ flag: true })
            axios.delete("http://localhost:1212/delete-employee-name/"+this.state.empName)
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
                    <label for="first" class="fw-bold">Enter Employee Name:</label>
                    <input type='text' value={this.state.empName} onChange={this.changeName} class="form-control border border-info"></input>
                    <font color="red"><b>{this.state.enameError}</b></font>
                    </div>
                    <button onClick={this.GetResult} id="bt" class="btn btn-Warning">DeleteByName</button>&nbsp;
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