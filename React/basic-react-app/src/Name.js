import { useState } from "react";

export default function Name(){
     const [name,setName]=useState("")

     let changeName=(e)=>{
        setName(e.target.value)
     }

     return(
        <div>
            Enter your Name<input type="text" onChange={changeName}></input>
            <h1>Welcome:{name}</h1>
        </div>
    );
}