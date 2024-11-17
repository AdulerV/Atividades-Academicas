import React from 'react'
import './Celula.css'
const Celula = (props) => {
    return (
        <button className='celula' onClick={props.onClick}>
            {props.valor}
        </button>
    )
}

export default Celula