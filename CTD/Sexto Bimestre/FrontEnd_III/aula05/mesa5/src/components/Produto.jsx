import style from './style.module.css'

function Produto({ nome, image, preco }) {
  return (
    <li>
      <h2 className={style.h3}>{nome}</h2>
      <img src={image} />
      <h3>{preco}</h3>
    </li>
  );
}

export default Produto;
