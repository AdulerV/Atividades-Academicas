import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { NavigationContainer } from '@react-navigation/native';
import React from 'react';
import { styles } from './Styles';
import { MaterialIcons } from '@expo/vector-icons'; // Importe os ícones conforme necessário
import AddressList from './AddressList';
import AddressForm from './AddressForm';
import { TouchableHighlight, Text } from 'react-native';
import MapApp from './MapApp';
import { useNavigation } from '@react-navigation/native';

const Tab = createBottomTabNavigator();

export default function AppNavigation() {
    return (
        <NavigationContainer>
            <Tab.Navigator
                screenOptions={{
                    tabBarStyle: styles.tabBar,
                    tabBarActiveTintColor: "#ff7654",
                    tabBarInactiveTintColor: "black",
                    headerShown: false,
                    tabBarShowLabel: false,

                }}
            >
                <Tab.Screen
                    name="Formulario"
                    component={AddressForm}
                    options={{
                        tabBarIcon: ({ color, size }) => (
                            <MaterialIcons name="edit" size={size} color={color} />
                        ),
                    }}
                />
                <Tab.Screen
                    name="Mapa"
                    component={MapApp}
                    options={{
                        tabBarIcon: ({ color, size }) => (
                            <MaterialIcons name="map" size={size} color={color} />
                        ),
                    }}
                />
                <Tab.Screen
                    name='Lista'
                    component={AddressList}
                    options={{
                        tabBarIcon: ({ color, size }) => (
                            <MaterialIcons name="list" size={size} color={color} />
                        ),
                    }}
                />
            </Tab.Navigator>
        </NavigationContainer>
    );
}

