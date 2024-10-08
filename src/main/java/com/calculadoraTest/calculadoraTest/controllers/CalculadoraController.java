package com.calculadoraTest.calculadoraTest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.calculadoraTest.calculadoraTest.services.CalculadoraServices;
import com.calculadoraTest.utils.ApiResponse;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraServices calculadoraServices;

    @GetMapping("/suma")
    public ResponseEntity<?> sumar(@RequestParam double num1, @RequestParam double num2) {
        return ResponseEntity.ok().body(new ApiResponse("Ok", this.calculadoraServices.sumar(num1, num2)));
    }

    @GetMapping("/resta")
    public ResponseEntity<?> restar(@RequestParam double num1, @RequestParam double num2) {
        try {
            return ResponseEntity.ok().body(new ApiResponse("Ok", this.calculadoraServices.restar(num1, num2)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error", e.getMessage()));
        }
    }

    @GetMapping("/multiplicar")
    public ResponseEntity<?> multiplicar(@RequestParam double num1, @RequestParam double num2) {
        return ResponseEntity.ok().body(new ApiResponse("Ok", this.calculadoraServices.multiplicar(num1, num2)));
    }

    @GetMapping("/dividir")
    public ResponseEntity<?> dividir(@RequestParam double num1, @RequestParam double num2) {
        try {
            return ResponseEntity.ok().body(new ApiResponse("Ok", this.calculadoraServices.dividir(num1, num2)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error", e.getMessage()));
        }
    }

    @GetMapping("/potencia")
    public ResponseEntity<?> potencia(@RequestParam double num1, @RequestParam int num2) {
        try {
            return ResponseEntity.ok().body(new ApiResponse("Ok", this.calculadoraServices.potencia(num1, num2)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error", e.getMessage()));
        }
    }

    @GetMapping("/raiz")
    public ResponseEntity<?> potencia(@RequestParam double num1) {
        try {
            return ResponseEntity.ok().body(new ApiResponse("Ok", this.calculadoraServices.raiz(num1)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse("Error", e.getMessage()));
        }
    }
    // VAMOOOOS CHICOS! estamos en next level
}
