package com.example.helpme.data

import com.example.helpme.R
import com.example.helpme.modal.Help

class Datasource {
    fun loadData(): List<Help> {
        return listOf<Help>(
            Help(R.string.help_title1, R.string.help_value1, R.drawable.help_image1),
            Help(R.string.help_title2, R.string.help_value2, R.drawable.help_image2),
            Help(R.string.help_title3, R.string.help_value3, R.drawable.help_image3),
            Help(R.string.help_title4,R.string.help_value4, R.drawable.help_image4)
        );
    }
}