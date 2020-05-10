package br.fernando.keyper.ui.frutas

import br.fernando.keyper.model.RepositorioFrutas

class FrutasPresenter(private val view: FrutasContrato.View):FrutasContrato.Presenter {
    private val repositorioFrutas = RepositorioFrutas()

    /**
     * metodo resposnsavel pela coleta
     * de dados na camada modelo(repositorio)
     */
    override fun getFrutas() {
       val frutas = repositorioFrutas.getFrutas()

        view.mostrarDados(frutas)
    }
}