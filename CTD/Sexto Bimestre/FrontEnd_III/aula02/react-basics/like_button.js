function MeuComponente() {
    return React.createElement(
        'button',
        {
            onClick: () => alert('ok'),
            style: {
                backgroundColor: 'red'
            },
        },
        'Pressione'
    )
}

const domContainer = document.querySelector("#div");
const root = ReactDOM.createRoot(domContainer);
root.render(MeuComponente())