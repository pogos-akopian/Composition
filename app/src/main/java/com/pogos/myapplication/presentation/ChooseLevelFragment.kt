package com.pogos.myapplication.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pogos.myapplication.R
import com.pogos.myapplication.databinding.FragmentChooseLevelBinding
import com.pogos.myapplication.domain.entity.Level

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChooseLevelFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChooseLevelFragment : Fragment() {

    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: throw RuntimeException("FragmentChooseLevelBinding == null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            buttonLevelTest.setOnClickListener{
                launchGameFragment(Level.TEST)
            }
            buttonLevelEasy.setOnClickListener{
                launchGameFragment(Level.EASY)
            }
            buttonLevelNormal.setOnClickListener{
                launchGameFragment(Level.NORMAL)
            }
            buttonLevelHard.setOnClickListener{
                launchGameFragment(Level.HARD)
            }
        }

    }

    private fun launchGameFragment(level:Level) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, GameFragment.newInstance(level))
            .addToBackStack(GameFragment.NAME)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        const val NAME = "ChooseLevelFragment"

        fun newInstance() = ChooseLevelFragment()
    }
}