import { Component } from "react";
export default class Ternary extends Component {
    constructor() {
        super();
        this.state = {
            flag: false,
            input: "",
            result: ""
        };
    }
    handleResult=()=>{
        let n=parseInt(this.state.input)
        this.state.flag=true
        if(n%2===0){
            this.setState({result:"Even"})
        }
        else{
            this.setState({result:"Odd"})
        }
        
    }

    render() {
        return (
            <div>
                Enter the Number:<input type="text" value={this.state.input} onChange={(e)=>{this.setState({input:e.target.value,flag:false})}}></input><br></br>
                <button onClick={this.handleResult}>Submit</button>
                {
                    this.state.flag?
                    <p>
                         {this.state.result === "Even" ? <Even input={this.state.input}/>:<Odd input={this.state.input}/>}
                    </p>:''
                }
            </div>
        );
    }

}

function Even(props) {
    return (
        <b>{props.input} is Even</b>
    );
}
function Odd(props) {
    return (
        <b>{props.input} is Odd</b>
    );
}