package br.com.dalfior.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "entrei no CREATE - estou criando a tela")
        //finish() - PULA O CLICLO DE VIDA. Unico contexto que o ciclo não é respeitado.
        // Destroi a tela imediatamente levando direto par ao medoto onDestroy. CREATE E DESTROY
    }
    override fun onStart(){
        super.onStart()
        Log.w("lifecycle", "entrei no START - deixei a tela visivel para você")
    }
    override fun onResume(){
        super.onResume()
        Log.w("lifecycle", "entrei no RESUME - agora você pode interagir com a tela")
    }
    override fun onPause(){
        super.onPause()
        Log.w("lifecycle", "PAUSE - a tela perdeu o foco, você não pode mais interagir")
    }
    override fun onStop(){
        Log.w("lifecycle", "STOP - a tela não está mais visivel mas ainda existe")
        super.onStop()
    }
    override fun onRestart(){
        super.onRestart()
        Log.w("lifecicle", "\nentrei no RESTART - a tela esta retomando o foco")
    }
    override fun onDestroy(){
        Log.w("lifecycle", "\nentrei no DESTROY - oh não! a tela foi destruida")
        super.onDestroy()
    }
}