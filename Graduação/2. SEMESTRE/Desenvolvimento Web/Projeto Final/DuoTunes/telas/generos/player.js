const elementosMusica = document.querySelectorAll('.musica');
const playerAudio = document.getElementById('player-audio');
const botaoPause = document.getElementById('player-pause-btn');
const tituloAtualMusica = document.getElementById('musica-atual-titulo');
const artistaAtualMusica = document.getElementById('musica-atual-artista');
const barraProgresso = document.getElementById('barraProgresso');
const minutagemMusica = document.getElementById('minutagemMusica');
const barraVolume = document.getElementById('barraVolume');
const botaoVolume = document.getElementById('botao-volume');

let indiceMusicaAtual = 0;

// Adicionando evento de clique para cada música
elementosMusica.forEach((elemento, indice) => {
    elemento.addEventListener('click', () => {
        const musicaSrc = elemento.getAttribute('data-src');
        const tituloMusica = elemento.getAttribute('data-title');
        const artistaMusica = elemento.getAttribute('data-artist');
        indiceMusicaAtual = indice;

        // Atualizando o player com as informações da música
        playerAudio.src = musicaSrc;
        tituloAtualMusica.textContent = tituloMusica;
        tituloAtualMusica.style.fontWeight = 'bold';
        artistaAtualMusica.textContent = artistaMusica;

        // Tocando a música
        playerAudio.play();
        atualizarBotaoDePause();
        barraProgresso.disabled = false;
    });
});

// Atualizando o botão de play/pause
function atualizarBotaoDePause() {
    if (playerAudio.paused) {
        botaoPause.innerHTML = '<i class="bi bi-play-fill"></i>';
    } else {
        botaoPause.innerHTML = '<i class="bi bi-pause-fill"></i>';
    }
}

// Controlando o botão de play/pause
botaoPause.addEventListener('click', () => {
    if (playerAudio.paused) {
        playerAudio.play();
    } else {
        playerAudio.pause();
    }
    atualizarBotaoDePause();
});

// Atualizando a barra de progresso durante a reprodução da música
playerAudio.addEventListener('timeupdate', () => {
    const duracao = playerAudio.duration;
    const tempoAtual = playerAudio.currentTime;

    if (!isNaN(duracao)) {
        const progresso = (tempoAtual / duracao) * 100;
        barraProgresso.value = progresso;

        // Atualizando a minutagem da música
        const minutosAtuais = Math.floor(tempoAtual / 60);
        const segundosAtuais = Math.floor(tempoAtual % 60);
        const minutosTotais = Math.floor(duracao / 60);
        const segundosTotais = Math.floor(duracao % 60);

        minutagemMusica.textContent = `${formatarTempo(minutosAtuais)}:${formatarTempo(segundosAtuais)} / ${formatarTempo(minutosTotais)}:${formatarTempo(segundosTotais)} \u00A0\u00A0`;
    }
});

// Formatação do tempo
function formatarTempo(tempo) {
    return tempo < 10 ? `0${tempo}` : tempo;
}

// Avançando para a próxima
function proximaMusica() {
    indiceMusicaAtual = (indiceMusicaAtual + 1) % elementosMusica.length;
    elementosMusica[indiceMusicaAtual].click();
}

// Controlando o avanço manual pela barra de progresso
barraProgresso.addEventListener('input', () => {
    const duracao = playerAudio.duration;
    playerAudio.pause();

    if (!isNaN(duracao)) {
        const novoTempo = (barraProgresso.value / 100) * duracao;
        playerAudio.currentTime = novoTempo;
    }

    barraProgresso.addEventListener('mouseup', () => {
        playerAudio.play();
    });
});

// Controlando o volume
barraVolume.addEventListener('input', () => {
    playerAudio.volume = barraVolume.value / 100;
    botaoVolume.className = "bi bi-volume-up-fill";

    if (playerAudio.volume == 0) {
        botaoVolume.className = "bi bi-volume-mute-fill";
    }
});

botaoVolume.addEventListener('click', () => {
    if (playerAudio.state) {
        playerAudio.volume = barraVolume.value / 100;
        botaoVolume.className = "bi bi-volume-up-fill";
        playerAudio.state = false;
    } else {
        playerAudio.volume = 0;
        botaoVolume.className = "bi bi-volume-mute-fill";
        playerAudio.state = true;
    }
});

// Atualizando botão quando a música acabar
playerAudio.addEventListener('ended', () => {
    proximaMusica();
});

// Próxima música
document.getElementById('proxima-btn').addEventListener('click', () => {
    proximaMusica();
});

// Música anterior
document.getElementById('anterior-btn').addEventListener('dblclick', () => {
    indiceMusicaAtual = (indiceMusicaAtual - 1 + elementosMusica.length) % elementosMusica.length;
    elementosMusica[indiceMusicaAtual].click();
});

// Reiniciar música
document.getElementById('anterior-btn').addEventListener('click', () => {
    elementosMusica[indiceMusicaAtual].click();
});
