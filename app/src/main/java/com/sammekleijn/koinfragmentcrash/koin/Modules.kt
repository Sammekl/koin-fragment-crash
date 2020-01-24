package com.sammekleijn.koinfragmentcrash.koin

import com.sammekleijn.koinfragmentcrash.main.MainActivity
import com.sammekleijn.koinfragmentcrash.main.MainFragment
import org.koin.androidx.fragment.dsl.fragment
import org.koin.dsl.module

val fragmentModule = module {
    scope<MainActivity> {
        fragment { (title: String) -> MainFragment(title) }
    }
}