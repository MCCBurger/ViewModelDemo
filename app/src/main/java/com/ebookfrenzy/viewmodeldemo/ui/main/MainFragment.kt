package com.ebookfrenzy.viewmodeldemo.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ebookfrenzy.viewmodeldemo.R
//import kotlinx.android.synthetic.main.main_fragment.*
//import androidx.lifecycle.Observer
import androidx.databinding.DataBindingUtil
import com.ebookfrenzy.viewmodeldemo.databinding.MainFragmentBinding
import com.ebookfrenzy.viewmodeldemo.BR.myViewModel

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    lateinit var binding:MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater,R.layout.main_fragment,container,false)
        binding.setLifecycleOwner(this)
        return binding.root
        //return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        binding.setVariable(myViewModel,viewModel)

        //resultText.text = viewModel.getResult().toString()

        //val resultObserver = Observer<Float>{
        //    result -> resultText.text = result.toString()
        //}

        //viewModel.getResult().observe(this,resultObserver)

        /*convertButton.setOnClickListener {
            if(dollarText.text.isNotEmpty()){
                viewModel.setAmount(dollarText.text.toString())
                //resultText.text = viewModel.getResult().toString()
            }
            else{
                resultText.text = "No Value"
            }
        }*/
    }

}