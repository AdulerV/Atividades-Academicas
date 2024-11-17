// ver o demo da função no endereço: https://codeseven.github.io/toastr/demo.html
function sendToastr(mensagem, tipo, destino) {
    toastr.options = {
        'closeButton': false,
        'debug': false,
        'newestOnTop': false,
        'progressBar': false,
        'positionClass': 'toast-bottom-full-width text-center',
        'onclick': destino,
        'showDuration': '300000',
        'hideDuration': '1000',
        'timeOut': '500000',
        'extendedTimeOut': '500000',
        'showEasing': 'swing',
        'hideEasing': 'linear',
        'showMethod': 'fadeIn',
        'hideMethod': 'fadeOut'
    };
    if (tipo == "success") {
        toastr.success(mensagem);
    } else if (tipo == "error") {
        toastr.error(mensagem);
    } else if (tipo == "info") {
        toastr.info(mensagem);
    }
}