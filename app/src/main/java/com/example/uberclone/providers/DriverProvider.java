package com.example.uberclone.providers;

import com.example.uberclone.models.Cliente;
import com.example.uberclone.models.Conductor;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class DriverProvider {

    DatabaseReference mDataBase;

    public DriverProvider(){
        mDataBase = FirebaseDatabase.getInstance().getReference().child("Users").child("Conductores");
    }

    public Task<Void> create(Conductor conductor){
        Map<String, Object> map = new HashMap<>();
        map.put("name", conductor.getName());
        map.put("email", conductor.getEmail());
        map.put("vehicleBrand", conductor.getVehicleBrand());
        map.put("vehiclePlate", conductor.getVehiclePlate());
        return mDataBase.child(conductor.getId()).setValue(conductor);
    }
}
