import { Component } from 'react';
import "./Employee.css";
import axios from "axios";
export default class FindAllEmployee extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            result:[],
            message:""
        }

    }

    GetResult = (e) => {
            this.setState({ flag: true })
            axios.get("http://localhost:3004/employees")
                .then(  (response) => {
                    this.setState({result:response.data,
                        message:"Object Fetched Successfully"
                    })
                })

            e.preventDefault();
        
    }
    render() {
        return (
            <div  id="myForm">
                <div class="container" >
                <h1 align="center">Employee Mangement System</h1>
                <form class="form-horizontal">
                    <button onClick={this.GetResult} id="bt" class="btn btn-warning">FindAll</button>&nbsp;
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
                    <tr key={employee.id}>
                        <td>{employee.id}</td>
                        <td>{employee.name}</td>
                        <td>{employee.salary}</td>
                    </tr>
                    ))}


                </table>: ''
                }
                </div>
            </div>
        );
    }
}
