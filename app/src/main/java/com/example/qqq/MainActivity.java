package com.example.qqq;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int currentImageIndex = 0;
    private int[] imageResources = {
            R.drawable.example_image1,
            R.drawable.example_image2,
            R.drawable.example_image3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем ссылки на View
        ImageView imageView = findViewById(R.id.image_view);
        TextView textView = findViewById(R.id.text_view);
        Button nextButton = findViewById(R.id.next_button);

        // Устанавливаем начальное изображение
        imageView.setImageResource(imageResources[currentImageIndex]);

        // Устанавливаем текст
        textView.setText(R.string.example_text);

        // Обрабатываем нажатие на кнопку "Следующее"
        nextButton.setOnClickListener(v -> {
            currentImageIndex = (currentImageIndex + 1) % imageResources.length;
            imageView.setImageResource(imageResources[currentImageIndex]);
        });
    }
}
