package com.example.scarfold.data

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

class ShoppingViewModel : ViewModel() {
    private val _items = mutableStateListOf<ShoppingItem>()
    val items: List<ShoppingItem> = _items

    private val _selectedItem = mutableStateOf<ShoppingItem?>(null)
    val selectedItem: State<ShoppingItem?> = _selectedItem

    init {
        // Добавляем тестовые данные
        _items.addAll(
            listOf(
                ShoppingItem(1, "Молоко", 2, "2 литра"),
                ShoppingItem(2, "Хлеб", 1, "Белый"),
                ShoppingItem(3, "Яблоки", 5, "Красные")
            )
        )
    }

    fun selectItem(item: ShoppingItem) {
        _selectedItem.value = item
    }

    companion object {
        val factory = viewModelFactory {
            initializer {
                ShoppingViewModel()
            }
        }
    }
}