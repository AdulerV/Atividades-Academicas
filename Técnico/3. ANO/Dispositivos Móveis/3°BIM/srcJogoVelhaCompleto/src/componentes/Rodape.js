import React from 'react';
import { View, Text, ScrollView, useWindowDimensions } from 'react-native';
import { styles } from './Estilo';
import Jogada from './Jogada';

const Rodape = (props) => {
  const jogadas = props.historico.map(
    (jogada, ind) => <Jogada jogada={jogada} voltarJogada={() => props.voltarJogada(ind)} />
  )

  const { height, width } = useWindowDimensions();
  const isPortrait = height > width;

  if (isPortrait) {
    return (
      <View >
        <Text style={styles.texto}>histórico de jogadas:</Text>
        <ScrollView style={styles.texto} horizontal>{jogadas}</ScrollView>
      </View>
    );
  } else {
    return (
      <View >
        <Text style={styles.texto}>histórico de jogadas:</Text>
        <ScrollView style={styles.texto} vertical>{jogadas}</ScrollView>
      </View>
    );
  }
};
export default Rodape;