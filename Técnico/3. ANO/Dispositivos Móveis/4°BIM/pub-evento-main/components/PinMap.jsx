import React from 'react'
import { styles } from './Styles';
import { View, Image, TextInput } from 'react-native';

export default function pinMap({ texto }) {
  return (
    <View style={styles.markerContainer}>
      <TextInput multiline={true} value={texto} style={styles.markerText}></TextInput>
      <Image source={require('../images/pin-marker.png')} style={styles.markerMap} />
    </View>
  )
}
