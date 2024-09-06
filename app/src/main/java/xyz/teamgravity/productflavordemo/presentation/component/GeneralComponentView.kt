package xyz.teamgravity.productflavordemo.presentation.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import xyz.teamgravity.productflavordemo.databinding.ViewGeneralComponentBinding

class GeneralComponentView : LinearLayout {

    private lateinit var binding: ViewGeneralComponentBinding

    constructor(context: Context) : super(context) {
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int)
            : super(context, attrs, defStyleAttr, defStyleRes) {
        initialize()
    }


    private fun initialize() {
        inflate()
    }

    private fun inflate() {
        binding = ViewGeneralComponentBinding.inflate(LayoutInflater.from(context), this, true)
    }
}