//setState

import { Component } from "react";

class Update extends Component {
    constructor() {
        super();
        this.state = { name: "" }
    }

    render() {
        return (
            <div>
                 <br></br>Enter the Name:
                 <input type="text" value={this.state.name} onChange={(e) => this.setState({name:e.target.value})}></input>
                 <br></br>Welcome {this.state.name}
            </div>
        )
    }
}
export default Update;