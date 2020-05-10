package br.fernando.keyper.ui.main

import br.fernando.keyper.model.RepositorioSessao

/**
 * camada presenter responsavel pela logica da regra de negocio
 * codigo referente as regras de negocios
 * como boa pratica colocar como parametros no construtor
 * camada modelo e camada view
 * nunca deve ter pacotes referente a camada de visulizacao
 */

class MainPresenter(private val view: MainContrato.View) : MainContrato.Presenter {

    private val repositorioSessao = RepositorioSessao()


    override fun loginClicado(nome: String, senha: String) {
        if (nome.isEmpty()){
            view.MostrarMensagem("Nome inválido")
            return
        }
        if (senha.isEmpty()){
            view.MostrarMensagem("Digite uma senha")
            return
        }
        /**
         * o progress bar poderia ser chamado aqui
         */

        /**
         * feedback de teste da logica da camada presenter
         */
        view.MostrarMensagem("dados preenchido")


        /**
         * conexao com a camada repositorio de login
         */
        val loginComSucesso = repositorioSessao.login(nome,senha)
        if (loginComSucesso){
            view.MostrarMensagem("Login efetuado")
            view.iniciaActivityFrutas()
        }else{
            view.MostrarMensagem("Falha no login")
        }


    }

}