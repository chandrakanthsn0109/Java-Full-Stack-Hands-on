export default function LogicalAnd(props) {
    let n = props.input;
    return (
        <div>
            {n % 2 === 0 && <Even input={n}></Even>}
            {n % 2 !== 0 && <Odd input={n}></Odd>}
        </div>
    );

}

function Even(props) {
    return (
        <b>{props.input} is Even</b>
    );
}
function Odd(props) {
    return (
        <b>{props.input} is Odd</b>
    );
}