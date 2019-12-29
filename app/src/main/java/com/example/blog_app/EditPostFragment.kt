package com.example.blog_app

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.add_post_fragment.*


class EditPostFragment : Fragment() {

    lateinit var option: Spinner
    companion object {
        fun newInstance() = EditPostFragment()
    }

    private lateinit var viewModel: EditPostViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.add_post_fragment, container, false)
        val spinner = view.findViewById(R.id.spinner) as Spinner
        val edit = view.findViewById<EditText>(R.id.post)
        val error1 =view.findViewById<TextView>(R.id.error1)

        option = spinner

        val categories = arrayListOf("Choose Category", "Sport", "News", "Entertainment", "Fashion", "Travel")
        option.adapter = ArrayAdapter<String>(
            requireActivity(),
            android.R.layout.simple_list_item_1,
            categories
        )

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                if(categories.get(position)!="Choose Category"){
                    error1.visibility= View.GONE
                    option.setBackgroundResource(R.drawable.edittext)
                }
                addPost.setOnClickListener{ view ->

                    if(categories.get(position)=="Choose Category"){
                        error1.visibility= View.VISIBLE
//                        option.setBackgroundResource(R.drawable.edittexterror)
                    }else{

                        error1.visibility= View.GONE
                    }
//
                    if(edit.text.isEmpty()){
                        error1.visibility= View.VISIBLE
//                        edit.setBackgroundResource(R.drawable.edittexterror)
                    }else{
                        error1.visibility = View.GONE
                    }
                }

                edit.addTextChangedListener(object : TextWatcher {
                    override fun afterTextChanged(s : Editable?){}
                    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    }
                    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                        error1.visibility = View.GONE
                        edit.setBackgroundResource(R.drawable.edittext)

                    }
                })
            }
        }

        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EditPostViewModel::class.java)
        // TODO: Use the ViewModel
    }

}