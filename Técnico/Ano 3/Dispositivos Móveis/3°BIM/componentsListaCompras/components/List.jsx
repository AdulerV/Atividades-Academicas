import { StyleSheet, Text, View, ScrollView } from 'react-native';
import { useState } from 'react/cjs/react.development';
import ItemList from './ItemList';
import { useEffect } from 'react';
import { getList } from './data';

export default function List({navigation, route }) {
    const [itens, setItens] = useState([]);
    useEffect(() => {
        getList().then(setItens)

        // async function obtainData() {
        //     const data = await getList()
        //     setItens(data)
        // }

        // obtainData()
    }, [itens])

    return (
        <View style={styles.container}>
            <Text style={styles.title}>Lista de Compras</Text>
            <ScrollView
                style={styles.scrollContainer}
                contentContainerStyle={styles.itemsContainer}
            >
                {itens.map((item) => <ItemList key={item.id} navigation={navigation} item={item} id={route.params} />)}
                {itens.length == 0 && <Text style={styles.text}>Lista Vazia</Text>}
            </ScrollView>
        </View>
    );
}


const styles =
    StyleSheet.create({
        container: {
            backgroundColor: "#20B2AA",
            alignItems: "center",
            justifyContent: "center",
            flex: 1,
        },
        title: {
            color: '#fff',
            fontSize: 20,
            fontWeight: 'bold',
            marginTop: 30,
            marginBottom: 10,
        },
        scrollContainer: {
            width: '85%',
            marginBottom: 20,
        },
        itemsContainer: {
            padding: 20,
            borderRadius: 15,
            alignItems: 'stretch',
            backgroundColor: '#fff',
        },
        text: {
            textAlign: 'center',
            fontSize: 20,
        }
    });