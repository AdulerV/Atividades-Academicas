import React from 'react'
import './FormSelect.css'
export default function FormSelect(props) {
    let options;
    if (props.opcoesSelect) {
        options = props.opcoesSelect.map(
            opt =>
                <option value={opt.value} key={opt.value}>
                    {opt.text}
                </option>
        )
    }
    return (
        <>
            <label htmlFor={props.idSelect}>{props.label}</label>
            <select type="text" id={props.idSelect} value={props.opcaoSelecionada}
            onChange={(e) => props.onChangeSelect(e.target.value)}
            >
                {options}
            </select>
        </>
    )
}