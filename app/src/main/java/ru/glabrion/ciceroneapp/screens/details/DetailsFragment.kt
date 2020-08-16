package ru.glabrion.ciceroneapp.screens.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_details.*
import ru.glabrion.ciceroneapp.R
import ru.glabrion.ciceroneapp.Screens
import ru.glabrion.ciceroneapp.common.AppConst.ALBUM_ID_KEY
import ru.glabrion.ciceroneapp.ui.base.BaseFragment

class DetailsFragment : BaseFragment() {
    companion object {
        fun getNewInstance(id: Int?): DetailsFragment {
            val detailsFragment = DetailsFragment()
            val bundle = Bundle()
            bundle.putInt(ALBUM_ID_KEY, id ?: 0)
            detailsFragment.arguments = bundle
            return detailsFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        to_general_screen.setOnClickListener { router.navigateTo(Screens.GeneralScreen()) }
    }
}