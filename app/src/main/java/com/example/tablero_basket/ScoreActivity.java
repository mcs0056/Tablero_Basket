package com.example.tablero_basket;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tablero_basket.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    private ActivityScoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int local = getIntent().getIntExtra(MainActivity.KEY_LOCAL, 0);
        int visitante = getIntent().getIntExtra(MainActivity.KEY_VISITANTE, 0);

        binding.txtResultado.setText(local + " - " + visitante);

        if (local > visitante) {
            binding.txtMensaje.setText(getString(R.string.gana_local));
            binding.imgResultado.setImageResource(R.drawable.ic_copa);
        } else if (visitante > local) {
            binding.txtMensaje.setText(getString(R.string.gana_visitante));
            binding.imgResultado.setImageResource(R.drawable.ic_medalla);
        } else {
            binding.txtMensaje.setText(getString(R.string.empate));
            binding.imgResultado.setImageResource(R.drawable.ic_suenio);
        }

        binding.btnVolver.setOnClickListener(v -> {
            setResult(RESULT_OK);
            finish();
        });
    }
}
