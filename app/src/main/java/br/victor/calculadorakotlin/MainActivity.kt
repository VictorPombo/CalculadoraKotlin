package br.victor.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import br.victor.calculadorakotlin.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculate = binding.calculate


        binding.um.setOnClickListener{
            calculate.text = "${calculate.text}1"
        }

        binding.dois.setOnClickListener{
            calculate.text = "${calculate.text}2"
        }

        binding.tres.setOnClickListener{
            calculate.text = "${calculate.text}3"
        }

        binding.quatro.setOnClickListener{
            calculate.text = "${calculate.text}4"
        }

        binding.cinco.setOnClickListener{
            calculate.text = "${calculate.text}5"
        }

        binding.seis.setOnClickListener{
            calculate.text = "${calculate.text}6"
        }

        binding.sete.setOnClickListener{
            calculate.text = "${calculate.text}7"
        }

        binding.oito.setOnClickListener{
            calculate.text = "${calculate.text}8"
        }

        binding.nove.setOnClickListener{
            calculate.text = "${calculate.text}9"
        }

        binding.zero.setOnClickListener{
            calculate.text = "${calculate.text}0"
        }

        binding.parentesesabrindo.setOnClickListener{
            calculate.text = "${calculate.text}("
        }

        binding.parentesesfechando.setOnClickListener{
            calculate.text = "${calculate.text})"
        }

        binding.divisao.setOnClickListener{
            calculate.text = "${calculate.text}÷"
        }

        binding.multiplicacao.setOnClickListener{
            calculate.text = "${calculate.text}×"
        }

        binding.subtracao.setOnClickListener{
            calculate.text = "${calculate.text}-"
        }

        binding.soma.setOnClickListener{
            calculate.text = "${calculate.text}+"
        }

        binding.ponto.setOnClickListener{
            calculate.text = "${calculate.text}."
        }

        binding.delete.setOnClickListener{
            calculate.text = calculate.text.dropLast(1)
        }

        binding.ce.setOnClickListener {
            calculate.text = ""
            binding.result.text = ""
        }

        binding.igual.setOnClickListener {
            val resultadoCalculado = Expression(calculate.text.toString()).calculate()

            if(resultadoCalculado.isNaN()){
                binding.result.text = "Expressão Inválida"
            } else {
                binding.result.text = resultadoCalculado.toString()
            }
        }








    }
}