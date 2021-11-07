package com.worldsnas.navigationlogger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        lifecycle.addObserver(LifecycleLogger("DialogActivity"))


        val button = findViewById<Button>(R.id.dialogLauncher)
        button.setOnClickListener {
            createAndLaunchDialog()
        }
    }

    private fun createAndLaunchDialog() {
        AlertDialog.Builder(this)
            .setTitle("Some Dialog")
            .setMessage("Check logs to see the lifecycle")
            .setNegativeButton("close me") { dialog, _ ->
                dialog.cancel()
            }
            .create()
            .show()
    }
}