package com.example.practike14

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




        val arguments: Bundle? = intent.extras

        if (arguments != null){
            val mail1 = arguments.get("mail").toString()
            val name1 = arguments.get("name").toString()
            val age1 = arguments.get("age").toString()
            val name = findViewById<EditText>(R.id.editTextName1)
            val age = findViewById<EditText>(R.id.editTextAge1)
            val mail = findViewById<EditText>(R.id.editTextMail1)
            mail.text=mail1.toEditable()
            name.text=name1.toEditable()
            age.text=age1.toEditable()




        }


    }

    fun sendClick(view: View) {
        val name = findViewById<EditText>(R.id.editTextName1)
        val age = findViewById<EditText>(R.id.editTextAge1)
        val mail = findViewById<EditText>(R.id.editTextMail1)
        val updatedEmail = mail.text.toString()
        val updatedName = name.text.toString()
        val updatedAge = age.text.toString()

        val intent: Intent =
        Intent(this@MainActivity2, MainActivity::class.java)


        intent.putExtra("mail", updatedEmail)
        intent.putExtra("name", updatedName)
        intent.putExtra("age", updatedAge)
        startActivity(intent)
    }
} fun String.toEditable():Editable=Editable.Factory.getInstance().newEditable(this)






