package com.example.uberclone.providers;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class TokenProvider {

    DatabaseReference mDatabase;

    public TokenProvider() {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Tokens");
    }

    /*public void create(String idUser) {
        if (idUser == null) return;
        FirebaseInstanceId.getInstanceId().addOnSuccessListener(new OnSuccessListener<InstanceIdResult>() {
            @Override
            public void onSuccess(InstanceIdResult instaceIdResult) {
                Token token = new Token(instaceIdResult.getToken());
                mDatabase.child(idUser).setValue(token);
            }
        });
    }*/

    public DatabaseReference getToken(String idUser) {
        return mDatabase.child(idUser);
    }

    private static class FirebaseInstanceId {
    }

    private class InstanceIdResult {
    }
}
