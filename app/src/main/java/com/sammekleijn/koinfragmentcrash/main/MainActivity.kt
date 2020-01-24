package com.sammekleijn.koinfragmentcrash.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sammekleijn.koinfragmentcrash.R
import org.koin.androidx.fragment.android.setupKoinFragmentFactory
import org.koin.androidx.scope.lifecycleScope
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        setupKoinFragmentFactory(lifecycleScope)

        // Uncomment the following line and the issue should be removed when the Activity is recreated
//        savedInstanceState?.remove("android:support:fragments")
        super.onCreate(savedInstanceState)

        val fragment: MainFragment by lifecycleScope.inject { parametersOf("Some title") }

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment, "MAIN_FRAGMENT")
            .commit()
    }
}
