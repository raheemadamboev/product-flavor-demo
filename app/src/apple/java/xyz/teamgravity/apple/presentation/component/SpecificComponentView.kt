package xyz.teamgravity.apple.presentation.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import xyz.teamgravity.productflavordemo.databinding.ViewSpecificComponentBinding

class SpecificComponentView : LinearLayout {

    private lateinit var binding: ViewSpecificComponentBinding

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
        binding = ViewSpecificComponentBinding.inflate(LayoutInflater.from(context), this, true)
    }
}