package com.masgray.findfriends.ui.friendsList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.masgray.findfriends.databinding.FragmentFriendsListScreenBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class FriendsListFragment : Fragment() {

    private var _binding: FragmentFriendsListScreenBinding? = null

    private val binding get() = _binding!!

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentFriendsListScreenBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView2.text = "MESSAGE"
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}