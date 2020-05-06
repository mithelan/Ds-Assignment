import React from 'react';
import logo from './logo.svg';
import './App.css';
import SensorStatusList from "./List/SensorStatusList";
import Navigationbar from "./List/Navbar";

function App() {
  return (
    <div className="App">
        <Navigationbar></Navigationbar>
    <SensorStatusList></SensorStatusList>

    </div>
  );
}

export default App;
