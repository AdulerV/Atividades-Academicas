import { React, useState } from 'react';
import { View, useWindowDimensions, Pressable } from 'react-native';
import Cabecalho from './Cabecalho';
import { styles } from './Estilo';
import Rodape from './Rodape';
import { StatusBar } from 'expo-status-bar';
import Celula from './Celula';

export default function Jogo() {
  const [vezJogador, setVezJogador] = useState('X')
  const [estadoTabuleiro, setEstadoTabuleiro] = useState(Array(9).fill(null))
  const [historicoJogadas, setHistoricoJogadas] = useState([])
  const { height, width } = useWindowDimensions();
  const isPortrait = height > width;

  const handleClickCelula = (i) => {
    //Se a posição a ser jogada está vazia e não há um vencedor
    if (estadoTabuleiro[i] == null && fimJogo(estadoTabuleiro) == null) {
      let vez = vezJogador
      let jogada = [...estadoTabuleiro]
      let historico = [...historicoJogadas]
      let cont = 0

      jogada[i] = vez
      vez === 'X' ? vez = 'O' : vez = 'X'

      historico.push(jogada);

      //Verificando se após a jogada haverá um vencedor
      setVezJogador(vez)
      setEstadoTabuleiro(jogada)
      setHistoricoJogadas(historico)

      const vencedor = fimJogo(jogada);
      if (vencedor) {
        alert(`Jogo acabou e o vencedor foi ${vencedor}`);
      }

      for (let i = 0; i < estadoTabuleiro.length; i++) {
        if (estadoTabuleiro[i]) cont++;
      }
      if (cont === 8 && vencedor === null) alert('Deu velha!!')
    }
  }

  const voltarJogada = (ind) => {
    const vez = ind % 2 === 0 ? 'O' : 'X';
    const historico = historicoJogadas.slice(0, ind + 1);
    const tabuleiro = historicoJogadas[ind];
    setVezJogador(vez);
    setHistoricoJogadas(historico);
    setEstadoTabuleiro(tabuleiro);
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
    <View style={[styles.container, isPortrait ? styles.retrato : styles.paisagem]}>
      <View style={[styles.cabecalho, isPortrait ? styles.cabecalhoRetrato : styles.cabecalhoPaisagem]}>
        <Cabecalho vez={vezJogador} />
      </View>
      <View style={styles.meio}>
        <View style={styles.linhaTabuleiro}>
          <Pressable onPressOut={() => handleClickCelula(0)}><Celula valor={estadoTabuleiro[0]} /></Pressable>
          <Pressable onPressOut={() => handleClickCelula(1)}><Celula valor={estadoTabuleiro[1]} /></Pressable>
          <Pressable onPressOut={() => handleClickCelula(2)}><Celula valor={estadoTabuleiro[2]} /></Pressable>
        </View>
        <View style={styles.linhaTabuleiro}>
          <Pressable onPressOut={() => handleClickCelula(3)}><Celula valor={estadoTabuleiro[3]} /></Pressable>
          <Pressable onPressOut={() => handleClickCelula(4)}><Celula valor={estadoTabuleiro[4]} /></Pressable>
          <Pressable onPressOut={() => handleClickCelula(5)}><Celula valor={estadoTabuleiro[5]} /></Pressable>
        </View>
        <View style={styles.linhaTabuleiro}>
          <Pressable onPressOut={() => handleClickCelula(6)}><Celula valor={estadoTabuleiro[6]} /></Pressable>
          <Pressable onPressOut={() => handleClickCelula(7)}><Celula valor={estadoTabuleiro[7]} /></Pressable>
          <Pressable onPressOut={() => handleClickCelula(8)}><Celula valor={estadoTabuleiro[8]} /></Pressable>
        </View>
      </View>
      <View style={[styles.rodape, isPortrait ? styles.rodapeRetrato : styles.rodapePaisagem]}>
        <Rodape style={styles.texto} historico={historicoJogadas} voltarJogada={voltarJogada} />
      </View>
      <StatusBar hidden />
    </View>
  );
};

