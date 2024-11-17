import React from 'react'
import './FormInput.css'
export default function FormInput(props) {
    return (
        <>
            <label htmlFor={props.idInput}>
                {props.label}
            </label>
            <input type="text" id={props.idInput} value={props.textoInput} 
                onChange={(e) => props.onChangeInput(e.target.value)}            
            />
        </>
    )
}