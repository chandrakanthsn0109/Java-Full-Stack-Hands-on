//Simple Calculator
import { Component } from 'react';
class Calculator extends Component {
    
    constructor() {
        super();
        this.state = {
            n1: 0,
            n2: 0,
            option: "",
            result: 0
        }
       
    }
    GetResult = () => {
        let {n1,n2}=this.state
        if (this.state.option=== "add") {
            this.setState({result : parseInt(n1) + parseInt(n2)})
        }
        else if (this.state.option=== "sub") {
            this.setState({result : parseInt(n1) - parseInt(n2)});
        }
        else if (this.state.option === "mul") {
            this.setState({result : parseInt(n1) * parseInt(n2)})
        }
        else if (this.state.option=== "div") {
            this.setState({result : parseInt(n1) / parseInt(n2)})
        }
        
    }
    render() {
        return (
            <div>
                <label for="first">Enter First Number:</label>
                <input type='text' value={this.state.n1} onChange={(e) => this.setState({ n1: e.target.value })}></input><br></br><br></br>
                <label for="second">Enter Second Number:</label>
                <input type='text' value={this.state.n2} onChange={(e) => this.setState({ n2: e.target.value })}></input><br></br><br></br>
                <label for="second">Select Option:</label>
                <select  onChange={(e) => this.setState({ option: e.target.value })}>
                    <option>Select</option>
                    <option>add</option>
                    <option>sub</option>
                    <option>mul</option>
                    <option>div</option>
                </select><br></br><br></br>
                <button onClick={this.GetResult}>Calculate</button>
                {/* <br></br>N1 {this.state.n1} N2 {this.state.n2} Op {this.state.option} */}
                <br></br>Result:{this.state.result}
            </div>
        );
    }
}
export default Calculator;