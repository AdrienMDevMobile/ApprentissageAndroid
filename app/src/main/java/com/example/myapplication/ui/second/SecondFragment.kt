package com.example.myapplication.ui.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class SecondFragment : Fragment() {

    //Passer par new instance poru créé le fragment en lui donnant le nom à afficher
    companion object {
        fun newInstance(title: String?): SecondFragment {
            val fragmentSecond = SecondFragment()
            val args = Bundle()
            args.putString(MainActivity.MESSAGE_SECOND_ACTIVITE, title)
            fragmentSecond.arguments = args
            return fragmentSecond
        }
    }

    private lateinit var viewModel: SecondViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.second_fragment, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SecondViewModel::class.java)

        val message = arguments!!.getString(MainActivity.MESSAGE_SECOND_ACTIVITE, "")


        val aries = view?.findViewById<TextView>(R.id.msg2ndfragment);
        aries?.text = message
        // TODO: Use the ViewModel
    }


}
