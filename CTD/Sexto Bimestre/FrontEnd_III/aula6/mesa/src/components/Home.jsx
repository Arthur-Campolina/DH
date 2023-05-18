import React from 'react';

import City from './City';

/* Componente do tipo funcional */
function HomeComponent(props) {
    return (<div>
        {props.items.map((itemIteracao) => {
            if (itemIteracao.country == "BRA") {
                return <City item={itemIteracao} />
            }
        })}
    </div>)
}
export default HomeComponent;