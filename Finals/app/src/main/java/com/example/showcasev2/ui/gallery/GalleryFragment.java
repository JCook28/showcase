package com.example.showcasev2.ui.gallery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.showcasev2.databinding.FragmentGalleryBinding;

import java.util.Random;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    private Button adventureOneB, adventureTwoB, adventureThreeB, randomB, submitB, newStoryB;
    private TextView titleTxT, monsterTxT, kitsuneTxT, ghostBuffetTxT;
    private EditText choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        adventureOneB = binding.adventureOne;
        adventureTwoB = binding.adventureTwo;
        adventureThreeB = binding.adventureThree;
        randomB = binding.randomAdventure;
        submitB = binding.submitBtn;
        newStoryB = binding.newMadBtn;

        titleTxT = binding.textGallery;
        monsterTxT = binding.monsterTxT;
        kitsuneTxT = binding.kitsuneTxT;
        ghostBuffetTxT = binding.ghostBuffetTxT;

        choice1 = binding.choice1;
        choice2 = binding.choice2;
        choice3 = binding.choice3;
        choice4 = binding.choice4;
        choice5 = binding.choice5;
        choice6 = binding.choice6;
        choice7 = binding.choice7;
        choice8 = binding.choice8;

        hideStory();
        hideInputs();

        adventureOneB.setOnClickListener(v -> adventureOne());
        adventureTwoB.setOnClickListener(v -> adventureTwo());
        adventureThreeB.setOnClickListener(v -> adventureThree());
        randomB.setOnClickListener(v -> randomAdventure());
        newStoryB.setOnClickListener(v -> reset());

        return root;
    }

    private void hideInputs() {
        choice1.setVisibility(View.GONE);
        choice2.setVisibility(View.GONE);
        choice3.setVisibility(View.GONE);
        choice4.setVisibility(View.GONE);
        choice5.setVisibility(View.GONE);
        choice6.setVisibility(View.GONE);
        choice7.setVisibility(View.GONE);
        choice8.setVisibility(View.GONE);
        submitB.setVisibility(View.GONE);
    }

    private void showInputs() {
        choice1.setVisibility(View.VISIBLE);
        choice2.setVisibility(View.VISIBLE);
        choice3.setVisibility(View.VISIBLE);
        choice4.setVisibility(View.VISIBLE);
        choice5.setVisibility(View.VISIBLE);
        choice6.setVisibility(View.VISIBLE);
        choice7.setVisibility(View.VISIBLE);
        choice8.setVisibility(View.VISIBLE);
        submitB.setVisibility(View.VISIBLE);
    }

    private void hideStory() {
        monsterTxT.setVisibility(View.GONE);
        kitsuneTxT.setVisibility(View.GONE);
        ghostBuffetTxT.setVisibility(View.GONE);
        newStoryB.setVisibility(View.GONE);
    }

    private void hideMenu() {
        adventureOneB.setVisibility(View.GONE);
        adventureTwoB.setVisibility(View.GONE);
        adventureThreeB.setVisibility(View.GONE);
        randomB.setVisibility(View.GONE);
    }

    private void adventureOne() {
        hideMenu();
        titleTxT.setText("Pick Choices");
        showInputs();

        choice1.setHint("Insert Sound");
        choice2.setHint("Insert a Place");
        choice3.setHint("Insert an Object");
        choice4.setHint("Insert a Creature");
        choice5.setHint("Insert an Adjective");
        choice6.setHint("Insert a BodyPart (Plural)");
        choice7.setHint("Insert a Phrase");
        choice8.setHint("Insert a Color");

        submitB.setOnClickListener(v -> {
            hideInputs();
            newStoryB.setVisibility(View.VISIBLE);

            monsterTxT.setText("It was a dark and stormy night when I heard a " + choice1.getText().toString() + " coming from the " + choice2.getText().toString() + ". Curious (and maybe a little foolish), I grabbed my " + choice3.getText().toString() + " and crept closer. That's when I saw it...a monstrous " + choice4.getText().toString() + " with " + choice5.getText().toString() + " eyes and " + choice6.getText().toString() + " that glowed in the dark! The creature snarled, then suddenly shouted, '" + choice7.getText().toString() + "!' before running off into the night. Now, every full moon, I can still hear that same " + choice1.getText().toString() + " echoing through the " + choice2.getText().toString() + "... and I swear, sometimes I catch a glimpse of its " + choice8.getText().toString() + " shadow watching me from afar."
            );

            monsterTxT.setVisibility(View.VISIBLE);
            titleTxT.setText("Monster");
        });
    }

    private void adventureTwo() {
        hideMenu();
        titleTxT.setText("Pick Choices");
        showInputs();

        choice1.setHint("Insert Place");
        choice2.setHint("Insert Object");
        choice3.setHint("Insert Adjective");
        choice4.setHint("Insert Number");
        choice5.setHint("Insert Emotion");
        choice6.setHint("Insert Verb");
        choice7.setHint("Insert Magical Creature/Object");
        choice8.setHint("Insert Scent");

        submitB.setOnClickListener(v -> {
            hideInputs();
            newStoryB.setVisibility(View.VISIBLE);

            kitsuneTxT.setText("Deep in the " + choice1.getText().toString() + ", I stumbled upon a mysterious " + choice2.getText().toString() + " glowing under the moonlight. As I reached out to touch it, a " + choice3.getText().toString() + " fox appeared...but it had " + choice4.getText().toString() + " tails swaying behind it! The fox spoke in a " + choice5.getText().toString() + " voice, saying 'Mortal, you've found my treasure. To keep it, you must " + choice6.getText().toString() + " before sunrise.' I hesitated, but the kitsune smiled slyly and transformed into a " + choice7.getText().toString() + ". When the sun rose, all that remained was a faint scent of " + choice8.getText().toString() + " and a single fox tail drifting in the breeze."
            );

            kitsuneTxT.setVisibility(View.VISIBLE);
            titleTxT.setText("Kitsune");
        });
    }

    private void adventureThree() {
        hideMenu();
        titleTxT.setText("Pick Choices");
        showInputs();

        choice1.setHint("Abandoned Place");
        choice2.setHint("Utensil");
        choice3.setHint("Strange Food");
        choice4.setHint("Plural Noun");
        choice5.setHint("Slimy Substance");
        choice6.setHint("Adjective");
        choice7.setHint("Cursed Object");
        choice8.setHint("Your Name");

        submitB.setOnClickListener(v -> {
            hideInputs();
            newStoryB.setVisibility(View.VISIBLE);

            ghostBuffetTxT.setText("It all started when I wandered into " + choice1.getText().toString() + " and found a glowing sign that read \"All Spirits Welcome!\" Inside, a ghostly waiter handed me a " + choice2.getText().toString() + " and pointed to a buffet table filled with " + choice3.getText().toString() + ". I tried to be polite and sampled a dish made of " + choice4.getText().toString() + " and " + choice5.getText().toString() + " — it tasted surprisingly " + choice6.getText().toString() + ". The ghosts around me laughed, their voices echoing like broken music boxes. Then the room grew cold. " + "The lights flickered. The head chef floated closer and whispered, \"Congratulations… you’ve just eaten the " + choice7.getText().toString() + ".\" Before everything went dark, I heard the waiter say, \"Welcome to the staff, " + choice8.getText().toString() + " — you’ll be serving forever.\""
            );

            ghostBuffetTxT.setVisibility(View.VISIBLE);
            titleTxT.setText("Ghost Buffet");
        });
    }

    private void randomAdventure() {
        int pick = new Random().nextInt(3);
        if (pick == 0) adventureOne();
        else if (pick == 1) adventureTwo();
        else adventureThree();
    }

    private void reset() {
        hideStory();
        titleTxT.setText("Choose a Madlib!");

        adventureOneB.setVisibility(View.VISIBLE);
        adventureTwoB.setVisibility(View.VISIBLE);
        adventureThreeB.setVisibility(View.VISIBLE);
        randomB.setVisibility(View.VISIBLE);

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");
        choice6.setText("");
        choice7.setText("");
        choice8.setText("");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}