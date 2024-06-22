function corFundo() {
    const fundo = document.querySelector('#questao1')
    const select = document.querySelector('#selectCor');
    fundo.style.backgroundColor = select.value;
}

function botaoClique() {
    let btn = document.querySelector('#btnSoma');
    btn.innerHTML++;
}

function inserirTag() {
    const tagPai = document.querySelector('#pai')
    const campo = document.querySelector('#campoTextoTag');
    const select = document.querySelector('#selectTag');

    const tag = document.createElement(select.value);
    const txtTag = document.createTextNode(campo.value);

    tag.appendChild(txtTag);
    tagPai.appendChild(tag);
}

function inserirExcluirLista() {
    const lista = document.querySelector('#lista');
    const campo = document.querySelector('#campoTextoLista');
    const btnAdd = document.querySelector('#adicionar');
    const btnRmv = document.querySelector('#remover');

    btnAdd.onclick = function () {
        if (campo.value !== "") {
            const item = document.createElement('li');
            const txtItem = document.createTextNode(campo.value);

            item.valor = campo.value;

            item.appendChild(txtItem);
            lista.appendChild(item);
        }
    }

    btnRmv.onclick = function () {
        const todosItems = document.querySelectorAll('li');

        for (const item of todosItems) {
            if (item.valor === campo.value) {
                lista.removeChild(item);
            }
        }
    }
}
