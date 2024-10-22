import { Component } from "react";
import axios from "axios";
import "./Crop.css";
export default class FindAllCrops extends Component {
    constructor() {
        super();
        this.state = {
            flag: false,
            crop: [],
            msg: ""
        }
    }

    HandleResult = (e) => {
        this.setState({flag:true});
        axios.get("http://localhost:3004/crops")
            .then((response) => {
                this.setState({ crop: response.data, msg: "<b>Objects Fetched Successfully</b>" })
            })
        e.preventDefault();
    }

    render() {
        return (
            <div id="myForm">
                <div class="container">
                    <h1>Crop Harvest Mangement System</h1>
                    <form class="form-horizontal">
                        <button class="btn btn-info" id="bt" onClick={this.HandleResult}>FindAll</button>
                    </form>
                    {
                        this.state.flag ?
                            <table class="findAll">
                                <tr>
                                    <th>CropId</th>
                                    <th>CropName</th>
                                    <th>Cultivation Period in Months</th>
                                    <th>Harvest Capacity in Kg</th>
                                </tr>
                                {this.state.crop.map((crop)=>(
                                <tr key={crop.id}>
                                    <td>{crop.id}</td>
                                    <td>{crop.name}</td>
                                    <td>{crop.culper}</td>
                                    <td>{crop.harcap}</td>
                                </tr>))}
                            </table>: ""
                    }
                </div>
            </div>
        );
    }

}