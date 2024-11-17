
import { StyleSheet } from 'react-native';

export const styles = StyleSheet.create({
    cabecalho: {
        width: '100%',
        height: '9vh',
        display: 'flex',
        alignItems: 'center',
        flexDirection: 'row',

    },
    textLogo: {
        fontSize: 20,
        fontWeight: 700,
        color: "#ca2467",
    },
    imageLogo: {
        width: 76,
        height: 76,
    },
    markerContainer: {
        position: 'absolute',
        right: -46,
        bottom: -5,
        width: 120,
    },
    markerText: {
        color: 'white',
        alignItems: 'center',
        justifyContent: "center",
        backgroundColor: '#ca2467',
        borderRadius: 8,
        display: 'flex',
        padding: 3,
        fontSize: 18,
        elevation: 1,
        shadowColor: '#000',
        shadowOffset: { width: 1, height: 3 },
        shadowOpacity: 0.5,
        shadowRadius: 7,
        marginBottom: 8,
        textAlign: "center",
    },
    markerMap: {
        marginLeft: 50,
        width: 45,
        height: 45
    },
    container: {
        flex: 1,
        paddingTop: 4,
        paddingLeft: 20,
        paddingRight: 20,
        backgroundColor: "#fff",
    },
    formContainer: {
        marginBottom: 20,
    },
    title: {
        fontSize: 28,
        fontWeight: "bold",
        textAlign: "center",
        color: "#3498db",
        marginBottom: 20,
    },
    label: {
        fontSize: 16,
        marginBottom: 5,
    },
    input: {
        height: 40,
        borderColor: "#bdc3c7",
        borderWidth: 1,
        marginBottom: 15,
        paddingHorizontal: 10,
        borderRadius: 5,
        fontSize: 16,
    },
    multilineInput: {
        height: 80,
        textAlignVertical: "top",
    },
    button: {
        backgroundColor: "#3498db",
        padding: 15,
        borderRadius: 5,
        alignItems: "center",
    },
    buttonText: {
        color: "#fff",
        fontSize: 16,
        fontWeight: "bold",
    },
    tabBar: {
        backgroundColor: "#17202A",
        height: 60,
    },
});