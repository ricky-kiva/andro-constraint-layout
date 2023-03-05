package com.rickyslash.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/* Android Design Guideline Principal */
// - Show only 'important' information
// - If an app asks 'user permission', there should be a mechanism to 'deny' that permission
// - 'interrupt' if needed
// - Use 'concise' text
// - 'Protect' user data
// - Allow user do things 'fast' in 'easy way'
// - If looks the 'same', 'behavior' need to be the 'same'
// - 'Help' user to 'make decision', but 'let' 'user' 'decide' it

/* App Development Best Practice */
// - Good performance: tips, if a process need long time, then run it in background / async-ly
// - Responsive Design: give best user experience
// - Accomodate user's information needs
// - Battery Optimization
// - Design network connection efficiently