import { Component } from 'react';
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
            <div>
                <form>
                    <label for="first">Enter Employee Id:</label>
                    <input type='text' value={this.state.eid} onChange={this.changeId}></input><br></br>
                    <font color="red"><b>{this.state.eidError}</b></font><br></br>
                    <label for="second">Enter Employee Name:</label>
                    <input type='text' value={this.state.ename} onChange={this.changeName}></input><br></br>
                    <font color="red"><b>{this.state.enameError}</b></font><br></br>
                    <label for="third">Enter Employee Salary:</label>
                    <input type='text' value={this.state.esalary} onChange={this.changeSalary}></input><br></br>
                    <font color="red"><b>{this.state.esalaryError}</b></font><br></br>
                    <button onClick={this.GetResult}>Submit</button><br></br>Flag:{this.state.flag}

                </form>
                {this.state.flag ?
                    <div>
                        <br></br>Employee Id:{this.state.eid}
                        <br></br>Employee Name:{this.state.ename}
                        <br></br>Employee Salary:{this.state.esalary}
                    </div>
                    : ''
                }
            </div>
        );
    }
}
export default Form;