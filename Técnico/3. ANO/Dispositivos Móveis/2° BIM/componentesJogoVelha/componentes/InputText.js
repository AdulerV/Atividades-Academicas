import React, { useState } from "react";

function InputText(props){

    const [texto, setTexto] = useState('Olá')

    function mudarTexto(e){
        const input = e.target
        const valor = input.value
        setTexto(valor)
    }

    return(
        <>
            <p>
                <input type='text' value={texto} onChange={mudarTexto}/>
            </p>
            <p>
                {texto}
            </p>
        </>
    )
}

export default InputText;