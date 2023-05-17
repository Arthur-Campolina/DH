import { produtos } from "./utils/produtos";
import Produto from "./components/produto";

function App() {
  return (
    <div>
      <h1>Produtos</h1>
      <ul>
        {produtos.map((produto) => {
          return (<Produto
            nome={produto.nome}
            preco={produto.preco}
            image={produto.image}
            key={produto.nome}
          />)

        })
        }
      </ul>
    </div>
  );
}

export default App;
