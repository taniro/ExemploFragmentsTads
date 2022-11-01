package tads.eaj.ufrn.exemplofragmentstads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        /*

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val fragmentInicial = Fragment1()

        fragmentTransaction.add(R.id.layout_alvo, fragmentInicial, "qualquer uma")
        fragmentTransaction.commit()


        val button1 = findViewById<Button>(R.id.buttonFragment1)
        val button2 = findViewById<Button>(R.id.buttonFragment2)

        button1.setOnClickListener {

            val buttonTransaction = supportFragmentManager.beginTransaction()
            val f1 = Fragment1()
            buttonTransaction.replace(R.id.layout_alvo, f1, "fragment1")
            buttonTransaction.addToBackStack("teste")
            buttonTransaction.commit()

        }

        button2.setOnClickListener {
            val buttonTransaction = supportFragmentManager.beginTransaction()
            val f2 = Fragment2()
            buttonTransaction.replace(R.id.layout_alvo, f2, "fragment1")
            buttonTransaction.addToBackStack("teste2")
            buttonTransaction.commit()
        }*/
    }
}