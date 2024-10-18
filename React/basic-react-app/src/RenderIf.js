export default function RenderIf(props){
    let n=props.input;

    if(n%2===0){
        return <Even input={n}></Even>
    }
    else{
        return <Odd input={n}></Odd>
    }

}

function Even(props){
    return(
        <b>{props.input} is Even</b>
    );
}
function Odd(props){
    return(
        <b>{props.input} is Odd</b>
    );
}