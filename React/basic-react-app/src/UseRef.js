import { useRef } from "react";

export default function UseRef(){
    const myRef=useRef();

    const handleClick  =()=>myRef.current.focus();

    return(
        <div>
            <input ref={myRef} type="text"></input>
            <button onClick={handleClick}>Focus Input</button>
        </div>
    );

    

}