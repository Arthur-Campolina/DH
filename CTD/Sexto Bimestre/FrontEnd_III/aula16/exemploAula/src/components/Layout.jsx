import { Link, Outlet } from "react-router-dom"

export const Layout = () => {
    return (
        <>
            <nav>
                <Link to="/home">Home</Link>
                <Link to="/pagina1">Pagina 1</Link>
                <Link to="/pagina2">Pagina 2</Link>
                <Link to="/pagina3">Pagina 3</Link>
            </nav>
            <Outlet />
            <h1>Sou o Footer</h1>
        </>

    )
}