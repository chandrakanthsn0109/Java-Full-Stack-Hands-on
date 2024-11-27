import "./Employee.css"
import { Component } from 'react';
import axios from "axios";
export default class FindEmployee extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empId: "",
            eidError:"",
            result:[],
            message:""
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
  

    changeId = (e) => {
        this.setState({ empId: e.target.value });
        let error = this.validateEid(this.state.empId);
        this.setState({eidError:error})

    }
    GetResult = (e) => {
        
        let error = this.validateEid(this.state.empId);
        this.setState({eidError:error})

        if(!error){
            this.setState({ flag: true })
            axios.get("http://localhost:1212/read-employee/"+this.state.empId)
                .then(  (response) => {
                    this.setState({result:response.data,
                        message:"Object Fetched Successfully"
                    })
                })
                 .catch((error) => {
                    document.getElementById("res").innerHTML = "<b>Error Saving Object</b>"+error;
                });

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
                    <button onClick={this.GetResult} id="bt" class="btn btn-info">Find</button>&nbsp;
                    <br></br><br></br>

                </form>
                {this.state.flag ?
                
                    <div id="res">
                        <br></br>Employee Id:{this.state.result.empId}
                        <br></br>Employee Name:{this.state.result.empName}
                        <br></br>Employee Salary:{this.state.result.empSalary}
                        <br></br>{this.state.message}
                    </div>
                    : ''
                }
                </div>
            </div>
        );
    }
}