import React from 'react'
import Jogada from './Jogada'
import './Rodape.css'
const Rodape = (props) => {
    const jogadas = props.historico.map (
        (jogada) => <Jogada jogada={jogada} />
    )

    return (
        <footer className='rodape'>
            <p>Histórico de jogadas:</p>
            {jogadas}
        </footer>
    )
}
export default Rodape