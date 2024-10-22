import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import InsertEmployee from './InsertEmpolyee';
import UpdateEmployee from './UpdateEmployee';
import DeleteEmployee from './DeleteEmployee,';
import FindEmployee from './FindEmployee';
import FindAllEmployee from './FindAllEmployee';
import { Component } from "react";
export default class EmployeeHome extends Component {
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
                    <Link class="btn btn-info" to="/findAll">FindAll</Link>&nbsp;&nbsp;</nav>
                </div>
                <br></br>
                <Routes>
                    <Route path="/insert" element={<InsertEmployee></InsertEmployee>}></Route>
                    <Route path="/update" element={<UpdateEmployee></UpdateEmployee>}></Route>
                    <Route path="/delete" element={<DeleteEmployee></DeleteEmployee>}></Route>
                    <Route path="/find" element={<FindEmployee></FindEmployee>}></Route>
                    <Route path="/findAll" element={<FindAllEmployee></FindAllEmployee>}></Route>
                </Routes>
            </BrowserRouter>
        );
    }
}