/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.com.gm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.com.gm.domain.Persona;
/**
 *
 * @author juan9
 */
public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
