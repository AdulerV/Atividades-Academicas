import AsyncStorage from '@react-native-async-storage/async-storage';

export const salvarItem = async (item) => {
    try {
        const lista = await getLista();
        lista.push(item);
        const jsonValue = JSON.stringify(lista);
        await AsyncStorage.setItem("lista", jsonValue);
    } catch (erro) {
        console.log(erro);
    }
};

export const getLista = async () => {
    try {
        const dados = await AsyncStorage.getItem("lista");
        const lista = dados ? JSON.parse(dados) : [];
        return lista;
    } catch (erro) {
        console.log(erro);
        return [];
    }
};

export const removerItem = async (itemId) => {
    try {
        const listaAtual = await getLista();
        const novaLista = listaAtual.filter((item) => item.id !== itemId);
        const jsonValue = JSON.stringify(novaLista);
        await AsyncStorage.setItem("lista", jsonValue);
        return true;
    } catch (error) {
        console.error('Erro ao remover item:', error);
        return false;
    }
};
