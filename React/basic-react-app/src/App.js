import {Component} from 'react';
class App extends Component{
  render(){
    return(
      <div>
        <label for="first">Enter First Number:</label>
        <input type='text' id="first"></input><br></br><br></br>
        <label for="second">Enter Second Number:</label>
        <input type='text' id="second"></input><br></br><br></br>
        <label for="second">Select Option:</label>
        <select>
          <option>select</option>
          <option>+</option>
          <option>-</option>
          <option>*</option>
          <option>/</option>
        </select><br></br><br></br>
        <button>Calculate</button>
        </div>
    );
  }
}

export default App;

// import './App.css';
// import Child2 from './Child2';
// import {Component} from 'react';

// function App() {
//   return (
//     <div class="App1">
//     <h1>Welcome to React</h1>
//     <Child></Child>
//     </div>
//   );
// }
// function Child() {
//   return (
//     <div class="Child">
//     <b>Child Functional component</b><br></br>
//     <Child1></Child1>
//     </div>

//   );
// }
// function Child1() {
//   return (
//     <div class="Child1">
//     <b>Child1 Functional component</b><br></br>
//     <Child3></Child3>
//     </div>
//   );
// }

// class Child3 extends Component{
//   render(){
//     return(<>
//       <h1>Welcome I am Child3</h1>
//       <Child4></Child4>
//       </>
//     );
//   }

// }
// class Child4 extends Component{
//   render(){
//     return(
//       <>
//       <h1>Welcome I am Child4</h1>
//       <Child2></Child2>
//       </>
//     );
//   }

// }

// export default App;
