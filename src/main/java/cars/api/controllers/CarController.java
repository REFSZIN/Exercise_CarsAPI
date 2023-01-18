package cars.api.controllers;

import cars.api.dtos.CarDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cars")
public class CarController {
    @PostMapping(value = "add")
    public String addCar(@RequestBody CarDTO carDTO){
        System.out.println(carDTO.modelo());
        System.out.println(carDTO.anoModelo());
        System.out.println(carDTO.dataFabricacao());
        return "Carro adicionado!";
    }
}
