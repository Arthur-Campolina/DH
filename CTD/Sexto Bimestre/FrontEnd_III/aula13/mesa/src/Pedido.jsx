import React from "react"

export const Pedido = () => {

    // React.useEffect(() => {
    //     console.log("UseEffect Cotador")

    //     alert(`Pedido Cancelado!`)
    //     document.title = 'Pedido Cancelado'
    //     return function limpaComponente() {
    //         console.log("Limpador do Contador")
    //     }
    // }, [cliques])

    return (
        <>
            <button onClick={() => alert('Pedido Cancelado')}>Clique</button>
        </>
    )
}
