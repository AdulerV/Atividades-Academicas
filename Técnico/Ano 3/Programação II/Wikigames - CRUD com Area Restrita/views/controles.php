<?php
    function input($id, $texto, $valor, $somenteLeitura, $tipo,$max,$s) {

        if (!$tipo) {
            $tipo = "text";
        }

        echo '<div class="col-md-6 offset-md-3">
            <label for="' . $id . '" class="form-label" style="color:aqua">' . $texto . ':</label>
            <input type="'.$tipo.'" ' . ($somenteLeitura ? "readonly" : "") .' class="form-control" id="' . $id . '" name="' . $id . '" value="' . $valor . '" style="background-color:chartreuse;"  required="required" maxlength="' . $max . '" size="' . $s . '">
        </div>';
}

function input2($valor, $disabled){


    echo '<div class="col-md-6 offset-md-3">
          <label for="genero" class="form-label" style="color:aqua">Gênero :</label>
         <select name="genero" ' . ($disabled ? "disabled" : "") . ' required="required"  class="form-control" style="background-color:chartreuse;">;
         <option value="">Selecione o gênero</option>';
    $options = array(
        "Masculino" => "Masculino",
        "Feminino" => "Feminino"
    );

    foreach ($options as $value => $label) {
        $selected = ($valor == $value) ? "selected" : "";
        echo '<option value="' . $value . '" ' . $selected . '>' . $label . '</option>';
    }
}
