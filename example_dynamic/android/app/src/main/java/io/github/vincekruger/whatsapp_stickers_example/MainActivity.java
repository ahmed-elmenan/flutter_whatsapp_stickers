package io.github.vincekruger.whatsapp_stickers_example;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.github.vincekruger.whatsapp_stickers.WhatsAppStickersPlugin; // Add this import

public class MainActivity extends FlutterActivity {
  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
    super.configureFlutterEngine(flutterEngine);
    // This ensures all plugins are registered
    GeneratedPluginRegistrant.registerWith(flutterEngine);
    
    // If needed, manually register the WhatsApp stickers plugin
    // WhatsAppStickersPlugin.registerWith(flutterEngine.getDartExecutor().getBinaryMessenger());
  }
}