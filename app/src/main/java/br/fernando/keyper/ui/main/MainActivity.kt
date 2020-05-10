package br.fernando.keyper.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.fernando.keyper.R
import br.fernando.keyper.ui.frutas.FrutasActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * camada responsavel pela visualizacao de dados
 * efeitos visuais
 * nao pode receber codigo referente a regra de negocio
 * logica de visualizacao
 *
 */
class MainActivity : AppCompatActivity(), MainContrato.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * inicializa o presenter
         */
        presenter = MainPresenter(this)


        btn_login.setOnClickListener {
            val nome = edt_username.text.toString()
            val senha = edt_password.text.toString()
            presenter.loginClicado(nome, senha)
        }

    }

    override fun MostrarMensagem(texto: String) {
        Toast.makeText(this, texto, Toast.LENGTH_LONG).show()
    }

    override fun iniciaActivityFrutas() {
        startActivity(Intent(this, FrutasActivity::class.java))
    }
}
