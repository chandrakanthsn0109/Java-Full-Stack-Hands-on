import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import InsertEmpDep from './InsertEmpDep';
import UpdateEmpDep from './UpdateEmpDep';
import DeleteEmpDep from './DeleteEmpDep';
import FindEmpDep from './FindEmpDep';
import FindAllEmpDep from './FindAllEmpDep';
import { Component } from "react";
export default class EmpDepHome extends Component {
    render() {
        return (
            <BrowserRouter>
                <div>
                    <h1 align="center">CRUD Operations</h1>
                    <nav align="right">
                    <Link class="btn btn-primary" to="/insert">Insert</Link>&nbsp;&nbsp;
                    <Link class="btn btn-success" to="/update">Update</Link>&nbsp;&nbsp;
                    <Link class="btn btn-danger" to="/delete">Delete</Link>&nbsp;&nbsp;
                    <Link class="btn btn-warning" to="/find">Find</Link>&nbsp;&nbsp;
                    <Link class="btn btn-info" to="/findAll">FindAll</Link>&nbsp;&nbsp;
                    </nav> 
                </div>
                <br></br>
                <Routes>
                    <Route path="/insert" element={<InsertEmpDep></InsertEmpDep>}></Route>
                    <Route path="/update" element={<UpdateEmpDep></UpdateEmpDep>}></Route>
                    <Route path="/delete" element={<DeleteEmpDep></DeleteEmpDep>}></Route>
                    <Route path="/find" element={<FindEmpDep></FindEmpDep>}></Route>
                    <Route path="/findAll" element={<FindAllEmpDep></FindAllEmpDep>}></Route>
                </Routes>
            </BrowserRouter>
        );
    }
}