import { Component } from "react";
import axios from "axios";
import "./Crop.css";
import Crop from "../model/Crop";
export default class DeleteCrop extends Component {
    
    constructor() {
        super();
        this.state = {
            flag: false,
            cid: "",
            errId: ""
        }
    }

    validationId = (cid) => {
        let reg = /^[0-9]+$/
        if (cid === "") {
            return "CropId is Required";
        }
        else if (!reg.test(cid)) {
            return "Invalid CropId";
        }
        else
            return null;
    }

    changeId = (e) => {
        this.setState({ cid: e.target.value });
        let error = this.validationId(this.state.cid);
        this.setState({ errId: error });
    }

    HandleResult = (e) => {
        let err = this.validationId(this.state.cid);
        this.setState({ errId: err });

        if (!err) {
            this.setState({ flag: true });

            let crp = new Crop();
            crp.setId(this.state.cid);

            axios.delete("http://localhost:3004/crops/"+this.state.cid)
                .then(() => {
                     document.getElementById("res").innerHTML="<b>Object Deleted Successfully</b>";
                })
            e.preventDefault();
        }

    }

    render() {
        return (
            <div id="myForm">
                <div class="container">
                    <h1>Crop Harvest Mangement System</h1>
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label id="lb" class="fw-bold">Enter Crop Id</label>
                            <input type="text" value={this.state.cid} class="form-control border border-info" onChange={this.changeId}></input>
                            <font color="red"><b>{this.state.errId}</b></font>
                        </div>
                        <button id="bt" class="btn btn-danger" onClick={this.HandleResult}>Delete</button>
                    </form>
                    {
                        this.state.flag ?
                        <div id="res">

                        </div>:""
                    }
                </div>
            </div>
        );
    }

}