import "./Employee.css"
import { Component } from 'react';
import axios from "axios";
export default class FindBySalary extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empSalary: "",
            esalError:"",
            result:[],
            message:""
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
        
        let error = this.validateEsalary(this.state.empSalary);
        this.setState({esalError:error})

        if(!error){
            this.setState({ flag: true })
            axios.get("http://localhost:1212/find-employee-salary/"+this.state.empSalary)
                .then(  (response) => {
                    this.setState({result:response.data,
                        message:"Object Fetched Successfully"
                    })
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
                    <button onClick={this.GetResult} id="bt" class="btn btn-success">FindBySalary</button>&nbsp;
                    <br></br><br></br>

                </form>
                {this.state.flag ?
                <table class="findAll">
                    <tr>
                        <th>Employee Id</th>
                        <th>Employee Name</th>
                        <th>Employee Salary</th>
                    </tr>
                    {this.state.result.map((employee)=>(
                    <tr key={employee.empId}>
                        <td>{employee.empId}</td>
                        <td>{employee.empName}</td>
                        <td>{employee.empSalary}</td>
                    </tr>
                    ))}


                </table>: ''
                }
                </div>
            </div>
        );
    }
}