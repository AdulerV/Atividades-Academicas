import React, { useState } from 'react'
import Cabecalho from './Cabecalho'
import Celula from './Celula'
import Rodape from './Rodape'

import './Jogo.css'
const Jogo = () => {

    const [vezJogador, setVezJogador] = useState('x')
    const [estadoTabuleiro, setEstadoTabuleiro] = useState(Array(9).fill(null))
    const [historicoJogadas, setHistoricoJogadas] = useState([])

    const handleClickCelula = (i) => {
        //Se a posição a ser jogada está vazia e não há um vencedor
        if (estadoTabuleiro[i] == null && fimJogo(estadoTabuleiro) == null) {
            let vez = vezJogador
            let jogada = [...estadoTabuleiro]
            let historico = [...historicoJogadas]

            jogada[i] = vez
            vez === 'x' ? vez = 'o' : vez = 'x'

            historico.push(jogada);

            //Verificando se após a jogada haverá um vencedor
            const vencedor = fimJogo(jogada);
            if (vencedor){
                alert(`Jogo acabou e o vencedor foi ${vencedor}`);
            }

            setVezJogador(vez)
            setEstadoTabuleiro(jogada)
            setHistoricoJogadas(historico)
        }
    }

    const fimJogo = (tab) => {
        if (tab[0] && tab[0] === tab[1] && tab[0] === tab[2]) return tab[0]
        if (tab[3] && tab[3] === tab[4] && tab[3] === tab[5]) return tab[3]
        if (tab[6] && tab[6] === tab[7] && tab[6] === tab[8]) return tab[6]
        if (tab[0] && tab[0] === tab[3] && tab[0] === tab[6]) return tab[0]
        if (tab[1] && tab[1] === tab[4] && tab[1] === tab[7]) return tab[1]
        if (tab[2] && tab[2] === tab[5] && tab[2] === tab[8]) return tab[2]
        if (tab[0] && tab[0] === tab[4] && tab[0] === tab[8]) return tab[0]
        if (tab[2] && tab[2] === tab[4] && tab[2] === tab[6]) return tab[2]
        return null
    }

    return (
        <div className='jogo'>
            <Cabecalho vez={vezJogador} />
            <div className='tabuleiro'>
                <div className='linhaTabuleiro'>
                    <Celula valor={estadoTabuleiro[0]} onClick={() => handleClickCelula(0)} />
                    <Celula valor={estadoTabuleiro[1]} onClick={() => handleClickCelula(1)} />
                    <Celula valor={estadoTabuleiro[2]} onClick={() => handleClickCelula(2)} />
                </div>
                <div className='linhaTabuleiro'>
                    <Celula valor={estadoTabuleiro[3]} onClick={() => handleClickCelula(3)} />
                    <Celula valor={estadoTabuleiro[4]} onClick={() => handleClickCelula(4)} />
                    <Celula valor={estadoTabuleiro[5]} onClick={() => handleClickCelula(5)} />
                </div>
                <div className='linhaTabuleiro'>
                    <Celula valor={estadoTabuleiro[6]} onClick={() => handleClickCelula(6)} />
                    <Celula valor={estadoTabuleiro[7]} onClick={() => handleClickCelula(7)} />
                    <Celula valor={estadoTabuleiro[8]} onClick={() => handleClickCelula(8)} />
                </div>
            </div>
            <Rodape historico={historicoJogadas}/>

        </div>
    )
}
export default Jogo