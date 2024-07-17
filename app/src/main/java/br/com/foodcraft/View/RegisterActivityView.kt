package br.com.foodcraft.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.foodcraft.View.ui.main.RegisterActivityViewFragment

class RegisterActivityView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activity_view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RegisterActivityViewFragment.newInstance())
                .commitNow()
        }
    }
}