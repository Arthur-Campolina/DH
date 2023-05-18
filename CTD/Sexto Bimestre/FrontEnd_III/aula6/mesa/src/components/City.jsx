import React from 'react';
import styleModule from './home.module.css';

function City(props) {

    let item = props.item;

    return (
        <div key={item.id} className={styleModule.card}>
            <h2>ID {item.id}</h2>
            <h1 style={{ color: item.color }}>{item.city}</h1>
            <h3>{item.country}</h3>
            <p className={styleModule.fonte}>{item.population}</p>
        </div>
    )

}
export default City;