// Selecionar itens do menu
let menuItem = document.querySelectorAll('.item-menu');

// Função para selecionar o link ativo
function selectLink() {
    menuItem.forEach((item) => item.classList.remove('ativo')); // Remove a classe 'ativo' de todos os itens
    this.classList.add('ativo'); // Adiciona a classe 'ativo' ao item clicado
}

// Adicionar evento de clique para cada item do menu
menuItem.forEach((item) => item.addEventListener('click', selectLink));

// Expandir o menu lateral
let btnExp = document.querySelector('#btn-exp'); // Seleciona o botão de expandir
let menu = document.querySelector('.menu-lateral'); // Seleciona o menu lateral
let body = document.querySelector('body'); // Seleciona o body para controlar o grid

btnExp.addEventListener('click', function () {
    menu.classList.toggle('expandir'); // Alterna a classe 'expandir' no menu
    body.classList.toggle('nav-expandida'); // Alterna a classe 'nav-expandida' no body para ajustar o grid
});
