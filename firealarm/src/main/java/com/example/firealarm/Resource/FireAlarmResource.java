package com.example.firealarm.Resource;


import com.example.firealarm.Repository.FireAlarmRepo;
import com.example.firealarm.model.Roomdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


import java.util.List;

@RestController
@RequestMapping(value="/rest/firealarm")
@CrossOrigin(origins = "http://localhost:3000")

public class FireAlarmResource {

@Autowired
FireAlarmRepo fireAlarmRepo;

@GetMapping("/all")
public List<Roomdetails> showall(){
   return fireAlarmRepo.findAll();
}

@PostMapping(path = "/roomDetails")
public void addRoom(@RequestBody Roomdetails roomDetails) {
        fireAlarmRepo.save(roomDetails);
  }
   
@DeleteMapping("/roomDetails/{id}")
  public void deleteEmployee(@PathVariable Long id) {
    fireAlarmRepo.deleteById(id);
  } 
   
}
