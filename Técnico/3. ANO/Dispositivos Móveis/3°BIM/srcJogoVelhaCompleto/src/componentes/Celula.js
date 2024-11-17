import React from 'react';
import { useWindowDimensions, View, Text } from 'react-native';
import { styles } from './Estilo';

const Celula = (props) => {
  const { height, width } = useWindowDimensions();
  const isPortrait = height > width;
  const tamanhoCelula = isPortrait ? (width / 3) - 45 : (height / 3) - 45;

  return (
    <View style={[styles.botao, { width: tamanhoCelula, height: tamanhoCelula }]}>
      <Text style={styles.jogada}>{props.valor}</Text>
    </View>
  );
};

export default Celula;
