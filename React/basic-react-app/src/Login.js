import { Component } from "react";

export default class Login extends Component {
    constructor() {
        super();
        this.state = {
            flag:false,
            userName: "",
            password: "",
            errName:"",
            errPass:""
        }
    }

    validateName = (uName) => {
        let reg = /^[0-9]+$/
        if (uName === "") {
            return "UserName is Required"
        }
        else if(!reg.test(uName)){
            return "Invalid UserName"
        }
        else{
            return null
        }
    }
    validatePass = (pass) => {
        let reg = /^[a-zA-Z]+$/
        if (pass === "") {
            return "Password is Required"
        }
        else if(!reg.test(pass)){
            return "Invalid Password"
        }
        else{
            return null
        }
    }
    changeName = (e) => {
        this.setState({ userName: e.target.value })
        let err = this.validateName(this.state.userName)
        this.setState({errName:err})
    }
    changePass = (e) => {
        this.setState({ password: e.target.value })
        let err = this.validatePass(this.state.password)
        this.setState({errPass:err})
    }

    handelResult = (e)=>{
        e.preventDefault();
        let err = this.validateName(this.state.userName)
        this.setState({errName:err})
        let err1 = this.validatePass(this.state.password)
        this.setState({errPass:err1})
        if(!err&&!err1){
            this.setState({flag:true})
        }

    }
    render() {
        return (
            < div>
                <form>
                    <label>User Name:</label><input type="text" value={this.state.userName} onChange={this.changeName}></input><br></br>
                    <br></br><font color="red"><b>{this.state.errName}</b></font><br></br>
                    <label>Password:</label><input type="password" value={this.state.password} onChange={this.changePass}></input><br></br>
                    <br></br><font color="red"><b>{this.state.errPass}</b></font><br></br>
                    <button onClick={this.handelResult}>Login</button>
                </form>
                {this.state.flag ?
                    <div>
                        <br></br><font color="green"><b>Login Successful</b></font>
                    </div>
                    : ''
                }
            </div>
        );
    }
}