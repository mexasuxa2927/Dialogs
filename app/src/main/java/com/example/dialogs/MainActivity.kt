package com.example.dialogs

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                createDialogs()

            }
        })
        button2.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                createCustomDialog()

            }
        })

    }

    private fun createCustomDialog() {
        val dialog:Dialog  = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        val buttonOk  = dialog.findViewById<Button>(R.id.ok_button)
        val buttonNo  = dialog.findViewById<Button>(R.id.no_button)
        val textTitle  = dialog.findViewById<TextView>(R.id.text_title)
        val textMessage  = dialog.findViewById<TextView>(R.id.text_message)

        textTitle.setText("Pdp academy")
        textMessage.setText("Hello World")

        dialog.show()

    }

    private fun createDialogs() {
        val allerDialog  = AlertDialog.Builder(this).create()
        allerDialog.setTitle("TITLE")
        allerDialog.setMessage("Message!!")
        allerDialog.setButton(AlertDialog.BUTTON_POSITIVE ,"OK"){allerDialog ,id-> Toast
            .makeText(this,"clic ok button ",Toast.LENGTH_LONG).show()  }
        allerDialog.setButton(AlertDialog.BUTTON_NEGATIVE ,"Noo"){allerDialog,id-> Toast
            .makeText(this,"click nooo button",Toast.LENGTH_LONG).show()}
        allerDialog.show()
    }

}