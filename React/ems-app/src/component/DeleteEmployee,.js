import { Component } from 'react';
import "./Employee.css";
import axios from "axios";
export default class DeleteEmployee extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            eid: "",
            eidError:""
        }

    }

    validateEid = (eid) => {
        let reg = /^[0-9]+$/
        if (eid === "") {
            return "Employee Id is Required"
        }
        else if (!reg.test(eid)) {
            return "Invalid Employee Id"
        }
        else
            return null

    }
  
    changeId = (e) => {
        this.setState({ eid: e.target.value });
        let error = this.validateEid(this.state.eid);
        this.setState({eidError:error})

    }
    GetResult = (e) => {
        let error = this.validateEid(this.state.eid);
        this.setState({eidError:error})

        if(!error){
            this.setState({ flag: true })
            axios.delete("http://localhost:3004/employees/"+this.state.eid)
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
                    <label for="first" class="fw-bold">Enter Employee Id:</label>
                    <input type='text' value={this.state.eid} onChange={this.changeId} class="form-control border border-info"></input>
                    <font color="red"><b>{this.state.eidError}</b></font>
                    </div>
                    <button onClick={this.GetResult} id="bt" class="btn btn-danger">Delete</button>&nbsp;
                    <br></br><br></br>

                </form>
                {this.state.flag ?
                
                    <div id="res">
                        <br></br>Employee Id:{this.state.eid}
                        <br></br>Employee Name:{this.state.ename}
                        <br></br>Employee Salary:{this.state.esalary}
                    </div>
                    : ''
                }
                </div>
            </div>
        );
    }
}