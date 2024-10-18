import { Component } from "react"
export default class LifeCycle extends Component {
    constructor() {
        super();
        this.state = {
            count: 0
        }
    }

    componentDidMount() {

        document.getElementById("ResDiv").innerHTML="Component Did Mount Phase: Count is: "+this.state.count
    }
    // shouldComponentUpdate(){
    //     alert("Starting the Uodate")
    //     return true
    // }
    componentDidUpdate() {
        document.getElementById("ResDiv").innerHTML="Component Did Update Phase: Count is: "+this.state.count
    }
    render() {
        return (
            <div>
                <div id="ResDiv">
                     
                </div>
                <br></br><button onClick={()=>this.setState({count:this.state.count+1})}>Click Me</button>
                <br></br>Count:{this.state.count}
            </div>

        );
    }
}