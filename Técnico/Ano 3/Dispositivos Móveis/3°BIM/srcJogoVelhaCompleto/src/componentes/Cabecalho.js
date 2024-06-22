import React from 'react';
import { View, Text } from 'react-native';
import { styles } from './Estilo';
const Cabecalho = (props) => {
  return (
    <View>
      <Text style={styles.titulo}>jogo da velha</Text>
      <Text></Text>
      <Text style={styles.texto}>vez de jogador: {props.vez}</Text>
      <Text></Text>
    </View>
  );
};

export default Cabecalho; 