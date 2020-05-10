package br.fernando.keyper.model

/**
 * camada responsavel pela logica de dados
 * armazenamento de dados
 *
 */
class RepositorioSessao {
    val nome = "aula"
    val senha = "1234"

    fun login(mNome: String, mSenha: String): Boolean {
        return mNome.compareTo(nome) == 0 && mSenha.compareTo(senha) == 0
    }

}