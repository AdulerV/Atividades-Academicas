import { NavigationContainer } from '@react-navigation/native';
import { createMaterialBottomTabNavigator } from '@react-navigation/material-bottom-tabs';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';

import Form from './Form';
import List from './List';

const Tab = createMaterialBottomTabNavigator();

export default function Navigation() {
    return (
        <NavigationContainer>
            <Tab.Navigator
                initialRouteName="Form"
                backBehavior="history"
                activeColor="#008080"
                inactiveColor="#66CDAA"
                barStyle={{ backgroundColor: '#008080' }}
            >

                <Tab.Screen name="Form" component={Form} options={{
                    title: 'Formulário',
                    tabBarIcon: ({ focused, color, size }) => {
                        let iconName = focused ? "clipboard-list" : "clipboard-list-outline";
                        size = focused ? 30 : 25;
                        return (
                            <MaterialCommunityIcons
                                name={iconName}
                                size={size}
                                color={color}
                            />
                        );
                    },                   
                }}
                />

                <Tab.Screen name="List" component={List} options={{
                    title: 'Lista',
                    tabBarIcon: ({ focused, color, size }) => {
                        let iconName = focused ? "format-list-bulleted-square" : "format-list-checkbox";
                        size = focused ? 30 : 25;
                        return (
                            <MaterialCommunityIcons
                                name={iconName}
                                size={size}
                                color={color}
                            />
                        );
                    },
                    
                }}
                />
            </Tab.Navigator>
        </NavigationContainer>
    );
}