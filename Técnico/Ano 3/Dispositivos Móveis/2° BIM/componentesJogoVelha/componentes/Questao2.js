
import { useRef, useState } from "react";


export default function Questao1(props){
    const select = useRef(null);
    const [corFundo, setCorFundo] = useState('white');

    function mudarCor(e){
        const valor = select.current.value;
        setCorFundo(valor);
    }

    return (
        <div style={{backgroundColor: corFundo}}>
            <select ref={select} onChange={mudarCor}>
                <option value="white">Selecione um cor</option>
                <option value="red">vermelho</option>
                <option value="blue">azul</option>
                <option value="green">verde</option>
                <option value="yellow">amarelo</option>
            </select>
        </div>
    )
}