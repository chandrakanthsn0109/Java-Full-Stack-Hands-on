import { Component } from "react";
class Child3 extends Component {
    constructor(props){
        super(props);
        this.state={
            age:22,
            father_name:"Nagaraju",
            location:"Chennai"
        }
    }
    render() {
      return (
        <div>
          Name:{this.props.name}
          <br></br>Age:{this.state.age}
          <br></br>Father Name:{this.state.father_name}
          {/* passing state as a value to another component */}
          <Child1 location={this.state.location}></Child1>
        </div>
      );
    }
  }
  
  function Child1(props){
    return(<div>
      I am Child1 Component
      <br></br>Location:{props.location}
    </div>);
  }
  Child1.defaultProps={
    location:"Karnataka"
  }
  export default Child3;