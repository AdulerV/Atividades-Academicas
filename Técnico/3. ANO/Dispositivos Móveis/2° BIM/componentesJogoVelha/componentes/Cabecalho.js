import React from 'react'
import './Cabecalho.css'
const Cabecalho = (props) => {
    return (
        <header className='cabecalho'>
            <h1>Jogo da Velha</h1>
            <p>Vez de Jogador: {props.vez}</p>
        </header>
    )
}
export default Cabecalho