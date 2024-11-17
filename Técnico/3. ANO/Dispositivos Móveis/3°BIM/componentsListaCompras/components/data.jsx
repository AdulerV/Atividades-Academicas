import AsyncStorage from '@react-native-async-storage/async-storage';

export async function saveItem(itemList) {
    try {
        const itens = await getList()
        itens.push(itemList)


        const jsonValue = JSON.stringify(itens)
        await AsyncStorage.setItem('itens', jsonValue)
    } catch (error) {
        console.log(error)
    }
}

export async function getList() {
    try {
        const data = await AsyncStorage.getItem('itens')
        return data ? JSON.parse(data) : []
    } catch (error) {
        console.log(error)
    }
}

export async function excluirItem(item) {
    try {
        const list = await getList();
        for (let a = 0; a < list.length; a++) {
            if (list[a].id == item.id) {
                list.splice(a, 1);
                break;
            }
        }


        const jsonValue = JSON.stringify(list)
        await AsyncStorage.setItem('itens', jsonValue)
    } catch (error) {
        console.log(error);
    }
}

alterItem
export async function alterItem(item) {
    try {
        const itens = await getList();

        for (let a = 0; a < itens.length; a++) {
            if (itens[a].id == item.id) {
                itens[a] = item;
                break;
            }
        }

        

        const jsonValue = JSON.stringify(itens);
        await AsyncStorage.setItem("itens", jsonValue);
    } catch (error) {
        console.log(error);
    }
}