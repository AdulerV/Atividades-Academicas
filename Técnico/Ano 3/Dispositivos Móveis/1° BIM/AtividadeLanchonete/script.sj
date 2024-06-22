const txtDados = '{"lanches":[{"descricao":"Cachorro Quente","preco":4},{"descricao":"X-Salada","preco":4.5},{"descricao":"X-Bacon","preco":5},{"descricao":"Torrada Simples","preco":2},{"descricao":"Refrigerante","preco":1.5}]}'
const lanchonete = JSON.parse(txtDados);

const calcLanchonete = () => {
    const body = document.querySelector('body');
    const div = document.createElement('div');
    const titulo = document.createElement("h2");
    const txtTitulo = document.createTextNode("Lanchonete Bacana!");
    div.appendChild(titulo);
    titulo.appendChild(txtTitulo);

    for (const lanche of lanchonete.lanches) {
        const br1 = document.createElement("br");
        const br2 = document.createElement("br");
        const br3 = document.createElement("br");
        const label = document.createElement("label");
        const input = document.createElement("input");
        const txtLabel = document.createTextNode(`${lanche.descricao} = R$${lanche.preco.toFixed(2)}`);

        input.preco = lanche.preco;
        input.type = 'number';
        input.placeholder = 'Quantidade';

        body.appendChild(div);
        div.appendChild(label);
        label.appendChild(txtLabel);
        label.appendChild(br1);
        label.appendChild(input);
        label.appendChild(br2);
        label.appendChild(br3);
    }
    const resultado = document.createElement("span");
    const todosInputs = document.querySelectorAll('input');
    div.appendChild(resultado);

    for (const input of todosInputs) {
        input.onchange = function () {
            let total = 0;

            for (const input of todosInputs) {
                const quantidade = parseInt(input.value);
                const preco = parseFloat(input.preco);

                if (!isNaN(quantidade) && !isNaN(preco) && quantidade > 0) {
                    const subtotal = quantidade * preco;
                    total += subtotal;
                }
            }
            resultado.innerHTML = `<b>Preço Total: R$${total.toFixed(2)}</b>`;
        }
    }
}









