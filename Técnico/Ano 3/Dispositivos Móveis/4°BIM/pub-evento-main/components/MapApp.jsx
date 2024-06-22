import React from "react";
import GoogleMapReact from 'google-map-react';
import { View } from "react-native";
import { useState } from "react";
import { getLista } from "./data";
import { useEffect } from "react";
import PinMap from "./PinMap";

export default function MapApp(props) {

    const [marcadores, setMarcadores] = useState([])

    useEffect(() => {
        async function obterDados() {
            const dados = await getLista();
            setMarcadores(dados);
        }
        obterDados();
    }, [props]);

    const defaultProps = {
        center: {
            lat: -21.76252615188637,
            lng: -43.34361352147626
        },
        zoom: 13,
    };

    return (
        <View>
            <GoogleMapReact style={{ height: '94vh', width: '100%', zoomControl: false }}
                bootstrapURLKeys={{ key: "AIzaSyCpZXK1K0beBpaJHh-ClRvVdOtzYd1xBks" }}
                defaultCenter={defaultProps.center}
                defaultZoom={defaultProps.zoom}
            >

                {
                    marcadores.map((marcadorAtual) => <PinMap key={marcadorAtual.id} texto={marcadorAtual.nomeEvento}  lat={marcadorAtual.latitude} lng={marcadorAtual.longitude} />)
                }

                {console.log(marcadores)}
            </GoogleMapReact>
        </View>
    );
}