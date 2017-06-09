package com.pkeselman.pickup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.TextView

import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private var mEmailView: EditText? = null
    private var mPasswordView: EditText? = null
    private var mConfirmPasswordView: EditText? = null
    private var mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mEmailView = findViewById(R.id.register_email) as EditText
        mPasswordView = findViewById(R.id.register_password) as EditText
        mConfirmPasswordView = findViewById(R.id.register_confirm_password) as EditText
        mPasswordView!!.setOnEditorActionListener(TextView.OnEditorActionListener { textView, id, keyEvent ->
            if (id == R.id.login || id == EditorInfo.IME_NULL) {
                attemptLogin()
                return@OnEditorActionListener true
            }
            false
        })

        mAuth = FirebaseAuth.getInstance()
    }




}
