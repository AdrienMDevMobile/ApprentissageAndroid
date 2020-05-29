package com.example.myapplication.ui.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val aries = view?.findViewById<Button>(R.id.btnGo2ndActivity)
        aries?.setOnClickListener { onGoSecondFragmentClick(it) }
    }


    private var listener: onMvmtClickListener? = null

    public interface onMvmtClickListener {
        fun onNextActivityClick(name1: String)
    }

    // Store the listener (activity) that will have events fired once the fragment is attached
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is onMvmtClickListener) {
            listener = context
        } else {
            throw ClassCastException(
                "$context must implement nMvmtClickListener"
            )
        }
    }

    fun onGoSecondFragmentClick(v: View?) {
        val nom = view?.findViewById<EditText>(R.id.edt2ndActEditText)
        listener?.onNextActivityClick(nom?.text.toString())
    }


}
