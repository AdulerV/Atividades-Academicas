setInterval(funcaoRelogio, 1000)

function funcaoRelogio() {
    let tempo = new Date()

    document.getElementById('relogio').innerHTML = tempo.toLocaleTimeString();
    document.getElementById('reverse').innerHTML = tempo.toLocaleTimeString();

}
