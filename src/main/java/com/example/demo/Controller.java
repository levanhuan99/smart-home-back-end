package com.example.demo;

import com.example.demo.model.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@RestController
public class Controller {
//    Logger logger = new Logger(Controller.class);

    @Autowired
    private LivingRoomInterface livingRoomInterface;

    @Autowired
    private BedRoomInterface bedRoomInterface;

    @GetMapping("/living-room")
    public List<LivingRoom> listAll(Model model) {
        List<LivingRoom> listRoom = livingRoomInterface.findAll();
        model.addAttribute("listRoom", listRoom);
        return listRoom;
    }

    @PostMapping("/living-room")
    public LivingRoom createLivingRoom() {
        LivingRoom listRoom = new LivingRoom();

        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy HH:mm");

            Date date = new Date();
            SimpleDateFormat formatter6 = new SimpleDateFormat("dd/mm/yyyy HH:mm");
            Date date3 = formatter6.parse(dateFormat.format(date));
            Date date2 = dateFormat.parse("30/09/2021 22:15");
            long diffInMillies = Math.abs(date3.getTime() - date2.getTime());
            long diff = TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            BedRoom bedRoom = new BedRoom();
            bedRoom.setOpenDate(date3.toString());
            bedRoom.setClose_date(date3.toString());
            bedRoom.setStatus(1);


        } catch (Exception e) {
            System.out.println(e.getCause());

        }
        return listRoom;
    }

    @PostMapping("/bed-room")
    public BedRoom createBedRoom() {
        BedRoom bedRoom = new BedRoom();

        try {

//            Date date2 = dateFormat.parse("30/09/2021 22:15");
//            long diffInMillies = Math.abs(date3.getTime() - date2.getTime());
//            long diff = TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            String dateConvert = this.convertDateToString(new Date());//current sysdate

            bedRoom.setOpenDate(dateConvert);
            bedRoom.setClose_date(dateConvert);
            bedRoom.setStatus(1);
            this.bedRoomInterface.save(bedRoom);

        } catch (Exception e) {
            System.out.println(e.getCause().toString());

        }
        return bedRoom;

    }

    private String convertDateToString(Date date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date3 = simpleDateFormat.parse(dateFormat.format(date));
        String dateConvert = dateFormat.format(date3);
        return  dateConvert;
    }

}
