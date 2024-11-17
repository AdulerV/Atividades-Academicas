import React, { useRef } from "react";
import { useState } from "react";
import { View, Text, TextInput, TouchableOpacity, Image } from "react-native";
import { useNavigation } from '@react-navigation/native';
import { styles } from './Styles';
import { salvarItem } from "./data";

export default function AddressForm() {
    const [nomeEvento, setNomeEvento] = useState("evento");
    const [descricao, setDescricao] = useState("descrição");
    const [estado, setEstado] = useState("estado");
    const [cidade, setCidade] = useState("cidade");
    const [bairro, setBairro] = useState("bairro");
    const [rua, setRua] = useState("rua");
    const [numero, setNumero] = useState("número");


    const nomeEventoRef = useRef(null);
    const descricaoRef = useRef(null);
    const estadoRef = useRef(null);
    const cidadeRef = useRef(null);
    const bairroRef = useRef(null);
    const ruaRef = useRef(null);
    const numeroRef = useRef(null);

    const { navigate } = useNavigation();

    const resetFields = () => {
        setNomeEvento("");
        setDescricao("");
        setEstado("");
        setCidade("");
        setBairro("");
        setRua("");
        setNumero("");

        nomeEventoRef.current.clear();
        descricaoRef.current.clear();
        estadoRef.current.clear();
        cidadeRef.current.clear();
        bairroRef.current.clear();
        ruaRef.current.clear();
        numeroRef.current.clear();
    };

    const handleButtonPress = async () => {

        // const url = "https://maps.googleapis.com/maps/api/geocode/json?address=Av.Brasil+6345+Mariano+Procópio,+Juiz+De+Fora,+Minas+Gerais&key=AIzaSyCFYm0snZtBWeg4JpNlknkf4J3bmQHTUwI"

        async function obterCoordenadas() {
            let ruaFormatada = rua.replace(/ /g, '+');
            let bairroFormatado = bairro.replace(/ /g, '+')
            let cidadeFormatada = cidade.replace(/ /g, '+')
            let estadoFormatado = estado.replace(/ /g, '+')

            const url = `https://maps.googleapis.com/maps/api/geocode/json?address=${ruaFormatada}+${numero}+${bairroFormatado},+${cidadeFormatada},+${estadoFormatado}&key=AIzaSyCFYm0snZtBWeg4JpNlknkf4J3bmQHTUwI`
            const resposta = await fetch(url)
            const dados = await resposta.json()
            const cordenadas = {
                latitude: dados.results[0].geometry.location.lat,
                longitude: dados.results[0].geometry.location.lng
            }
            return cordenadas
        }
        const cordenadas = await obterCoordenadas()

        const enderecoEvento = {
            id: new Date().getTime(),
            nomeEvento: nomeEvento,
            descricao: descricao,
            estado: estado,
            cidade: cidade,
            bairro: bairro,
            rua: rua,
            numero: parseInt(numero),
            longitude: cordenadas.longitude,
            latitude: cordenadas.latitude
        };
        await salvarItem(enderecoEvento)
        console.log(enderecoEvento)
        navigate('Lista', enderecoEvento)
        navigate('Mapa', enderecoEvento)
        resetFields()
    }
    return (
        <View style={styles.container}>
            <View style={styles.cabecalho}>
                <Image source={require('../images/logo.jpeg')} style={styles.imageLogo} />
                <Text style={styles.textLogo}><Text style={{ color: "#0950f6" }}>PUB</Text>EVENTOS</Text>
            </View>
            <Text style={styles.title}>Cadastrar Evento</Text>
            <View style={styles.formContainer}>
                <Text style={styles.label}>Nome do evento:</Text>
                <TextInput
                    ref={nomeEventoRef}
                    style={styles.input}
                    onChangeText={(valor) => setNomeEvento(valor)}
                />

                <Text style={styles.label}>Descrição:</Text>
                <TextInput
                    ref={descricaoRef}
                    style={[styles.input, styles.multilineInput]}
                    numberOfLines={3}
                    multiline={true}
                    onChangeText={(valor) => setDescricao(valor)}
                />

                <Text style={styles.label}>Estado:</Text>
                <TextInput
                    ref={estadoRef}
                    style={styles.input}
                    onChangeText={(valor) => setEstado(valor)}
                />

                <Text style={styles.label}>Cidade:</Text>
                <TextInput
                    ref={cidadeRef}
                    style={styles.input}
                    onChangeText={(valor) => setCidade(valor)}
                />

                <Text style={styles.label}>Bairro:</Text>
                <TextInput
                    ref={bairroRef}
                    style={styles.input}
                    onChangeText={(valor) => setBairro(valor)}
                />

                <Text style={styles.label}>Rua:</Text>
                <TextInput
                    ref={ruaRef}
                    style={styles.input}
                    onChangeText={(valor) => setRua(valor)}
                />

                <Text style={styles.label}>Número:</Text>
                <TextInput
                    ref={numeroRef}
                    style={[styles.input, { keyboardType: "numeric" }]}
                    onChangeText={(valor) => setNumero(valor)}
                />
                <TouchableOpacity style={styles.button} onPress={handleButtonPress}>
                    <Text style={styles.buttonText}>CADASTRAR</Text>
                </TouchableOpacity>
            </View>
        </View>
    )
}