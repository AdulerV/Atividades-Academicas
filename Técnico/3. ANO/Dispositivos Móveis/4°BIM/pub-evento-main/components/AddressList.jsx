import React, { useState, useEffect } from "react";
import { View, Text, ScrollView, StyleSheet } from "react-native";
import ItemList from "./ItemList";
import { getLista } from "./data";

export default function AddressList(props) {
    const [itens, setItens] = useState([]);

    useEffect(() => {
        async function obterDados() {
            const dados = await getLista();
            setItens(dados);
        }
        obterDados();
    }, [props]);

    const handleUpdateList = async () => {
        const dados = await getLista();
        setItens(dados);
    };

    return (
        <View style={styles.container}>
            <ScrollView contentContainerStyle={styles.scrollViewContent}>
                {itens.map((itemAtual) => (
                    <ItemList
                        key={itemAtual.id}
                        nomeEvento={itemAtual.nomeEvento}
                        descricao={itemAtual.descricao}
                        rua={itemAtual.rua}
                        numero={itemAtual.numero}
                        bairro={itemAtual.bairro}
                        cidade={itemAtual.cidade}
                        estado={itemAtual.estado}
                        id={itemAtual.id}
                        onUpdate={handleUpdateList}
                    />
                ))}
                {itens.length === 0 && (
                    <Text style={styles.noItemsText}>Nada por enquanto</Text>
                )}
            </ScrollView>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: "#f8f8f8",
    },
    scrollViewContent: {
        paddingHorizontal: 20,
        paddingTop: 20,
    },
    noItemsText: {
        textAlign: "center",
        marginTop: 20,
        fontSize: 16,
        color: "gray",
    },
});
