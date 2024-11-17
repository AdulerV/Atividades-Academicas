import { useEffect, useState } from 'react';
import { Alert, StyleSheet, Text, TouchableOpacity, View, TextInput } from 'react-native';
import { saveItem, alterItem } from './data';
export default function Formulario({ navigation, route }) {

    const [descricao, setDescricao] = useState('')
    const [quantidade, setQuantidade] = useState('')

    // useEffect (() => {
    //     AsyncStorage.getItem('item').then(setValue) 
    // }, [])

    const handleButtonPress = async () => {
        if ((descricao.trim() != "") && (quantidade.trim() != "")) {
            const itemList = {
                id: new Date().getTime(),
                descricao: descricao,
                quantidade: parseInt(quantidade),
            }

            if (!route.params) {
                await saveItem(itemList)
                route.params = null
            }
            else {
                itemList.id = route.params.id
                await alterItem(itemList)
                route.params = null
            }

            setDescricao('')
            setQuantidade('')
            navigation.navigate('List', itemList)
        } else {
            Alert.alert(
                'Insira os valores corretamente'                
            );
        }
    } 

    useEffect(() => {
        setDescricao(route.params ? route.params.descricao : '');
        setQuantidade(route.params ? String(route.params.quantidade) : '');
    }, [route.params])


    return (
        <View style={styles.container}>
            <Text style={styles.title}>
                Item para comprar
            </Text>
            <View style={styles.inputContainer}>
                <TextInput
                    selectionColor='black'
                    style={styles.input}
                    placeholder='O que está faltando em casa?'
                    value={descricao}
                    onChangeText={(value) => { setDescricao(value) }} />


                <TextInput
                    selectionColor='black'
                    style={styles.input}
                    placeholder='Digite a quantidade'
                    keyboardType='numeric'
                    value={quantidade}
                    onChangeText={setQuantidade} />


                <TouchableOpacity style={styles.button} onPress={handleButtonPress} >
                    <Text style={styles.buttonText}>{!route.params ? "Salvar" : "Editar"}</Text>
                </TouchableOpacity>
            </View>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#20B2AA',
        alignItems: 'center',
        justifyContent: 'center',
    },
    title: {
        color: 'aliceblue',
        fontSize: 26,
        fontWeight: 'bold',
        marginTop: 40,
    },
    inputContainer: {
        flex: 1,
        marginTop: 20,
        width: '90%',
        padding: 20,
        borderRadius: 20,
        backgroundColor: 'aliceblue',
        marginBottom: 30,
    },
    input: {
        marginTop: 10,
        height: 60,
        backgroundColor: '#dce9f5',
        borderRadius: 10,
        paddingHorizontal: 24,
        fontSize: 16,
    },
    button: {
        marginTop: 10,
        height: 60,
        backgroundColor: 'blue',
        borderRadius: 10,
        paddingHorizontal: 24,
        alignItems: 'center',
        justifyContent: 'center',
    },
    buttonText: {
        color: 'aliceblue',
        fontWeight: 'bold',
        fontSize: 18,
    }
});