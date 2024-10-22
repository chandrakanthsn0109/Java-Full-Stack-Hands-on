import { useEffect, useState } from "react";

export default function Counter(){
    const [count,setCount]=useState(0);
   //to perform life cycle in function component
   useEffect(()=>{
    document.getElementById("ResDiv").innerHTML="You Clicked "+count+" times"
   })

   return (
    <div>
        <div id="ResDiv">
             
        </div>
        <br></br><button onClick={()=>setCount(count+1)}>Click Me</button>
        <br></br>Count:{count}
    </div>

);

    

}