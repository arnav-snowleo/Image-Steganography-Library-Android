package com.ayush.steganographylibrary.Text;

import android.graphics.Bitmap;
import android.net.Uri;

import java.io.File;

/**
 * This main class of the text steganography
 */
public class TextSteganography {

    String message;
    String secret_key;
    Uri filepath;
    File bitmap;
    Bitmap encrypted_image;
    byte[] encrypted_zip;

    public TextSteganography() {
    }

    public TextSteganography(String message, String secret_key, File bitmap) {
        this.message = message;
        this.secret_key = secret_key;
        this.bitmap = bitmap;
    }

    public TextSteganography(String secret_key, File bitmap) {
        this.secret_key = secret_key;
        this.bitmap = bitmap;
    }

    public Bitmap getEncrypted_image() {
        return encrypted_image;
    }

    public void setEncrypted_image(Bitmap encrypted_image) {
        this.encrypted_image = encrypted_image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSecret_key() {
        return secret_key;
    }

    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }

    public File getBitmap() {
        return bitmap;
    }

    public void setBitmap(File bitmap) {
        this.bitmap = bitmap;
    }

    public byte[] getEncrypted_zip() {
        return encrypted_zip;
    }

    public void setEncrypted_zip(byte[] encrypted_zip) {
        this.encrypted_zip = encrypted_zip;
    }

    public Uri getFilepath() {
        return filepath;
    }

    public void setFilepath(Uri filepath) {
        this.filepath = filepath;
    }
}
