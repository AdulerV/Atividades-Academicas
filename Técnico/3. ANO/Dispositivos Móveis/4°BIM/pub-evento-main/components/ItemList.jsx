import React from "react";
import { StyleSheet, Text, TouchableOpacity, View } from "react-native";
import { removerItem } from "./data";
import { useNavigation } from "@react-navigation/native";

export default function ItemList({
    id,
    nomeEvento,
    descricao,
    rua,
    numero,
    bairro,
    cidade,
    estado,
    onUpdate,
}) {
    const navigation = useNavigation();

    const handleDelete = async () => {
        await removerItem(id);
        if (onUpdate) {
            onUpdate();
            navigation.navigate('Mapa',id);
        }
    };

    return (
        <View style={styles.container}>
            <Text style={styles.eventName}>{nomeEvento}</Text>
            <Text style={styles.description}>{descricao}</Text>
            <View style={styles.addressContainer}>
                <Text style={styles.addressText}>{`${rua}, ${numero} - ${bairro}, ${cidade} - ${estado} `}</Text>
            </View>
            <TouchableOpacity style={styles.deleteButton} onPress={handleDelete}>
                <Text style={styles.deleteButtonText}>Excluir</Text>
            </TouchableOpacity>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: "#fff",
        borderRadius: 8,
        padding: 15,
        marginBottom: 10,
        shadowColor: "#000",
        shadowOffset: { width: 0, height: 2 },
        shadowOpacity: 0.2,
        shadowRadius: 2,
        elevation: 3,
    },
    eventName: {
        fontSize: 20,
        fontWeight: "bold",
        marginBottom: 5,
    },
    description: {
        fontSize: 16,
        marginBottom: 10,
    },
    addressContainer: {
        marginBottom: 10,
    },
    addressText: {
        fontSize: 16,
    },
    deleteButton: {
        backgroundColor: "#e74c3c",
        padding: 10,
        borderRadius: 5,
        alignItems: "center",
    },
    deleteButtonText: {
        color: "#fff",
        fontSize: 16,
    },
});
