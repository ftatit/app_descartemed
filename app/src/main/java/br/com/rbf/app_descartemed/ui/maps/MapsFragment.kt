package br.com.rbf.app_descartemed.ui.maps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import androidx.fragment.app.Fragment

import br.com.rbf.app_descartemed.R


class MapsFragment : Fragment() {

    private lateinit var mapsViewModel: MapsViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_maps, container, false)
       // val btInfo = view.findViewById<Button>(R.id.btInfo)

       // btInfo.setOnClickListener {
        //    Toast.makeText(view.context, "Carregando mais informações!", Toast.LENGTH_LONG).show()

            //ABRINDO UMA NOVA VIEW, PODE SER TBM UM NAVEGADOR:
          //  val intent = Intent(Intent.ACTION_VIEW)
           // intent.setData(Uri.parse("https://google.com"))
           // startActivity(intent)

       // }
        return view
    }
}