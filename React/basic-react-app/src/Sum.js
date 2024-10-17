import { Component } from "react";

class Sum extends Component {
    constructor() {
        super();
        this.state = { n1: 0,
            n2:0,
            sum:0
         }
    }

    render() {
        return (
            <div>
                 <br></br>Enter First Number:
                 <input type="text" value={this.state.n1} onChange={(e) => this.setState({n1:e.target.value})}></input>
                 <br></br>Enter Second Number:
                 <input type="text" value={this.state.n2} onChange={(e) => this.setState({n2:e.target.value})}></input>
                 <br></br><button onClick={()=>this.setState({sum:parseInt(this.state.n1)+parseInt(this.state.n2)})}>Sum</button>
                 <p>Sum:{this.state.sum}</p>
            </div>
        )
    }
}
export default Sum;