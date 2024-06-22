import React from 'react';
import { View, Text, Pressable} from 'react-native';
import { styles } from './Estilo';
const Jogada = (props) => {
  const jogada = props.jogada
  return (
    <Pressable style={styles.historico} onPress={props.voltarJogada}>
      <Text style={styles.texto}>{jogada[0] || '_'} | {jogada[1] || '_'} | {jogada[2] || '_'}</Text>
      <Text style={styles.texto}>{jogada[3] || '_'} | {jogada[4] || '_'} | {jogada[5] || '_'}</Text>
      <Text style={styles.texto}>{jogada[6] || '_'} | {jogada[7] || '_'} | {jogada[8] || '_'}</Text>
    </Pressable>
  );
};
export default Jogada;