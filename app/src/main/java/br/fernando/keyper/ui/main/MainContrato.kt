package br.fernando.keyper.ui.main

/**
 * ela vai conter todas
 * gerencia a conexao da camada de presente e view
 * vamos adicionar metodos da camada de view
 * vamos adicionar metodos da camada de presenter
 */

interface MainContrato {

    interface View{
        /**
         * faz modificacoes na view do app
         */

        fun MostrarMensagem(texto:String){

        }
        fun iniciaActivityFrutas(){

        }

    }
    interface Presenter{
        /**
         * sera chamada quando
         * o botao de login for clicado
         */
        fun loginClicado(nome:String,
                         senha:String){

        }
    }
}