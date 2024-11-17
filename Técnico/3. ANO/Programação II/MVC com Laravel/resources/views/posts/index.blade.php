<style>
    .demo {
        border: 1px solid #C0C0C0;
        border-collapse: collapse;
        padding: 5px;
    }

    .demo th {
        border: 1px solid #C0C0C0;
        padding: 5px;
        background: #F0F0F0;
    }

    .demo td {
        border: 1px solid #C0C0C0;
        padding: 5px;
    }
</style>

<table class="demo">
    <thead>
        <tr>
            <th colspan="3">Alunos</th>
        </tr>
        <tr>
            <th>Matricula</th>
            <th>Nome</th>
            <th>Email</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>{{$matricula1}}</td>
            <td>{{$nome1}}</td>
            <td>{{$email1}}</td>
        </tr>
        <tr>
            <td>{{$matricula2}}</td>
            <td>{{$nome2}}</td>
            <td>{{$email2}}</td>
        </tr>
        <tr>
            <td>{{$matricula3}}</td>
            <td>{{$nome3}}</td>
            <td>{{$email3}}</td>
        </tr>
    </tbody>
</table>