import { Component } from "react";
import axios from "axios";
import "./Crop.css";
import Crop from "../model/Crop";
export default class InsertCrop extends Component {
    constructor() {
        super();
        this.state = {
            flag: false,
            cid: "",
            cname: "",
            culper: "",
            harcap: "",
            errId: "",
            errName: "",
            errCult: "",
            errHarv: ""
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

    validationName = (cname) => {
        let reg = /^[a-zA-Z]+$/;
        if (cname === "") {
            return "Crop Name is Required";
        }
        else if (!reg.test(cname)) {
            return "Invalid Crop Name";
        }
        else {
            return null;
        }
    }

    validationCult = (culper) => {
        let reg = /^[0-9]+$/
        if (culper === "") {
            return "Cultivation Period is Required";
        }
        else if (!reg.test(culper)) {
            return "Invalid Cultivation Period";
        }
        else
            return null;
    }

    validationHarv = (harcap) => {
        let reg = /^[0-9]+$/
        if (harcap === "") {
            return "Harvest Capacity is Required";
        }
        else if (!reg.test(harcap)) {
            return "Invalid Harvest Capacity";
        }
        else
            return null;
    }

    changeId = (e) => {
        this.setState({ cid: e.target.value });
        let error = this.validationId(this.state.cid);
        this.setState({ errId: error });
    }
    changeName = (e) => {
        this.setState({ cname: e.target.value });
        let error = this.validationName(this.state.cname);
        this.setState({ errName: error });
    }
    changeCult = (e) => {
        this.setState({ culper: e.target.value });
        let error = this.validationCult(this.state.culper);
        this.setState({ errCult: error });
    }
    changeHarv = (e) => {
        this.setState({ harcap: e.target.value });
        let error = this.validationHarv(this.state.harcap);
        this.setState({ errHarv: error });
    }

    HandleResult = (e) => {
        e.preventDefault();
        let err = this.validationId(this.state.cid);
        this.setState({ errId: err });

        let err1 = this.validationName(this.state.cname);
        this.setState({ errName: err1 });

        let err2 = this.validationCult(this.state.culper);
        this.setState({ errCult: err2 });

        let err3 = this.validationHarv(this.state.harcap);
        this.setState({ errHarv: err3 });

        if (!err && !err1 && !err2 && !err3) {
            this.setState({ flag: true });

            let crp = new Crop();
            crp.setId(this.state.cid);
            crp.setName(this.state.cname);
            crp.setCult(this.state.culper);
            crp.setHarv(this.state.harcap);

            axios.post("http://localhost:3004/crops", crp)
                .then(() => {
                     document.getElementById("res").innerHTML="<b>Object Saved Successfully</b>";
                }
                )
            e.preventDefault();
        }

    }

    render() {
        return (
               <div id="myForm">
                <div class="container" >
                    <h1>Crop Harvest Mangement System</h1>
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label for="first" class="fw-bold">Enter Crop Id:</label>
                            <input type='text' value={this.state.cid} onChange={this.changeId} class="form-control border border-info"></input>
                            <font color="red"><b>{this.state.errId}</b></font>
                        </div>
                        <div class="form-group">
                            <label for="second" class="fw-bold">Enter Crop Name/Crop type:</label>
                            <input type='text' value={this.state.cname} onChange={this.changeName} class="form-control border border-info"></input>
                            <font color="red" id="in"><b>{this.state.errName}</b></font>
                        </div>
                        <div class="form-group">
                            <label for="third" class="fw-bold">Enter Cultivation Period in Months:</label>
                            <input type='text' value={this.state.culper} onChange={this.changeCult} id="in" class="form-control border border-info"></input>
                            <font color="red" id="in"><b>{this.state.errCult}</b></font>
                        </div>
                        <div class="form-group">
                            <label for="third" class="fw-bold">Enter Harvest Capacity in Kg:</label>
                            <input type='text' value={this.state.harcap} onChange={this.changeHarv} id="in" class="form-control border border-info"></input>
                            <font color="red" id="in"><b>{this.state.errHarv}</b></font>
                        </div>
                        <button onClick={this.HandleResult} id="bt" class="btn btn-primary">Insert</button>&nbsp;
                        <br></br><br></br>

                    </form>
                    {this.state.flag ?

                        <div id="res">

                        </div>
                        : ''
                    }
                </div>
            </div>
        );
    }

}