package com.example.tablero_basket;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tablero_basket.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ScoreViewModel viewModel;
    public static final String KEY_LOCAL = "local";
    public static final String KEY_VISITANTE = "visitante";
    private static final int REQUEST_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(ScoreViewModel.class);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        // Botones Local
        binding.btnLocal1.setOnClickListener(v -> viewModel.addLocal(1));
        binding.btnLocal2.setOnClickListener(v -> viewModel.addLocal(2));
        binding.btnLocal3.setOnClickListener(v -> viewModel.addLocal(3));
        binding.btnLocal4.setOnClickListener(v -> viewModel.addLocal(-1));

        // Botones Visitante
        binding.btnVis1.setOnClickListener(v -> viewModel.addVis(1));
        binding.btnVis2.setOnClickListener(v -> viewModel.addVis(2));
        binding.btnVis3.setOnClickListener(v -> viewModel.addVis(3));
        binding.btnVis4.setOnClickListener(v -> viewModel.addVis(-1));

        // Reset
        binding.btnReset.setOnClickListener(v -> {
            viewModel.reset();
        });

        // Ir a ScoreActivity
        binding.btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, ScoreActivity.class);
            intent.putExtra(KEY_LOCAL, viewModel.getLocalScore().getValue());
            intent.putExtra(KEY_VISITANTE, viewModel.getVisitanteScore().getValue());
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    //Método para reinicar los marcadores al volver de ScoreActivity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE){
            viewModel.reset();
        }
    }
}