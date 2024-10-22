import "./ReactCss.css"
export default function ReactCss(){
    let myStyle={color:'blue',background:"yellow"};

    return(
        <>
        <h1 style={{color:"red",background:"yellow"}}>Css Inline Styling</h1>
        <h1 style={myStyle}>Css Styling using Javascript Object</h1>
        <h1 class="test">Styling using External Css</h1>
        </>
    );
}