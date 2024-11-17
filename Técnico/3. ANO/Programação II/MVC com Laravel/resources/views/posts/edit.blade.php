<form action="{{route('posts.update')}}" method="post">
    <input type="hidden" name="_token" value="{{csrf_token()}}">
    <div class="form-group">
        <label>Matrícula:</label>
        <input type="text" name="matricula" class="form-control" value="{{$matricula}}">
    </div>
    <div class="form-group">
        <label>Nome:</label>
        <input type="text" name="nome" class="form-control" value="{{$nome}}">
    </div>
    <div class="form-group">
        <label>Email:</label>
        <input type="text" name="email" class="form-control" value="{{$email}}">
    </div>
    <button class="btn btn-lg btn-success">Criar Postagem </button>
</form>