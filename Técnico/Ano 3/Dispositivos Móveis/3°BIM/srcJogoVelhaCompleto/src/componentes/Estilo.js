import { StyleSheet } from 'react-native';

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#23294F',
        borderWidth: 3,
        borderColor: '#394482',
        borderRadius: 10,
        margin: 5,
        padding: 5,
        alignItems: 'center',
        justifyContent: 'center',
    },

    retrato: {
        flexDirection: 'column', //configuração para modo retrato

    },

    paisagem: {
        flexDirection: 'row', //configuração para modo paisagem
    },

    cabecalhoRetrato: {
        flex: 0.15,
        width: '100%',
        borderStyle: 'solid',
        borderBottomColor: 'black',
        borderBottomWidth: 2,
        padding: '0.2cm',
    },

    cabecalhoPaisagem: {
        flex: 0.2,
        width: '100%',
        height: '100%',
        alignItems: 'center',
        justifyContent: 'center',
        borderStyle: 'solid',
        padding: '0.2cm',
        borderRightColor: 'black',
        borderRightWidth: 2,
    },

    meio: {
        flex: 0.7,
        width: '100%',
        alignItems: 'center',
        justifyContent: 'center',
    },

    rodapeRetrato: {
        flex: 0.15,
        width: '100%',
        height: '100%',
        borderStyle: 'solid',
        borderTopColor: 'black',
        borderTopWidth: 2,
        color: '#99A1CF',
        padding: '0.2cm', //distancia entre os objetos
    },

    rodapePaisagem: {
        flex: 0.2,
        width: '100%',
        height: '100%',
        alignItems: 'center',
        justifyContent: 'center',
        borderStyle: 'solid',
        borderLeftColor: 'black',
        borderLeftWidth: 2,
        color: '#99A1CF',
        padding: '0.2cm', //distancia entre os objetos
    },

    titulo: {
        fontWeight: 'bold',
        fontSize: 33,
        textAlign: 'center',
        color: '#99A1CF',
        textTransform: 'uppercase',
    },
    botao: {
        backgroundColor: '#282A36',
        borderWidth: 1,
        borderColor: '#000',
        alignItems: 'center',
        justifyContent: 'center',
        minWidth: 20,
        minHeight: 20,
        maxWidth: 120, // Largura fixa para as células
        maxHeight: 120, // Altura fixa para as células
    },
    jogada: {
        textAlign: 'center',
        fontWeight: 'bold',
        color: '#DDE0FF',
        fontSize: 50,
        margin: 0,
        padding: 0,
    },

    linhaTabuleiro: {
        flexDirection: 'row',
        alignSelf: 'center',
    },
    
    historico: {
        padding: 10,
    },

    texto: {
        padding: '5px',
        fontWeight: 'bold',
        color: '#99A1CF',
        textTransform: 'uppercase',
    },
});

export { styles };
