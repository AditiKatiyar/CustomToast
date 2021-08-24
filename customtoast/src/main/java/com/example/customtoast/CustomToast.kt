package com.example.customtoast

import android.content.Context
import android.util.Log
import android.widget.Toast

class CustomToast {

    /**
     * link within same class {@link #printMessage}
     * link within same package {@link Dummy1#printMessageInDummy1}
     * link in another package {@link com.example.customtoast.tmp.Dummy2#printMessageInDummy2}
     * link to a class {@link Dummy1}
     * link to a class in another package {@link com.example.customtoast.tmp.Dummy2}
     * */
    fun showMessage(context: Context, message: String) =
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()

    private fun printMessage(message: String) =
        Log.d("TAG", message)
}