import './Child2.css';
import {Component} from "react";

//Child component in different file
// function Child2() {
//     return (
//       <b class="Test">Child2 Functional component</b>
//     );
//   }
// export default Child2;


class Child2 extends Component {
  render() {
    return (
      <div>
        Name:{this.props.name}
        <br></br>Email:{this.props.email}
        <Child1></Child1>
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
export default Child2;

