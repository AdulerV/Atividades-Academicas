import Cabecalho from "./Cabecalho"
import Principal from "./Principal"
import Rodape from "./Rodape"
import "./Jogo.css";

export default function Jogo() {
    return (
        <div className="Jogo">
            <Cabecalho></Cabecalho>
            <Principal></Principal>
            <Rodape></Rodape>
        </div>
    )
}