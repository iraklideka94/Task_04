package com.example.classwork_04

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.classwork_04.databinding.FragmentGameBinding


class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(layoutInflater, container, false)



        binding.restartBtn.visibility = View.INVISIBLE

        binding.btn1.setOnClickListener {
            selectedButton(binding.btn1)
        }

        binding.btn2.setOnClickListener {
            selectedButton(binding.btn2)
        }

        binding.btn3.setOnClickListener {
            selectedButton(binding.btn3)
        }

        binding.btn4.setOnClickListener {
            selectedButton(binding.btn4)
        }

        binding.btn5.setOnClickListener {
            selectedButton(binding.btn5)
        }
        binding.btn6.setOnClickListener {
            selectedButton(binding.btn6)
        }
        binding.btn7.setOnClickListener {
            selectedButton(binding.btn7)
        }

        binding.btn8.setOnClickListener {
            selectedButton(binding.btn8)
        }

        binding.btn9.setOnClickListener {
            selectedButton(binding.btn9)
        }

        binding.restartBtn.setOnClickListener {
            restart()
        }
        return binding.root
    }


    fun selectedButton(view: View) {
        val selectedBtn = view as Button
        var btnNum = 0
        when (selectedBtn.id) {
            R.id.btn1 -> btnNum = 1
            R.id.btn2 -> btnNum = 2
            R.id.btn3 -> btnNum = 3
            R.id.btn4 -> btnNum = 4
            R.id.btn5 -> btnNum = 5
            R.id.btn6 -> btnNum = 6
            R.id.btn7 -> btnNum = 7
            R.id.btn8 -> btnNum = 8
            R.id.btn9 -> btnNum = 9
        }

        game(btnNum, selectedBtn)
    }

    var player = 1
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()

    fun game(cell: Int, selectedBtn: Button) {
        binding.restartBtn.visibility = View.INVISIBLE
        if (player == 1) {
            selectedBtn.text = "O"
            selectedBtn.setBackgroundColor(Color.parseColor("#FF0000"))
            player1.add(cell)
            player = 4
        } else {
            selectedBtn.text = "X"
            selectedBtn.setBackgroundColor(Color.parseColor("#0000FF"))
            player = 1
            player2.add(cell)
        }
        selectedBtn.isEnabled = false
        neutral()
        //row1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        //row2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        //row3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        //clmn1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        //clmn2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        //clmn3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        //
        //
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        //
        //
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            Toast.makeText(context, "Player1 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            Toast.makeText(context, "Player2 Won", Toast.LENGTH_SHORT).show()
            disableButton()
        }

    }

    fun restart() {
        player1.clear()
        player2.clear()

        binding.btn1.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn2.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn3.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn4.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn5.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn6.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn7.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn8.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn9.setBackgroundColor(Color.parseColor("#DFDEDE"))
        binding.btn1.text = ""
        binding.btn2.text = ""
        binding.btn3.text = ""
        binding.btn4.text = ""
        binding.btn5.text = ""
        binding.btn6.text = ""
        binding.btn7.text = ""
        binding.btn8.text = ""
        binding.btn9.text = ""
        binding.btn1.isEnabled = true
        binding.btn2.isEnabled = true
        binding.btn3.isEnabled = true
        binding.btn4.isEnabled = true
        binding.btn5.isEnabled = true
        binding.btn6.isEnabled = true
        binding.btn7.isEnabled = true
        binding.btn8.isEnabled = true
        binding.btn9.isEnabled = true
    }

    fun neutral() {
        if (player1.size == 4 && player2.size == 4) {
            disableButton()
        } else if (player1.size > 4 || player2.size > 4) {

        }
    }

    fun disableButton() {
        binding.btn1.isEnabled = false
        binding.btn2.isEnabled = false
        binding.btn3.isEnabled = false
        binding.btn4.isEnabled = false
        binding.btn5.isEnabled = false
        binding.btn6.isEnabled = false
        binding.btn7.isEnabled = false
        binding.btn8.isEnabled = false
        binding.btn9.isEnabled = false
        binding.restartBtn.visibility = View.VISIBLE

    }
}