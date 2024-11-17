import { Alert, StyleSheet, Text, TouchableOpacity, View, } from "react-native";
import { excluirItem } from "./data";
export default function ItemList({navigation, item, id }) {

    function handleButtonPressEdit() {
        navigation.navigate('Form', item)
    }

    function handleButtonPressDelet() {
        Alert.alert(
            'Tem Certeza que deseja excluir o',
            item.descricao,
            [
                {text: 'Sim',  onPress: () => excluirItem(item),  style: 'default'},
                {text: 'Não',  style: 'cancel'},
            ],
            {cancelable: true},
        );
    }

    return (
        <View style={styles.container}>
            {(id?.id) == item.id && <Text style={{ color: "red" }}>NEW</Text>}
            <Text style={styles.textDesc}>{item.descricao}</Text>
            <View style={styles.lineTwo}>
                <Text style={styles.textQuant}>{item.quantidade}</Text>
                <View style={styles.buttonsContainer}>
                    <TouchableOpacity style={styles.editButton} onPress={handleButtonPressEdit} >
                        <Text style={styles.buttonText}>Editar</Text>
                    </TouchableOpacity>
                    <TouchableOpacity style={styles.deleteButton} onPress={handleButtonPressDelet}>
                        <Text style={styles.buttonText}>X</Text>
                    </TouchableOpacity>
                </View>
            </View>
        </View>
    );
}

const styles = StyleSheet.create({
    lineTwo: {
        flexDirection: "row",
        justifyContent: "space-between",
    },
    container: {
        backgroundColor: "#fff",
        marginTop: 10,
        width: "100%",
    },
    buttonsContainer: {
        flexDirection: "row",
        justifyContent: "flex-end",
        paddingBottom: 10,
    },
    editButton: {
        marginLeft: 10,
        height: 40,
        backgroundColor: "blue",
        borderRadius: 10,
        padding: 10,
        fontSize: 12,
        elevation: 10,
        shadowOpacity: 10,
        shadowColor: "#ccc",
        alignItems: "center",
    },
    deleteButton: {
        marginLeft: 10,
        height: 40,
        width: 40,
        backgroundColor: "red",
        borderRadius: 10,
        padding: 10,
        fontSize: 12,
        elevation: 10,
        shadowOpacity: 10,
        shadowColor: "#ccc",
        alignItems: "center",
    },
    buttonText: {
        color: '#fff',
        fontWeight: "bold",
    },
    textDesc: {
        fontSize: 20,
        paddingBottom: 3,
    },
    textQuant: {
        paddingTop: 5,
        fontSize: 20,
    },
});    