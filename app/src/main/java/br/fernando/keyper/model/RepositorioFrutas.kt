package br.fernando.keyper.model

class RepositorioFrutas {

    private val frutas = arrayOf(
        "Banana",
        "Manga",
        "Pera",
        "Pecego"
    )

    fun getFrutas(): Array<String> {
        return frutas
    }


}