package com.example.uberclone.providers;

import com.example.uberclone.models.Cliente;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ClientProvider {

    DatabaseReference mDataBase;

    public ClientProvider(){
        mDataBase = FirebaseDatabase.getInstance().getReference().child("Users").child("Clientes");
    }

    public Task<Void> create(Cliente client){
        Map<String, Object> map = new HashMap<>();
        map.put("name", client.getName());
        map.put("email", client.getEmail());
        return mDataBase.child(client.getId()).setValue(map);
    }

}
