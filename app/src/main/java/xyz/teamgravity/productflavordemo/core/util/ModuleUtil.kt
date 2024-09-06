package xyz.teamgravity.productflavordemo.core.util

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.Space
import xyz.teamgravity.productflavordemo.presentation.component.GeneralComponentView
import xyz.teamgravity.productflavordemo.presentation.component.SpecificComponentView

object ModuleUtil {

    ///////////////////////////////////////////////////////////////////////////
    // API
    ///////////////////////////////////////////////////////////////////////////

    fun getModules(context: Context): List<View> = buildList {
        add(GeneralComponentView(context))

        val space = Space(context)
        space.layoutParams = ViewGroup.LayoutParams(0, 50)
        add(space)

        add(SpecificComponentView(context))
    }
}