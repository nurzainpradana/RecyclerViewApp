package com.example.android.recyclerviewapp.screen.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.recyclerviewapp.data.Menu

class ListViewModel: ViewModel() {
    private var _menus = MutableLiveData<List<Menu>>()
    val menus: LiveData<List<Menu>>
        get() = _menus
    private lateinit var _menuList: List<Menu>

    init {
        initMenus()
    }
}