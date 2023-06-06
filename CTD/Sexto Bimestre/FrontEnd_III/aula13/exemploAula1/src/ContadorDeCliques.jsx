import React from "react"

export const ContadorDeCliques = () => {
    const [cliques, setCliques] = React.useState(0)
    const onClickHandler = () => {
        setCliques(cliques + 1)
    }
    React.useEffect(() => {
        console.log("UseEffect Cotador")

        alert(`Clicou ${cliques} vezes`)
        document.title = `Clicou ${cliques} vezes`
        return function limpaComponente() {
            console.log("Limpador do Contador")
        }
    }, [cliques])

    return (
        <>
            <h2>Clicou {cliques} vezes</h2>
            <button onClick={onClickHandler}>Clique</button>
        </>
    )
}
