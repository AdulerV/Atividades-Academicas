<?php

use Illuminate\Support\Facades\Route;

use App\Http\Controllers\AlunoController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});

Route::resource('/alunos', AlunoController::class);

Route::prefix('alunos')->namespace('alunos')->group(function () {
    Route::prefix('posts')->name('posts.')->group(function () {
        Route::get('/create', [AlunoController::class, 'create'])->name('create');
        Route::post('/store', [AlunoController::class, 'store'])->name('store');
        Route::get('{id}/edit', [AlunoController::class, 'edit'])->name('edit');
        Route::post('/update', [AlunoController::class, 'update'])->name('update');
    });
});
