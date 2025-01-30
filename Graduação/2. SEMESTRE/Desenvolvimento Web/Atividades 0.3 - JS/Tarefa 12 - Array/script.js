let array = new Array();
let btn = document.querySelector("button");
let contador = 0;

btn.addEventListener("click", function () {
    let input = document.querySelector("#input");

    if (input.value != "") {
        array[contador] = input.value;
        array = array.sort();
        contador++;

        let texto = "";

        for (let i = 0; i < array.length; i++) {
            texto += `<li>${array[i]}</li>`;
        }
        document.querySelector("#listaOrdenada").innerHTML = texto;
    }

    input.value = null;
    input.focus();
})




