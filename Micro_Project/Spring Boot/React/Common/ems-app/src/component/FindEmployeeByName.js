import "./Employee.css"
import { Component } from 'react';
import axios from "axios";
export default class FindEmployeeByName extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            empName: "",
            enameError:"",
            result:[],
            message:""
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
        
        let error = this.validateEname(this.state.empName);
        this.setState({enameError:error})

        if(!error){
            this.setState({ flag: true })
            axios.get("http://localhost:1212/find-employee-name/"+this.state.empName)
                .then(  (response) => {
                    this.setState({result:response.data,
                        message:"Object Fetched Successfully"
                    })
                })

            e.preventDefault();

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
                    <button onClick={this.GetResult} id="bt" class="btn btn-info">FindByName</button>&nbsp;
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