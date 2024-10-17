import { Component } from 'react';
class Form extends Component {
    
    constructor() {
        super();
        this.state = {
            flag:false,
            eid: "",
            ename: "",
            esalary: ""
            ,employee:""
        }
       
    }
    GetResult = (e) => {
        e.preventDefault();
        this.setState({flag:true})
    }
    render() {
        return (
            <div>
                <form>
                <label for="first">Enter Employee Id:</label>
                <input type='text' value={this.state.eid} onChange={(e) => this.setState({ eid: e.target.value })}></input><br></br><br></br>
                <label for="second">Enter Employee Name:</label>
                <input type='text' value={this.state.ename} onChange={(e) => this.setState({ ename: e.target.value })}></input><br></br><br></br>
                <label for="third">Enter Employee Salary:</label>
                <input type='text' value={this.state.esalary} onChange={(e) => this.setState({ esalary: e.target.value })}></input><br></br><br></br>
                {/* <button onClick={this.setState(()=>this.setState({eid:this.state.eid,ename:this.state.ename,esalary:this.state.esalary}))}>Calculate</button> */}
                {/* <br></br>N1 {this.state.n1} N2 {this.state.n2} Op {this.state.option} */}
                <button onClick={this.GetResult}>Submit</button>
            
                </form>
                {this.state.flag ?
                <div>
                    <br></br>Employee Id:{this.state.eid}
                    <br></br>Employee Name:{this.state.ename}
                    <br></br>Employee Salary:{this.state.esalary}
                </div>
                :''
                }
            </div>
        );
    }
}
export default Form;