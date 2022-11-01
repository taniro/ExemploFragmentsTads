package tads.eaj.ufrn.exemplofragmentstads

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_2, container, false)

        val button2 = v.findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragment2_to_fragment3)
        }

        return v
    }

}