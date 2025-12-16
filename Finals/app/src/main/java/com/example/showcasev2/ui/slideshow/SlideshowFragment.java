package com.example.showcasev2.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.showcasev2.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
//helped with the format from ChatGPT
        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.generateBTN.setOnClickListener(v -> {

            String firstNameStr = binding.firstTXT.getText().toString();
            String lastNameStr = binding.lastTXT.getText().toString();
            String cityStr = binding.cityTXT.getText().toString();
            String schoolStr = binding.schoolTXT.getText().toString();
            String petOrFoodStr = binding.petFoodTXT.getText().toString();
            String sibOrCharStr = binding.sibCharacterTXT.getText().toString();

            if (firstNameStr.length() < 2 || lastNameStr.length() < 3 ||
                    cityStr.length() < 2 || schoolStr.length() < 3 ||
                    petOrFoodStr.length() < 2 || sibOrCharStr.length() < 3) {

                binding.fullNameTxt.setText("Please fill out all fields.");
                return;
            }

            String sciFiFirst = firstNameStr.substring(0, 2)
                    + lastNameStr.substring(0, 3);
            String sciFiLast = cityStr.substring(0, 2)
                    + schoolStr.substring(0, 3);
            String sciFiOrigin = petOrFoodStr.substring(0, 2)
                    + sibOrCharStr.substring(sibOrCharStr.length() - 3);

            binding.fullNameTxt.setText(
                    sciFiFirst + " " + sciFiLast + " from the planet " + sciFiOrigin
            );
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}