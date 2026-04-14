/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senai.gerenciamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class FuncionarioController {
    
    @GetMapping("/Funcionarios")
    public String getFuncionarios() {
        return "funcionarios";
    }
}
