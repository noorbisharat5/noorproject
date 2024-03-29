package com.example.myapplication;

import android.net.Uri;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;




public class FirebaseServices {
    private static FirebaseServices instance;
    private final FirebaseAuth auth;
    private Uri selectedImageURL;
    private final FirebaseFirestore fire;
    private final FirebaseStorage storage;

    public static FirebaseServices getInstance() {
        if (instance == null)
            instance = new FirebaseServices();
        return instance;
    }


    public FirebaseAuth getAuth() {
        return auth;
    }

    public FirebaseFirestore getFire() {
        return fire;
    }

    public FirebaseStorage getStorage() {
        return storage;
    }

    public FirebaseServices() {
        auth = FirebaseAuth.getInstance();
        storage = FirebaseStorage.getInstance();
        fire = FirebaseFirestore.getInstance();
    }

    public Uri getSelectedImageURL() {
        return selectedImageURL;
    }

    public void setSelectedImageURL(Uri selectedImageURL) {
        this.selectedImageURL = selectedImageURL;
    }
}
