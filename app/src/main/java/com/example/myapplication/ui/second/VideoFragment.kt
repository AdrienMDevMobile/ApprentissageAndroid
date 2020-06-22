package com.example.myapplication.ui.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.MainActivity
import com.example.myapplication.R

class VideoFragment : Fragment() {

    //Passer par new instance pour créé le fragment en lui donnant le nom à afficher
    companion object {
        fun newInstance(title: String?): VideoFragment {
            val fragmentSecond = VideoFragment()
            val args = Bundle()
            args.putString(MainActivity.MESSAGE_SECOND_ACTIVITE, title)
            fragmentSecond.arguments = args
            return fragmentSecond
        }
    }

    private lateinit var viewModel: VideoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.video_fragment, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VideoViewModel::class.java)
    }


}