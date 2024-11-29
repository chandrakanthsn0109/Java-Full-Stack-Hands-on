import { Component } from 'react';
import "./EmpDep.css";
import axios from "axios";
export default class FindAllEmpDep extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            flag1: false,
            result: [],
            message: ""
        }

    }

    GetResult = (e) => {
        this.setState({ flag: true })
        axios.get("http://localhost:1212/findAll-employee")
            .then((response) => {
                this.setState({
                    result: response.data,
                    message: "Object Fetched Successfully"
                })
            })

        e.preventDefault();

    }

    GetResultDep = (e) => {
        this.setState({ flag1: true })
        axios.get("http://localhost:1212/findAll-department")
            .then((response) => {
                this.setState({
                    result: response.data,
                    message: "Object Fetched Successfully"
                })
            })

        e.preventDefault();

    }
    render() {
        return (
            <div id="myForm" class="row mt-6">
                <h1 align="center">Employee And DeparmentMangement System</h1>
                <div class="col-md-6" id="emp">
                    <h1 align="center">Employee System</h1>
                    <form class="form-horizontal">
                        <button onClick={this.GetResult} id="bt" class="btn btn-info">FindAll</button>&nbsp;
                        <br></br><br></br>

                    </form>
                    {this.state.flag ?
                        <table class="findAll">
                            <tr>
                                <th>Employee Id</th>
                                <th>Employee Name</th>
                                <th>Employee Salary</th>
                                <th>Deparment Number</th>
                            </tr>
                            {this.state.result.map((employee) => (
                                <tr key={employee.empId}>
                                    <td>{employee.empId}</td>
                                    <td>{employee.empName}</td>
                                    <td>{employee.empSalary}</td>
                                    <td>{employee.dep.depNo}</td>
                                </tr>
                            ))}


                        </table> : ''
                    }
                </div>
                <div class="col-md-4" id="dep">
                    <h1 align="center">Deparment System</h1>
                    <form class="form-horizontal">
                        <button onClick={this.GetResultDep} id="bt" class="btn btn-info">FindAll</button>&nbsp;
                        <br></br><br></br>

                    </form>
                    {this.state.flag1 ?
                        <table class="findAll">
                            <tr>
                                <th>Deparment Number</th>
                                <th>Deparment Name</th>
                            </tr>
                            {this.state.result.map((department) => (
                                <tr key={department.depNo}>
                                    <td>{department.depNo}</td>
                                    <td>{department.depName}</td>
                                </tr>
                            ))}


                        </table> : ''
                    }
                </div>
            </div>
        );
    }
}
