<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class AlunoController extends Controller
{

    public function index()
    {
        $matricula1 = "22222";
        $matricula2 = "22223";
        $matricula3 = "22224";
        $nome1 = "Sávio";
        $nome2 = "Áduler";
        $nome3 = "Cleiton";
        $email1 = "savio@gmail.com";
        $email2 = "aduler@gmail.com";
        $email3 = "cleiton@gmail.com";

        return view('posts.index', compact('matricula1', 'matricula2', 'matricula3', "nome1", "nome2", "nome3", "email1", "email2", "email3"));
    }


    public function create()
    {
        return view('posts.create');
    }


    public function store(Request $request)
    {
        dd($request->all());
    }


    public function show(string $id)
    {
        //
    }


    public function edit(string $id)
    {
        $matricula = 'matricula' . $id;
        $nome = 'nome' . $id;
        $email = 'email' . $id;
        return view('posts.edit', compact('matricula', 'nome', 'email', 'id'));
    }


    public function update(Request $request, string $id = null)
    {   
        dd($request->all());
    }


    public function destroy(string $id)
    {
        //
    }
}
