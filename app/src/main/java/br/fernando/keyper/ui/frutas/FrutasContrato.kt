package br.fernando.keyper.ui.frutas

interface FrutasContrato {

    interface View{

        fun mostrarDados(frutas:Array<String>)
    }

    interface Presenter{

        fun getFrutas()

    }
}