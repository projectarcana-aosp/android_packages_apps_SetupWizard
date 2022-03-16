package com.arcana.setupwizard.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.PreferenceFragmentCompat

import com.arcana.setupwizard.Page
import com.arcana.setupwizard.R

class IdlePage : Page() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        savedInstanceState ?: childFragmentManager.beginTransaction()
            .add(R.id.idle_pref, SettingsPreference(), "SettingsPreference").commit()
        return inflater.inflate(R.layout.fragment_idle_page, container, false)
    }

    class SettingsPreference : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.idle, rootKey)
        }
    }
}
