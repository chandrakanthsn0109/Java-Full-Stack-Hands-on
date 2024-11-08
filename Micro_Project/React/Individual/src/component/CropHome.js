import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import InsertCrop from './InsertCrop';
import UpdateCrop from './UpdateCrop';
import DeleteCrop from './DeleteCrop';
import FindCrop from './FindCrop';
import FindAllCrops from './FindAllCrops';
import { Component } from "react";
export default class CropHome extends Component {
    render() {
        return (
            <div class="br">
                <BrowserRouter>
                    <div class="br">
                    <h1 color="blueviolet">CRUD OPERATIONS</h1>
                    <nav align="right"><Link class="btn btn-primary" to="/insert">Insert</Link>&nbsp;&nbsp;
                    <Link class="btn btn-success" to="/update">Update</Link>&nbsp;&nbsp;
                    <Link class="btn btn-danger" to="/delete">Delete</Link>&nbsp;&nbsp;
                    <Link class="btn btn-warning" to="/find">Find</Link>&nbsp;&nbsp;
                    <Link class="btn btn-info" to="/findAll">FindAll</Link>&nbsp;&nbsp;</nav>
                    <br></br>
                    <Routes>
                        <Route path="/insert" element={<InsertCrop></InsertCrop>}></Route>
                        <Route path="/update" element={<UpdateCrop></UpdateCrop>}></Route>
                        <Route path="/delete" element={<DeleteCrop></DeleteCrop>}></Route>
                        <Route path="/find" element={<FindCrop></FindCrop>}></Route>
                        <Route path="/findAll" element={<FindAllCrops></FindAllCrops>}></Route>
                    </Routes>
                    </div>
                </BrowserRouter>
            </div>
        );
    }
}