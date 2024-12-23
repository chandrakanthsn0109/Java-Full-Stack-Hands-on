import { Component } from 'react';
import './form.css';
class Form extends Component {

    constructor() {
        super();
        this.state = {
            flag: false,
            eid: "",
            ename: "",
            esalary: "",
            employee: "",
            eidError:"",
            enameError:"",
            esalaryError:""
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
    validateEname = (ename) => {
        let reg = /^[a-zA-Z]+$/
        if (ename === "") {
            return "Employee Name is Required"
        }
        else if (!reg.test(ename)) {
            return "Invalid Employee Name"
        }
        else
            return null

    }
    validateEsalary = (esalary) => {
        let reg = /^[0-9]+$/
        if (esalary === "") {
            return "Employee Salary is Required"
        }
        else if (!reg.test(esalary)) {
            return "Invalid Employee Salary"
        }
        else
            return null

    }

    changeId = (e) => {
        this.setState({ eid: e.target.value });
        let error = this.validateEid(this.state.eid);
        this.setState({eidError:error})

    }
    changeName = (e) => {
        this.setState({ ename: e.target.value });
        let error = this.validateEname(this.state.ename);
        this.setState({enameError:error})
    }
    changeSalary = (e) => {
        this.setState({ esalary: e.target.value });
        let error = this.validateEsalary(this.state.esalary);
        this.setState({esalaryError:error})
    }
    GetResult = (e) => {
        e.preventDefault();
        
        let error = this.validateEid(this.state.eid);
        this.setState({eidError:error})

        let error1 = this.validateEname(this.state.ename);
        this.setState({enameError:error1})

        let error2 = this.validateEsalary(this.state.esalary);
        this.setState({esalaryError:error2})

        if(!error&&!error1&&!error2){
            this.setState({ flag: true })
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
                    <div class="form-group">
                    <label for="second" class="fw-bold">Enter Employee Name:</label>
                    <input type='text' value={this.state.ename} onChange={this.changeName} class="form-control border border-info"></input>
                    <font color="red" id="in"><b>{this.state.enameError}</b></font>
                    </div>
                    <div class="form-group">
                    <label for="third" class="fw-bold">Enter Employee Salary:</label>
                    <input type='text' value={this.state.esalary} onChange={this.changeSalary} id="in" class="form-control border border-info"></input>
                    <font color="red" id="in"><b>{this.state.esalaryError}</b></font>
                    </div>
                    <button onClick={this.GetResult} id="bt" class="btn btn-success">Submit</button>&nbsp;
                    <button  class="btn btn-primary">Insert</button>&nbsp;
                    <button  class="btn btn-success">Update</button>&nbsp;
                    <button  class="btn btn-danger">Delete</button>&nbsp;
                    <button  class="btn btn-info">Find</button>&nbsp;
                    <button  class="btn btn-warning">Find All</button>&nbsp;
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
export default Form;