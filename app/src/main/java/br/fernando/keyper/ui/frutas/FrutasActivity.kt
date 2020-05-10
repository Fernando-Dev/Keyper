package br.fernando.keyper.ui.frutas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import br.fernando.keyper.R

class FrutasActivity : AppCompatActivity(), FrutasContrato.View {

    private lateinit var presenter:FrutasPresenter
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var lista: ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        /**
         * inicia nossa classe presenter
         */
        presenter = FrutasPresenter(this)

        lista = findViewById<ListView>(R.id.lista_frutas)

        /**
         * carregando a lista com o metodo do presenter
         */
        presenter.getFrutas()

    }

    /**
     * criando a logica para carregamento de dados para lista de frutas
     */
    override fun mostrarDados(frutas: Array<String>) {

        /**
         * criando o adapter para criar o lista
         */
        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,
            android.R.id.text1,frutas)
        lista.adapter = adapter
    }
}
