<form action="{{route('posts.store')}}" method="post">
    <input type="hidden" name="_token" value="{{csrf_token()}}">
    <div class="form-group">
        <label>Matrícula:</label>
        <input type="text" name="matricula" class="form-control">
    </div>
    <div class="form-group">
        <label>Nome:</label>
        <input type="text" name="nome" class="form-control">
    </div>
    <div class="form-group">
        <label>Email:</label>
        <input type="text" name="email" class="form-control">
    </div>
    <button class="btn btn-lg btn-success">Criar Postagem </button>
</form>