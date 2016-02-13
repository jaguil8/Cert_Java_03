/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrysi.web.springconbd.oad;

import java.io.Serializable;
import mrysi.web.springconbd.entidades.Club;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jaguilar
 */
public interface ClubOad extends JpaRepository<Club, Integer>{
    
}
