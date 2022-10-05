package br.com.rbf.app_descartemed

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.rbf.app_descartemed.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*
        val btnRegistre = findViewById<Button>(R.id.btn_registre)
        val edtNome = findViewById<TextView>(R.id.edt_nome)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnRegistre.setOnClickListener {
            val nome: String = edtNome.editableText.toString()
            txvResultado.text = nome
        }
        */
        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_mapsFragment, R.id.navigation_chatbotFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    fun onClickAqui(view: View){
        Toast.makeText(this, "Registrado!", Toast.LENGTH_SHORT).show()



    }
}